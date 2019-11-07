package finalize;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		
		
	try {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println("result a+b is"+a+b);
	}
	catch(ArrayIndexOutOfBoundsException a1) {
		System.out.println("result a+b is"+4+5);
	}
	
	catch(NumberFormatException a2){
		System.out.println("result a+b is"+6+7);
		}
	catch(ArithmeticException a){
		System.out.println("result a+b is"+8+9);
	}
	
	
	
	
	

	
	
	
		
		//for(int i=1;i<=10;i++) {
			//new b(new a());
		
		//b b1=new b(new a());
		//System.out.println(b1);
		//System.out.println(b1.a1);
		//System.out.println(b1.a1.cost);
		
	  //    System.gc();
		
		//b1.finalize();
		//Thread.sleep(1000);
		//System.out.println(b1);
		
		//System.out.println(b1);
		//System.out.println(b1.a1);
	//	System.out.println(b1.a1.cost);

	}

}
