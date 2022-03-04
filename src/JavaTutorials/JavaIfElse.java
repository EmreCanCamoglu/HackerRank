package JavaTutorials;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {



            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();

            if (n%2 == 1 || (5<n && n<21))
                System.out.println("Weird");
            else
                System.out.print("Not Weird");

        }
    }

