package java_fundamentals;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for(int j=10;j<=99;j++) {
	 int c=0;
     for(int i=1;i<Math.sqrt(j);i++) {
    	if(j%i==0) {
    		if(j%j/i==0) {
    			c++;
    		}
    		c++;
    	}	
     }
     if(c==2) {
    	 System.out.println(j);
     } 
 }
	}

}
