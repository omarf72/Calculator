import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);

        System.out.println("Do you want to enter floating point numbers type yes or no");

        String type=scan.next();

        

        if(type.equals("yes")){

            System.out.println("Enter two floating point numbers");
            double number1=scan.nextDouble();

            double number2=scan.nextDouble();

            System.out.println("Do you want to add, subtract," +
            " multiplaction and division (type subtract or add or multiply or subtraction");

            String operator= scan.next();


            if(operator.equals("add"))
            {
                double sum=number1+number2;
                System.out.println(sum);
    
            }
            else if(operator.equals("subtract"))
            {
                double difference=number1-number2;
                System.out.println(difference);
            }
            else if(operator.equals("multiply")){
                double product=number1*number2;
                System.out.println(product);
            }
            else if(operator.equals("division"))
            {
                double quotient=number1/number2;
                System.out.println(quotient);
            }


        }
        else if(type.equals("no")){
            System.out.println("Enter two whole numbers");

            int number1= scan.nextInt();

            int number2=scan.nextInt();

            System.out.println("Do you want to add, subtract," +
        " multiplaction and division (type subtract or add or multiply or subtraction");

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
        else if(operator.equals("multiply")){
            int product=number1*number2;
            System.out.println(product);
        }
        else if(operator.equals("division"))
        {
            int quotient=number1/number2;
            System.out.println(quotient);
        }

        }

        

        //System.out.println("Do you want to add, subtract," +
       // " multiplaction and division (type subtract or add or multiply or subtraction");

       

        

       /*  if(operator.equals("add"))
        {
            int sum=number1+number2;
            System.out.println(sum);

        }
        else if(operator.equals("subtract"))
        {
            int difference=number1-number2;
            System.out.println(difference);
        }
        else if(operator.equals("multiply")){
            int product=number1*number2;
            System.out.println(product);
        }
        else if(operator.equals("division"))
        {
            int quotient=number1/number2;
            System.out.println(quotient);
        }*/
        

     

        

    }
}
