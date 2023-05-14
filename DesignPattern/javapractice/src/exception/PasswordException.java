package exception;

// 사용자 정의 예외
public class PasswordException extends Exception{

    public PasswordException(String message){
        super(message);
    }
}
