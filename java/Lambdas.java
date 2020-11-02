public class Lambdas {
    public static void main(String[] args) {

        Greeting g = new Greeting();
        
        g.execute(new Greet(){
            @Override
            public void action() {
                System.out.println("something..");
            }
        });
    }
}

class Greeting {

    public void execute(Greet g) {
        g.action();
    }
}

interface Greet {
    public void action();
}

