package homework_nr_4;

public class Circle {
    public static void main (String[] args){

        int radius = 3;
        double r = calculateRadius(radius);
        System.out.println(r);
    }
    public static float calculateRadius (int inputNumber){

        float result = (float) ((inputNumber * inputNumber) * 3.14f);
        return result;
    }
}
