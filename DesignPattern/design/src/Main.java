
import strategy.Base64Strategy;
import strategy.Encoder;
import strategy.EncodingStrategy;
import strategy.NormalStrategy;


public class Main {

    public static void main(String[] args) {

        Encoder encoder = new Encoder();

        EncodingStrategy base64 = new Base64Strategy();

        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);
    }
}