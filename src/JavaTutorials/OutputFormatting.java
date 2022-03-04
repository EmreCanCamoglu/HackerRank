package JavaTutorials;
import java.io.*;
import java.util.*;
public class OutputFormatting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a1= scan.next();
        int b1 = scan.nextInt();
        scan.nextLine();
        String a2= scan.next();
        int b2 = scan.nextInt();
        scan.nextLine();
        String a3= scan.next();
        int b3 = scan.nextInt();



        String c1,c2,c3, s = " ";

        if(b1 == 0)
            c1 = "00" +b1;
        else if(b1<100)
            c1 = "0" + b1;
        else
            c1 = ""+ b1;

        if(b2 == 0)
            c2 = "00" +b2;
        else if(b2<100)
            c2 = "0" + b2;
        else
            c2 = ""+ b2;

        if(b3 == 0)
            c3 = "00" +b3;
        else if(b3<100)
            c3 = "0" + b3;
        else
            c3 = ""+ b3;

        System.out.println("================================");
        System.out.println(a1 + s.repeat(15-a1.length()) + c1);
        System.out.println(a2 + s.repeat(15-a2.length()) + c2);
        System.out.println(a3 + s.repeat(15-a3.length()) + c3);
        System.out.println("================================");




    }
}
