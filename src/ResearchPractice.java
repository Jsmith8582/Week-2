
public class ResearchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int z = 0; z <= 20; z ++) {
			System.out.println(z);
		}
		
//		int P = 16;
//		while (P <=15) {
//			
//			System.out.println(P);
//			P++;
//		}
//		do {
//			System.out.println(P);
//			P++;
//		} while (P <= 15);
//			
//		
		
		boolean IsWeekday = true;
		boolean IsSummer = true;
		boolean IsSchoolDay = IsWeekday && !IsSummer;
		System.out.println(IsSchoolDay);
	}

}
