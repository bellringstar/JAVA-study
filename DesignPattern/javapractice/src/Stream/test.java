package Stream;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private int age;
    private int cost;

    public Customer(String name, int age, int cost){
        this.name = name;
        this.age = age;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cost=" + cost +
                '}';
    }
}
public class test {
    public static void main(String[] args) {

        Customer customerLee = new Customer("이순신", 40, 100);
        Customer customerKim = new Customer("김유신", 20, 50);
        Customer customerHong = new Customer("홍길동", 30, 100);
        
        List<Customer> customerList = new ArrayList<>();


        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("customerList.toSti = " + customerList.toString());

        customerList.stream().forEach(s-> System.out.println("s.getName() = " + s.getName()));
    
        int price = customerList.stream().mapToInt(c->c.getCost()).sum();
        System.out.println("price = " + price);
        
        int price2 = customerList.stream().filter(c->c.getAge()>=30).mapToInt(c->c.getCost()).sum();
        System.out.println("price2 = " + price2);
    }
}
