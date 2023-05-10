import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        List<Integer> numbers = new ArrayList<>();
        int answer = 0;
        int p = 0;
        int q = 0;
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<4; i++){
            int key = numbers.get(i);
            int value = (int)numbers.stream().filter(n->n==key).count();
            map.put(key,value);
        }
        if(map.containsValue(4)){
            for(int key : map.keySet()){
                return key*1111;
            }
        }else if(map.containsValue(3)){
            for(int key : map.keySet()){
                if (map.get(key) == 3){
                    p = key;
                }else{
                    q = key;
                }
            } return (int)Math.pow((10*p + q),2);
        }else if(map.containsValue(2)){
            answer = 1;
            if(map.containsValue(1)){
                for(int key : map.keySet()){
                    if(map.get(key) != 2){
                        answer *= key;
                    }
                }
                return answer;
            }
            else{
                for(int key : map.keySet()){
                    Object[] lst = map.keySet().toArray();
                    p = (int) lst[0];
                    q = (int) lst[1];
                    return (p+q) * Math.abs(p-q);
                }
            }
        }
        else{
            int min = 7;
            for(int key : map.keySet()){
                if(key<min){
                    min = key;
                }
            }
            return min;
        }
        return answer;
    }
}