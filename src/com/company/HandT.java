package com.company;


import java.util.Arrays;
import java.util.Scanner;


public class HandT {
    public static void main(String[] args) {
       int test[] = new int[7];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            test[i]= input.nextInt();

        }
        Arrays.parallelSort(test);
        for (int i = 0; i < 6; i++) {
            System.out.println(test[i]);

        }




    }}


