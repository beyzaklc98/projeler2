package day07_IfElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {

    public static void main(String[] args) {

        // Soru1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("girilen sayi cift sayidir");
        }

        if (sayi % 2 != 0) {
            System.out.println("girilen sayi tek sayi");
        }
        // normalde bir sayi ya tektir veya cifttir. ucuncu bir durum yoktur
        // o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        // if else ile tek statements'da yapmak daha guzel olur
        //======== if else ile cozum ========

        if (sayi % 2 == 0) {
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tek sayidir");
        }
    }
}

