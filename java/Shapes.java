public class Shapes {

    public float areaOfCircle(float radius) {
        float PI = 3.14f;
        float area = PI * (radius * radius);
        return area;
    }

    public float areaOfSquare(float side) {
        float area = side * side;
        return area;
    }

    public float areaOfrectangle(float length, float breadth) {
        float area = length * breadth;
        return area;
    }

    public static void main(String[] args) {

        Shapes shapeObj = new Shapes();

        Float radius = 5f; //auto boxing

        Float side = 5f;

        Float length = 3f;
        Float breadth = 4f;

        System.out
                .println("Area of Circle with radius " + radius.floatValue() + " is " 
                + shapeObj.areaOfCircle(radius));
        System.out.println("Area of Square is " + shapeObj.areaOfSquare(side));
        System.out.println("Area of Rectangle is " + shapeObj.areaOfrectangle(length, breadth));


        String intVal = "1234";

        System.out.println("Converted: " + Integer.parseInt(intVal));

        
    }
}
