
public class Week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 533);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello".charAt(0) == 'h');
		
		boolean IsHotOutside = true;
		boolean IsWeekday = false;
		boolean HasMoneyInPocket = true;
		
		int CostOfMilk = 2;
		int MoneyInWallet = 5;
		int ThirstLevel = 6;
//	A
		boolean ShouldBuyIcecream = IsHotOutside && HasMoneyInPocket;
		System.out.println(ShouldBuyIcecream);
		
		
//		if (IsHotOutside && HasMoneyInPocket) {
//			System.out.println("I should buy some ice cream!");
//		} else {
//			System.out.println("No ice cream for me");
//		} 	
//	B	
		boolean WillGoSwimming = IsHotOutside && !IsWeekday;
		System.out.println(WillGoSwimming);
		
		
//		if (IsHotOutside && !IsWeekday) {
//			System.out.println("I'm going for a dip in the pool!");
//		} else {
//			System.out.println("Staying inside to study boolean expressions!");
//		}
//	C	
		boolean IsAGoodDay = IsHotOutside && HasMoneyInPocket && !IsWeekday;
			System.out.println(IsAGoodDay);
		
			
//		if (IsHotOutside && HasMoneyInPocket && !IsWeekday) {
//			System.out.println("It's gonna be a great day!");
//		} else if (IsHotOutside && !HasMoneyInPocket && !IsWeekday) {
//			System.out.println("It is gonna be an Ok day");
//		} else if (IsHotOutside && HasMoneyInPocket && IsWeekday) {
//			System.out.println("Its a good day to study Java");
//		} else {
//			System.out.println("Today will need some assistance");
//		}
//	D
		boolean WillBuyMilk = IsHotOutside && (ThirstLevel >=3) && (MoneyInWallet >= (CostOfMilk*2));
			System.out.println(WillBuyMilk);
			
			

	}
}