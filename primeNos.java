package Assingment4;

public class primeNos {
      public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		for(int i=2;i<=input/2;i++) {
			if(input%i==0) {
				flag=true;
			}
			if(flag!=true) {
				System.out.println("13 is a prime number");
			}
			else {
				System.out.println( "13 is not a prime number");
			}
		}
	}
}
