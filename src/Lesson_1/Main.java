package Lesson_1;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        goldAbba();
//      sumOneN();
//      sumAandB();
    }

    // 1. Золото племени АББА (сложность 30%)
    private static void goldAbba() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        PrintWriter out = new PrintWriter(System.out);
        if( b>a ){
            if (b>c){
                out.println(b);
            } else out.println(c);
        } else if (b<a){
            if (a>c){
                out.println(a);
            } else out.println(c);
        }
        out.flush();
    }

    // 2. Требуется посчитать сумму целых чисел, расположенных между числами 1 и N включительно (сложность 19%)
    private static void sumOneN() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < n ; i++) {
            sum = sum + (i + 1);
        }
        out.println(sum);
        out.flush();
    }


    // 3. Требуется сложить два целых числа А и В. (сложность 2%)
    private static void sumAandB() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        out.println(a+b);

        out.flush();
    }

}
