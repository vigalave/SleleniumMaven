package test;
import org.junit.Test;

public class MathTestcase {
	
	public int add(int x, int y){	
		int z = x + y;	
		return z;
	}
	
	@Test
	public void numberTestcase() {
		
		for(int i=10;i<=15;i++){
			System.out.println(i);
		}
		
		double num = Math.random();
		
		System.out.println(num);
	}
		
	@Test	
	public void addTestcase() {	
		int sum = add(2,3);
		System.out.println(sum);
		
	}

}
