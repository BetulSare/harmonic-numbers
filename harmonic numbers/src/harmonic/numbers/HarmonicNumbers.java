
package harmonic.numbers;

import java.util.Scanner;


public class HarmonicNumbers {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number: ");
        int number=scan.nextInt();
        double resault=0;
        for (double i = 1; i <= number; i++) {
            resault+=1/i;
        }
        System.out.println(resault);
    }
    
}
