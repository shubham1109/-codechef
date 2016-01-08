package com.company;

import java.util.*;

/** There is a haunted town in HauntedLand. The structure of HauntedLand can be thought of as a grid of size n * m.
   There is a house in each cell of the grid. Some people have fled from their houses because they were haunted. '.' represents a haunted house
    whereas '*' represents a house in which people are living.
    One day, Devu, the famous perfumer came to town with a perfume whose smell can hypnotize people. Devu can put the perfume in one of the houses.
     This takes Devu one second. Then, the perfume spreads from one house to all its adjacent houses in one second, and the cycle continues.
     A house is said to be a neighbour of another, if they share a corner or edge.
    You want to save people from Devu's dark perfumery by sending them a message to flee from the town. So, you need to estimate the minimum amount of time
     Devu needes to hypnotize all the people?
    Input

    The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
    First line of each test case contains two space separated integers n, m denoting the dimensions of the town.
    For each of next n lines, each line has m characters (without any space) denoting a row of houses of the town.
    Output

    For each test case, output a single integer corresponding to the answer of the problem.
            Constraints

    1 ? T ? 20
    Subtask #1: (40 points)
            1 ? n, m ? 100
    Subtask #2: (60 points)
            1 ? n, m ? 1000
    Example

    Input:
            2
            2 2
            *.
            ..
            3 3
            .*.
            ***
            .*.

    Output:
            1
            2
    Explanation

    In the first example, it will take Devu one second for putting the perfume at the only house. So, the answer is 1.
    In the second example, He will first put the perfume at the * in the middle, i.e., at coordinates (1, 1) (assuming 0-based indexing).
    Now, it will take Devu 1 secs to put perfume. In the next second, the perfume will spread to all of its adjacent cells, thus making each house haunted.
            So, the answer is 2.*/
public class dandp {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        int test = input1.nextInt();
        while (test <= 20 && test != 0) {
            int m, n;
            m = input1.nextInt();
            n = input1.nextInt();
            int array[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    array[i][j] = function();
                }

            }
            minDist(array, m, n);


            test--;
        }
    }


    public static int function() {

        Scanner input = new Scanner(System.in);
        node Char = new node();
        Char.data = input.next().charAt(0);
        if (Char.data == '.') {
            Char.status = 1;

        } else if (Char.data == '*') {
            Char.status = 2;
        }
        return Char.status;
    }

    public static void minDist(int array[][], int m, int n) {

        node Char = new node();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i != 0) {
                    Char.left = array[i - 1][j];
                }
                if (i == 0) {
                    Char.left = 0;
                }
                if (i != m - 1) {
                    Char.right = array[i + 1][j];
                }
                if (i == m - 1) {
                    Char.right = 0;
                }
                if (j == 0) {
                    Char.up = 0;
                }
                if (j != 0) {
                    Char.up = array[i][j - 1];
                }
                if (j == n - 1) {
                    Char.down = 0;
                }
                if (j != n - 1) {
                    Char.down = array[i][j + 1];
                }
            }
        }
    }


    public static int count(node Char) {
                   int c=0;



                if (Char.left == 2 && Char.right == 2 && Char.up == 2 && Char.down == 2) {
                    c= c+4;
                }
        if(Char.left ==2&&Char.right ==2&&Char.up==2&&Char.down!=2){
            c= c+3;
        }
        if(Char.left ==2 &&Char.right==2&&Char.down==2&&Char.up!=2)
        {
            c=c+3;
        }if(Char.left !=2 &&Char.right==2&&Char.down==2&&Char.up==2)
        {
            c=c+3;
        }if(Char.left ==2 &&Char.right!=2&&Char.down==2&&Char.up==2)
        {
            c=c+3;
        }
        if(Char.left !=2 &&Char.right==2&&Char.down==2&&Char.up!=2)
        {
            c=c+2;
        }if(Char.left ==2 &&Char.right!=2&&Char.down==2&&Char.up!=2)
        {
            c=c+2;
        }if(Char.left ==2 &&Char.right!=2&&Char.down!=2&&Char.up==2)
        {
            c=c+2;
        }if(Char.left !=2 &&Char.right==2&&Char.down!=2&&Char.up!=2)
        {
            c=c+2;
        }
        if(Char.left ==2 &&Char.right!=2&&Char.down!=2&&Char.up!=2)
        {
            c=c+1;
        }if(Char.left !=2 &&Char.right==2&&Char.down!=2&&Char.up!=2)
        {
            c=c+1;
        }if(Char.left !=2 &&Char.right!=2&&Char.down==2&&Char.up!=2)
        {
            c=c+1;
        }if(Char.left !=2 &&Char.right!=2&&Char.down!=2&&Char.up==2)
        {
            c=c+1;
        }
        else{
            c=0;
        }
        return c;
    }
    public void count_node(int array[][],int m,int n) {
        node Char = new node();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count(Char);


            }
        }
    }
}


