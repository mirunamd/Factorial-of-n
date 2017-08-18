import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(fact(n));
	}

	private static BigInteger fact(int n){
		if(n == 0 || n == 1)
			return BigInteger.ONE;
		else{
			BigInteger bi = BigInteger.valueOf(n);

			return bi.multiply(fact(n-1));
		}
	}
}
