public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base64 encoding

        // url encoding
        IEncoder encoder = new Base64Encoder();
        String result = encoder.encode(url);

        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println("result = " + result);
        System.out.println("urlResult = " + urlResult);
    }
}