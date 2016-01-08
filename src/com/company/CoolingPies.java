package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class CoolingPies {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        int i,j;
        while (test <= 30 && test != 0) {
            int count =0;
            int Cookies = input.nextInt();
            //Number of Cookies is less than 30
            if (Cookies <= 30) {
                int a[] = new int[Cookies];
                //input weights of cookies not exceeding 100
                for (i = 0; i < Cookies; i++) {
                    a[i] = input.nextInt();
                    if (a[i] > 100) {
                        System.exit(1);
                    }

                }
                Arrays.sort(a);

                int tray[] = new int[Cookies];
                //input capacity of tray not exceeding 100
                for (i = 0; i < Cookies; i++) {
                    tray[i] = input.nextInt();
                    if (tray[i] > 100) {
                        System.exit(1);
                    }
                }
                Arrays.sort(tray);
                for (i = 0, j = 0; i < Cookies && j < Cookies; ) {
                    if (a[i] <= tray[j]) {
                        count++;
                        i++;
                        j++;
                    }
                    else{
                        j++;
                    }


                }

                System.out.println(count);
                test--;


            }
            else{
                System.exit(2);
            }
        }
       System.exit(0);

}}










