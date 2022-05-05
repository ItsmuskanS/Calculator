import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double num = 0;
        double num1 = 0;
        char opt;
        Scanner sc = new Scanner(System.in);
        System.out.println("_____(+,-,/,*,%) WELCOME TO MY CALCULATOR ('>')____");
        System.out.println("ENTER the First  NUMBER ");
        num = sc.nextDouble();
        System.out.println(" ENTER OPERATOR PLEASE ");
        opt = sc.next().charAt(0);
        switch (opt) {
            case '+':
                System.out.println("ENTER the Second NUMBER");
                num1 = sc.nextDouble();
                System.out.print("YOUR  Answer  =");
                System.out.println(num + num1);
                break;
            case '-':
                System.out.println("ENTER the Second NUMBER");
                num1 = sc.nextDouble();
                System.out.print("YOUR Answer  =");
                System.out.println(num - num1);
                break;
            case '*':
                System.out.println("ENTER the Second NUMBER");
                num1 = sc.nextDouble();
                System.out.print("Your Answer  = ");
                System.out.println(num * num1);
                break;
            case '/':
                System.out.println("ENTER the Second NUMBER");
                num1 = sc.nextDouble();
                System.out.print("Your Answer  = ");
                System.out.println(num / num1);
                break;
            case '%':
                System.out.println("ENTER the Second NUMBER");
                num1 = sc.nextDouble();
                System.out.print("Your Answer  = ");
                System.out.println(num % num1);
                break;
            default:
                System.out.println("OPPS I CANNOT CALCULATE '__' ");
                break;
        }
        System.out.println("THANK YOU FOR USING MY CALCULATOR");
    }
}
