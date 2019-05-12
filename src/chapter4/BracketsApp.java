package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        input = in;
    }

    public void check() {
        int stackSize = input.length();
        StackChar stack = new StackChar(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);

            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty()) {
                        char chx = stack.pop();
                        if (
                                (ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '(') ) {
                            System.out.println("Error: " + ch + " at " + j);
                        }
                    } else {
                        System.out.println("Error: " + ch + " at " + j);
                    }
                    break;

                default:
                    break;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }
}

public class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.print("Enter string containing delimiter: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }

            BracketChecker checker = new BracketChecker(input);
            checker.check();
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
