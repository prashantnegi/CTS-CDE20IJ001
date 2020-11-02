public class HelloWorld {

    public static void main(String[] args) {
        main();
    }

    public static void main() {
        Greeting greetObj = new Greeting();
        greetObj.greet();
    }
}

class Greeting {

    public void greet() {
        System.out.println("Welcome to Java..");
    }

}