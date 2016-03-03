/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccijava;

import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Stefano D'Alessio
 */
public class FibonacciJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        BigInteger num1 = new BigInteger("0");
        BigInteger num2 = new BigInteger("1");
        int index = 0;
        
        System.out.printf("Insert the index of the number in the Fibonacci's series you want: ");
        try {
            index = Integer.parseInt(input.next());
        }
        catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("You must enter a valid number");
            return;
        }
        if (index <= 2)
            System.out.println("The first numbers of the Fibonacci's series are: 0 and 1\n");
        else {
            for (int i = index - 2; i >= 0; i--) {
                BigInteger temp = num1.add(num2);
                num1 = num2;
                num2 = temp;
            }
            System.out.printf("The %d-th number of the Fibonacci's series is: %d\n", index, num2);
        }
        
    }
    
}
