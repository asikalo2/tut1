package rpr.etf.unsa.ba;

import java.util.Scanner;

public class Main{

    public static int sumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma=n%10;
            n=n/10;
        }

        return suma;
    }


    public static void main(String[] args) {
        int i;
        System.out.println("Unesite broj");
        Scanner ulaz = new Scanner(System.in);
        int x = ulaz.nextInt();
        for (i = 1; i <= x; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
}