package test;
import org.junit.Test;

public class MathNumberTestcase {

	@Test
	public void num() {
		
    int num = (int)(Math.random()*20);
    
    if(num<=10)   	
    	System.out.println(num+"is less than 10");
    else
    	System.out.println(num+"is greater than 10");
    
    	}
    
	

}
