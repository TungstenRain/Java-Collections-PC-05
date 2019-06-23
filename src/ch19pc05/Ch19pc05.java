package ch19pc05;

import java.util.*;

/**
 * 
 * @author frank
 */
public class Ch19pc05 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Instantiate linked list
        LinkedList<Integer> primeNumbers = new LinkedList<Integer>();
        
        primeNumbers.add(2); //first prime number
        
        int flag; //flag to check prime or not
        
        //loop till we find 50 primes
        for(int i = 3; primeNumbers.size()<50; i++) {
            flag = 1;
            
            //prime test
            for(int j = 2; j <= Math.sqrt(i); j++) {
                //if any divisor
                if(i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            
            //if flag is 1 then it is prime
            if(flag == 1) {
                primeNumbers.add(i);
            }
        }
        // Instantiate Iterator
        Iterator<Integer> primeIterator = primeNumbers.iterator();
        
        //print 50 primes
        for(int i=0; primeIterator.hasNext(); i++) {
            System.out.print(primeIterator.next() + " ");
            if(i % 10 == 9) {
                System.out.println();
            }
        }
    }
}