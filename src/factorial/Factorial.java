/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author K W Tom Jr
 */
public class Factorial {

    public static long factorial(long n) {
        if      (n <  0) throw new RuntimeException("Underflow error in factorial");
        else if (n > 20) throw new RuntimeException("Overflow error in factorial");
        else if (n == 0) return 1;
        else             return n * factorial(n-1);
    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(factorial(n));
    }

    
}
