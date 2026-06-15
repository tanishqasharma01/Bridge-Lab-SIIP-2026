import java.util.Scanner;

public class distanceInkiloTomiles {
    public static void main(String[] args) {
        double km;
        double miles;

        Scanner sc = new Scanner(System.in);

        km = sc.nextDouble();
        miles = km / 1.6;

        System.out.println("The total miles is " + miles +
                           " mile for the given " + km + " km");

        sc.close();
    }
}