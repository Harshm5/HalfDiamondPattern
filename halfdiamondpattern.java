package testc;

import java.util.Scanner;

public class halfdiamondpattern {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  if(n == 0){
	      System.out.println("*");
	  }
	  int i,j,k,p,d;
	  for(i=1; i<= n+1; i++) {
		  System.out.print("*");
		  for(j=1; j<i; j++) {
		     System.out.print(j);
		    }
	      for(j=i-2; j>0; j--) {
	    	  System.out.print(j);
		    }
	      k = i;
	      for(j=1; j<k; j++) {
	      System.out.print("*");
	      k = k+1-i;
	      }
	      System.out.println("");
	  }
	  p=n;
	  for(i=1; i<=n; i++) {
		  System.out.print("*");
		  for(j=1; j<p; j++) {
	 	     System.out.print(j);
	 	    }
		  d=p-1;
	 	   for(j=1; j<p-1; j++) {
	 	     	 System.out.print(d-j);
	 	 	    }
	     p= p -1;
	     if(i<n) {
	     System.out.print("*");
	     }   
		  System.out.println("");
	  }
	}
}
