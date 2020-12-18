package com.cts.training;

public class Application {

    static String myStaticVar;
//
//    class Math
//    {
//
//        int a;
//
//        int b;
//
//        public int add(int a, int b)
//        {
//            int c = a + b;
//            return c;
//        }
//
//    }

    public static void main(String[] args) {

        boolean b = false;

        Integer i = 0;

        if (b) {
            System.out.println("b is true");
        }

        if (i >= 0)
            if (i <= 5)
                if (i >= 3)
                    if (i == 4)
                        System.out.println("i is 4");

        try{
            System.out.println("Static var = " + myStaticVar);

            String dummy_var = "";

            if(args.length > 0)
                dummy_var = args[0];
            if (dummy_var == "something")
                System.out.println("Found the correct value: " + dummy_var);
            else if(dummy_var != "")
                System.out.println("Not foundwhat am looking for");
            else
                System.out.println("Pass some value please");
        }catch (Throwable t){
            t.printStackTrace();
        }
    }
}
