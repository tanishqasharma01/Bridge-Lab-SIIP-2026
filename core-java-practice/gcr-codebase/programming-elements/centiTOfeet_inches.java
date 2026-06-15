import java.util.Scanner;

public class centiTOfeet_inches {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter your height in centimenters");
        double height = sc.nextDouble();
        double feet = height/30.48;
        double inches = (height%30.48)/2.54;
        System.out.println("your height in feet  is" + feet);
        System.out.println("your height in inches is" + inches);
    }
}
