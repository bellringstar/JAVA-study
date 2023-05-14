package exception;

public class CustomException {

    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) throws PasswordException{
        if(password == null) {
            throw new PasswordException("비밀번호는 null 일 수 없습니다.");
        }
        else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
        }
        else if (password.matches("[a-zA-Z]+")){
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
        }

        this.password = password;
    }

    public static void main(String[] args) {
        CustomException test = new CustomException();
        String password = null;

        try{
            test.setPassword(password);
            System.out.println("오류 없음1");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcd";

        try{
            test.setPassword(password);
            System.out.println("오류 없음 2");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcde";

        try{
            test.setPassword(password);
            System.out.println("오류 없음 3");
        } catch (PasswordException e){
            System.out.println(e);
        }

        password = "as123s";
        try{
            test.setPassword(password);
            System.out.println("오류 없음 4");
        } catch (PasswordException e){
            System.out.println(e);
        }
    }
}
