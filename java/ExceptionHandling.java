public class ExceptionHandling {
    public static void main(String[] args) {
        someMethod();

    }


    public static void someMethod() {
        long i = 1;
        while(true){
            i += 10;
        }
    }
}