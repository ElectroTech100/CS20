package Mastery;

import java.util.Scanner;

public class PerfectIntegers {

	    
	    public static boolean isPerfect(int num) {
	        if (num <= 1) {
	            return false;
	        }

	        int sum = 0;
	        
	        
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }

	        return sum == num;
	    }

	    public static void main(String[] args) {
	        System.out.println("Perfect integers up to 100:");
	        
	        for (int i = 1; i <= 100; i++) {
	            if (isPerfect(i)) {
	                System.out.println(i);
	            }
	        }
	    }
	}
