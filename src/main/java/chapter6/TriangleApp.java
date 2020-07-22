package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleApp {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        int theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle = " + theAnswer);
    }

    private static int triangle(int n ) {
        if (n == 1) {
            return 1;
        } else {
            return (n + triangle(n - 1));
        }
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }

    private static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
