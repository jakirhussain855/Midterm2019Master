package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
/*
Write 40 Fibonacci numbers with java.
0,1,1,2,3,5,8,13
*/


        int n = 40;
        int t1 = 0;
        int t2 = 1;

        System.out.println("upto" + n + "Fibonacci numbers");

        for (int i = 1; i <= n; i++) {
            System.out.println(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }


    }
}