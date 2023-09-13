package Surekha;
import java.util.*;
	public class Factorial {
		public static void main(String[] args){
			Scanner x =new Scanner(System.in);
			int fact=1;
			int n=x.nextInt();
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
		}

	}



