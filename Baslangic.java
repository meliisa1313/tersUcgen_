package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        /* *******************
           *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
          * */
        int sayi,i,j;
        Scanner input=new Scanner(System.in);
        System.out.print("kac basamak");
        sayi=input.nextInt();
        for( i=0;i<sayi;i++){
            //space
            for( j=0;j<=i;j++){
                System.out.print(" ");

            }
            for(int k=2*sayi-1;k>=(2*i+1);k--){
                System.out.print("*");
            }
            System.out.println();
        }


           }}











































