import java.util.Scanner;
import java.math.*;


public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calculator = new Calc();
        System.out.println("Choose operation +, -, *, /, fact, pow");
        String operation = new String();
        operation = scanner.next();

        System.out.println("Input number A:");
        int A = scanner.nextInt();
        int B = 0;
        if (!operation.equals("fact"))
        {
            System.out.println("Input number B:");
            B = scanner.nextInt();
        }



        switch (operation) {
            case "+":
                System.out.println(calculator.Sum(A,B));
                break;
            case "-":
                System.out.println(calculator.Substraction(A,B));
                break;
            case "*":
                System.out.println(calculator.Multiplication(A,B));
                break;
            case "/":
                System.out.println(calculator.Division(A,B));
                break;
            case "fact":
                System.out.println(calculator.Fact(A));
                break;
            case "pow":
                System.out.println(calculator.Pow(A,B));
                break;
             default:
                 System.out.println("Выбрана не существующая операция!");
        }

    }

    public BigInteger Pow(int a, int b) {
        return BigInteger.valueOf((long) Math.pow(a,b));
    }

    public int Multiplication(int a, int b) {
        return a*b;
    }

    public double Division(int a, int b) {
        if (b==0)
            return Double.POSITIVE_INFINITY;
        return a/b;
    }


    public BigInteger Fact(int a) {
        BigInteger xfact = BigInteger.valueOf(1);
        for (int i =2; i<=a; i++)
            xfact = xfact.multiply(BigInteger.valueOf(i));
        return xfact;
    }

    public int Substraction(int a, int b) {
        return a-b;
    }

    public int Sum(int a, int b) {
        return a+b;
    }
}