package starPattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=3;i++) {
      	  
      	       for(int j=2;j>=i;j--) {
      		         System.out.print(" ");
			 
      	          }
      	  
              	for(int k=0;k<=i;k++) {
      		    System.out.print("*");
      	          }
      	
      	System.out.println();
      	
		} 	
		for(int i=0;i<=3;i++) {
         	
			for(int l=0;l<=i;l++) {
      		System.out.print(" ");
        	}
            	for(int m=2;m>=i;m--) {
      		  System.out.print("*");
      	      }
      	
    	     System.out.println();
				 //System.out.print(" ");
       }
	}

}
//j>=i