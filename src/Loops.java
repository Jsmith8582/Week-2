
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5A	
			int I = 0;
			while (I <= 100) {
				System.out.println(I);
			I += 2;
	}
//		B	
			int J = 100;
			while (J >= 0) {
				System.out.println(J);
			J-= 3;
	}
//		C	
			for (int Z = 1; Z <= 100; Z += 2) {
				System.out.println(Z);
	}
//		D	
			for (int Q = 0; Q <= 100; Q+= 1) {
			if (Q % 3 == 0 && Q % 5 == 0) {
				System.out.println("Hello World");
			} else if (Q % 3 == 0) {
				System.out.println("Hello");
			} else if (Q % 5 == 0) { 
				System.out.println("World");
			} else {
				System.out.println(Q);
			}
		} 
				
	}

}
