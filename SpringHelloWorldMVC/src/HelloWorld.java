import org.springframework.context.annotation.Bean;

public class HelloWorld {
    private String helloMessage;

   
    public void getHelloMessage() {
        System.out.println("Hello message:" + helloMessage);
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }
}
