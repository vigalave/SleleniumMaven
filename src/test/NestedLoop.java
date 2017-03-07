package test;

public class NestedLoop {
	
	
	public static void main(String args[]){
	
	int  i =0;
	while(i<3)
	{
		for(int j=0; j<4; j++){
			int k=0;
			do{
				System.out.println(i + j + k);
				k++;
			}while(k<5);
		}
		i++;
	}
	
	for(i=1;i<=10;i++){	
		
		if(i>=5 && i<=7)
			continue;
		System.out.println(i);
		
	}
	
	double j = 0.2454354;
	
	String v = "1324";
	
	int k = Integer.parseInt(v);
	int s = 986;
	
	String g = String.valueOf(s);
		
	
    }
}