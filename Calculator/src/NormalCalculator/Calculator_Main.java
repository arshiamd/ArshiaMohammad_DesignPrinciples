package NormalCalculator;
import static java.lang.Character.isDigit;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Calculator_Main{
      public static void main(String a[])  {
        Scanner scan = new Scanner(System.in);
        double num1=0,num2=0;
        double num3;
        int choice_op;
        while(true){
            scan = new Scanner(System.in);
            try{
                System.out.println("Enter number 1 : ");
                num1 = scan.nextFloat();
                System.out.println("Enter number 2 : ");
                num2 = scan.nextFloat();
            }
            catch(InputMismatchException e){
                System.out.println("Invalid Input");
                continue;
                
            }
            System.out.print("1)Addition\t2)Subtraction\t3)Multiplication\t4)Division\t5)Exit");
            System.out.println("\nchoose operation");
            try{
                choice_op = scan.nextInt();
                if(choice_op<1 || choice_op>5){
                    throw new HandlingException("Choose number bet^ween 1-5");
                }
                 
            }
            catch(HandlingException e){
                System.out.println(e) ;
                continue;
            }
            catch(InputMismatchException e){
                System.out.println("Enter Integer between 1-5");
                continue;
            }
            switch(choice_op){
                case 1:
                    num3 = Operations.plus_op(num1, num2);
                    System.out.println("\nResult:"+num3+"\n");
                    break;
                case 2:
                    num3 = Operations.minus_op(num1, num2);
                    System.out.println("\nResult:"+num3+"\n");
                    break;
                case 3:
                    num3 = Operations.multiplication_op(num1, num2);
                    System.out.println("\nResult:"+num3+"\n");
                    break;
                case 4:
                        num3 = Operations.division_op(num1, num2);
                        System.out.println("\nResult:"+num3+"\n");
                    break;
                case 5:
                    return ;
            }
        }
     }
}


