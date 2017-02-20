package com;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	private static BigInteger[] calculated = new BigInteger[1000];
	private static int indexC = 1;
	static BigInteger t1;
	static BigInteger t0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t0 = sc.nextBigInteger();
		t1 = sc.nextBigInteger();
		int n = sc.nextInt();
		sc.close();
		calculated[0] = t0;
		calculated[1] = t1;
		BigInteger value = fib(n);
		System.out.println(value);
		
	}

	private static BigInteger fib(int n){
		System.out.println(n);
		if(n == 0){
			System.out.println("t0 -");
			return t0;
		}
		if(n == 1){
			System.out.println("t1 -");
			return t1;
		}
		if(n <= indexC){
			System.out.println(n + "-> calc");
			return calculated[n];
		}
		
		else{
			System.out.println(n + " ---> else");
			BigInteger second = fib(n - 2);
			second = second.multiply(second);
			BigInteger first = fib(n-1);
			BigInteger total = first.add(second);
			calculated[indexC++] = total;
			
			return total;
			
		}
	}
}
