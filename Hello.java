class Sample{
	
	public static void display() {
		System.out.println("inside display");
	}
	
	
	public void disp() {
		System.out.println("inside disp");
	}
}


public class Hello {

	public static void main(String[] args) {
		System.out.println("inside main");
		
		Sample.display();
		
		Sample ob1= new Sample();
		
		ob1.disp();
	}

}