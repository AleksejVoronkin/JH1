
// 3) Реализовать простой калькулятор
// + - / *

// Введите первое число: A \n
// Введите знак: *
// Введите второе число: B
// Результат: A*B

// sc.next() -- считывает символ
// sc.nextLine() -- считывает всю строчку
// sc.nextInt() -- считывает число, но без перехода на след. строчку
package JAVA;
import java.util.Scanner;
public class J3 {
    public static void main (String[] args){ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите первое число: ");
    int a = sc.nextInt();
    sc.nextLine();

    System.out.println("Введите знак(+, -, /, *):");
    String c = sc.nextLine();
    System.out.println(c);

    System.out.println("Введите Второе число: ");
    int b = sc.nextInt();
    int res = 0;
    if (c == "+"){
        res = a + b;
        }
    else if (c == "-"){
        res = res + (a-b);
        }
    else if (c == "/"){
        res = res + (a/b);
        }
    else if (c == "*"){
        res = res + (a*b);
        }
    System.out.println(res);
    }
}

// scanf("%d %c %d",&a,&c,&b);
// if (c == '+') res = a + b;
// if (c == '-') res = a - b;
// if (c == '*') res = a * b;
// if (c == '/') res = a / b;
// printf("%d\n",res);