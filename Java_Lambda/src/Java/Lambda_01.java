package Java;

@FunctionalInterface
	interface Readable{
		
		public void read();
	}
	
public class Lambda_01 {

	public static void main(String[] args) {
		
		int size = 20;
		
//		//without Lambda
//		Readable R = new Readable() {
//		public void read() {System.out.println("Reading :" +size);}
//	};
//	
//		R.read();
		
		//with lambda
		Readable R2=()->System.out.println("Reading :" +size);
		
		R2.read();
	}
}