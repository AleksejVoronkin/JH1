
//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package JAVA;
import java.util.Scanner;
public class J1 
{
    public static void main (String[] args) 
    {
    System.out.print("Введите любое целое число: ");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int t = n*(n+1)/2;
    System.out.println ("Треугольное число от "+ n + " = " +  t);
    
    int pr = 1;
    int i = 1;
    for (i = 1; i <= n; i++)
        {
        pr = pr * i;
        }
    System.out.print("Факториал от числа " + n + " = " + pr);
    }
}    
