import java.util.ArrayList;
import java.util.Scanner;
public class w{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userinput;
        int base1;
        int base2;
        int x = 0;
        System.out.print("What is the base of your number: ");
        base1 = scan.nextInt();
        System.out.print("What is your number: ");
        userinput = scan.nextInt();
        System.out.print("What base do you want to convert to: ");
        base2 = scan.nextInt();
        //convert userinput into a list by using mod 10, then starting from the end of the list using nested for loops convert to base 10, then again using nested for loops for division
        ArrayList<Integer> number = new ArrayList<>();
   /*     while (userinput > 0) {
            x++; // adds the new number at the front
            number.add(x, userinput % 10);
            userinput = userinput/ 10;
        } */
        if (base1 == 2){

        }
    }
}
