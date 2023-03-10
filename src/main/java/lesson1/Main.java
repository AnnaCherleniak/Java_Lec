package lesson1;

import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, world!");
//        inputNameAndHi();
//        hiTimeDay();
//        countElement();
//        nameTime();

    }

    private static void inputNameAndHi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String n = scanner.nextLine();
        System.out.printf("Hello, %s!%n", n);
        scanner.close();
    }

    private static void hiTimeDay() {
        String nowTime = "11";

        System.out.println(nowTime);

    }

    //    дан массив двоичных чисел, например: [1, 1, 0, 1, 1, 0, 1]. Вывести максимальное количество подряд идущих 1.
    private static void countElement() {
        int[] arr = {1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1};
        int e = 1;
        int c = 0;
        int cMax = 0;
//        for (int i = 0; i < arr.length; i++)
        for(int item: arr) {
            if (item == e) {
                c++;
            } else {
                if (c > cMax) {
                    cMax = c;
                }
                c = 0;
            }
            if (c > cMax) {
                cMax = c;
            }

        }
        System.out.printf("%d occurs %d times in a row%n", e, cMax);
    }


    private static void nameTime() {
        LocalTime t = LocalTime.now();
        System.out.println(t);
//        String ti = t.
//        System.out.println(ti);
    }
}
