package homework_nr_4;

public class Circle {

    static int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    public static void main (String[] args){

        Circle Circle1 = new Circle(4);

        float area = Circle1.calculateArea();

        System.out.println(area);

    }

    public static float calculateArea (){

        float result = (float) ((radius * radius) * 3.14f);
        return result;
    }

}
