package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int mat, fizik, turkce, kimya, muzik, toplam=0;
        int sayac=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (!(mat < 0  || mat > 100)){
            toplam = toplam + mat;
            sayac++;

        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik= input.nextInt();
        if (!(fizik < 0  || fizik > 100)) {
            toplam = toplam + fizik;
            sayac++;

        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if (!(turkce < 0  || turkce > 100)) {
            toplam = toplam + turkce;
            sayac++;

        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (!(kimya < 0  || kimya > 100)) {
            toplam = toplam + kimya;
            sayac++;

                }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (!(muzik < 0  || muzik > 100)){
            toplam = toplam + muzik;
            sayac++;


        }

        double average = toplam / sayac;
        if (average<55){
            System.out.print("Kaldınız, ortalamanız: " + average);
        }else{
            System.out.print("Geçtiniz, ortalamanız: " + average);
        }

        }
    }

