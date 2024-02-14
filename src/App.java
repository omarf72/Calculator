import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter two whole numbers");

        Scanner scan=new Scanner(System.in);

        int number1= scan.nextInt();

        int number2=scan.nextInt();

        System.out.println(number1+number2);


    }
}
