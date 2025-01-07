package homework_nr_3;

public class HomeWork3 {
    public static void main (String[] args){
        int monthOfYear = 4;
        switch (monthOfYear){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Select a month from Gregorian calendar");
        }

        int i = 100;

        while(i <= 1000) {
            if (i % 5 == 0){
                System.out.println(i);
            }
            i++;
        }

        double sum = 0.0;

        for (int h = 1, j=3; j<99; i+=2, j+=2){
            sum+= (double) h / j;
        }
        System.out.println("Series sum:"+ sum);
    }
}
