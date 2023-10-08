package edu.neu.mgen;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{



    
    public static void main( String[] args )
    {
       System.out.println( "Hello World!" );
       System.out.println("Enter two integer numbers :");
       Scanner obj = new Scanner(System.in);
        int i = obj.nextInt();
        int j = obj.nextInt();
        System.out.println("Enter two long numbers :");
        long l = obj.nextLong();
        long m = obj.nextLong();
        System.out.println("Enter two double numbers :");
        double d = obj.nextDouble();
        double e = obj.nextDouble();
        System.out.println("Enter two booleans :");
        boolean b = obj.nextBoolean();
        boolean a = obj.nextBoolean();
        System.out.println("Enter character :");
        char operator;
        System.out.println("Enter operator: (+, -, *, /, &, |, !, L, I, C)");
        operator = obj.next().charAt(0);  
          switch(operator)
       {
            case '+':
            {
                System.out.println("Integer Addition: " + i + " + "+ j + " = "+ (i+j));
                System.out.println("Long Addition: " + l + " + "+ m + " = "+ (l+m));
                System.out.println("Double Addition: " + d + " + "+ e + " = "+ (d+e));
                break;
            }
            case '-':
            {
                System.out.println("Integer Subtraction: " + i + " - "+ j + " = "+ (i-j));
                System.out.println("Long Subtraction: " + l + " - "+ m + " = "+ (l-m));
                System.out.println("Double Subtraction: " + d + " - "+ e + " = "+ (d-e));
                break;
            }
             case '*':
            {
                System.out.println("Integer Multiplication: " + i + " * "+ j + " = "+ (i*j));
                System.out.println("Long Multiplication: " + l + " * " + m + " = "+ (l*m));
                System.out.println("Double Multiplication: " + d + " * "+ e + " = "+ (d*e));
                break;
            }
            case '/':
            {
                System.out.println("Integer Division: " + i + " / "+ j + " = "+ (i/j));
                System.out.println("Long Division: " + l + " / "+ m + " = "+ (l/m));
                System.out.println("Double Division: " + d + " / "+ e + " = "+ (d/e));
                break;
            }
            case '&':
            {
                System.out.println("Integer Division: " + b + " && "+ a + " = "+ (b&&a));
                break;
            }
            case '|':
            {
                System.out.println("Integer Division: " + b + " || "+ a + " = "+ (b||a));
                break;
            }
             case '!':
            {
                System.out.println("Integer Division: " + b + " != "+ a + " = "+ (b!=a));
                break;
            }
            case 'L':
            {
                System.out.println("Int to Long conversion of" + i + ": " + (Long.valueOf(i)));
                System.out.println("Int to Long conversion of" + j + ": " + (Long.valueOf(j)));
                break;
            }
            case 'I':
            {
                System.out.println("Long to Int conversion of" + l + ": " + ((int)l));
                System.out.println("Long to Int conversion of" + m + ": " + ((int)m));
                break;
            }
            case 'C':
            {
                System.out.println("Display character: " + operator);
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }

       }
  

    
    }

  
}
