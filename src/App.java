import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter two whole numbers");

        int number1= scan.nextInt();

        int number2=scan.nextInt();

        System.out.println("Do you want to add them or subtract them (type subtract or add)");

        String operator= scan.next();

        

        if(operator.equals("add"))
        {
            int sum=number1+number2;
            System.out.println(sum);

        }
        else if(operator.equals("subtract"))
        {
            int difference=number1-number2;
            System.out.println(difference);
        }
        

     

        

    }
}
