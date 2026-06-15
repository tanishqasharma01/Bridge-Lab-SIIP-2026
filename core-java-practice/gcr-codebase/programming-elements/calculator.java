import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the first number");
        int a = sc.nextInt();
        System.out.println("enter your second number");
        
        int b = sc.nextInt();
        System.out.println("enter the operator");
        char operator = sc.next().charAt(0);

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;

        System.out.println("the sum of the two numbers is" + sum);
        System.out.println("the difference of the two numbers is" + sub);
        System.out.println("the product of the two numbers is" + mul);
        System.out.println("the quotient of the two numbers is" + div);
    }

    
}
