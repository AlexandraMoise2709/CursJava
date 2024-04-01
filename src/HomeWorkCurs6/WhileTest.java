package HomeWorkCurs6;

import java.util.Scanner;

public class WhileTest {

    static Scanner scan = new Scanner(System.in);
    static int numar1;
    static int numar2;

    public static void main(String[] args) {

        System.out.println("Introdu doua numere: ");
        numar1 = scan.nextInt();
        numar2 = scan.nextInt();

        if(numar1==numar2){
            System.out.println("Numerele sunt egale");
        } else {
            int x;
            if (numar1 > numar2) {
                x = numar1;
                numar1 = numar2;
                numar2 = x;

                numar1++;
                while (numar1 < numar2) {

                    if (numar1 % 2 == 0)
                        System.out.println(numar1);
                    numar1++;
                }
            }
        }



    }

}