package finalize;

public class b {

	a a1;
	
	b(a a1){
		
		this.a1=a1;
	}
	
	public void finalize() {
		
		
		System.out.println("hi this is a finalize");
		
		a1=null;
	}
	
	
}
