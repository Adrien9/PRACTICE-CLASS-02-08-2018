package card;
import java.util.Scanner;
public class cardtest {

	public static void main(String[]args){
		
		Scanner scanner=new Scanner(System.in);
	
		card card1type1= new card(1," of hearts");
		card card1type2= new card(1," of diamonds");
		card card1type3= new card(1," of clubs");
		
		card card2type1= new card(2," of hearts");
		card card2type2= new card(2," of diamonds");
		card card2type3= new card(2," of clubs");
		
		card card3type1= new card(3," of hearts");
		card card3type2= new card(3," of diamonds");
		card card3type3= new card(3," of clubs");
		
		card card4type1= new card(4," of hearts");
		card card4type2= new card(4," of diamonds");
		card card4type3= new card(4," of clubs");
		
		card card5type1= new card(5," of hearts");
		card card5type2= new card(5," of diamonds");
		card card5type3= new card(5," of clubs");
		
		card card6type1= new card(6," of hearts");
		card card6type2= new card(6," of diamonds");
		card card6type3= new card(6," of clubs");
		
		card card7type1= new card(7," of hearts");
		card card7type2= new card(7," of diamonds");
		card card7type3= new card(7," of clubs");
		
		card card8type1= new card(8," of hearts");
		card card8type2= new card(8," of diamonds");
		card card8type3= new card(8," of clubs");
		
		card card9type1= new card(9," of hearts");
		card cardluck=new card(9, "of diamonds");
		card card9type3= new card(9," of clubs");
		
		System.out.println(card1type1.number);
		System.out.println(card1type1.suit);
		System.out.println(card1type2.number);
		System.out.println(card1type2.suit);
		System.out.println(card1type3.number);
		System.out.println(card1type3.suit);
		
		System.out.println(card2type1.number);
		System.out.println(card2type1.suit);
		System.out.println(card2type2.number);
		System.out.println(card2type2.suit);
		System.out.println(card2type3.number);
		System.out.println(card2type3.suit);
		
		System.out.println(card3type1.number);
		System.out.println(card3type1.suit);
		System.out.println(card3type2.number);
		System.out.println(card3type2.suit);
		System.out.println(card3type3.number);
		System.out.println(card3type3.suit);
		
		System.out.println(card4type1.number);
		System.out.println(card4type1.suit);
		System.out.println(card4type2.number);
		System.out.println(card4type2.suit);
		System.out.println(card4type3.number);
		System.out.println(card4type3.suit);
		
		System.out.println(card5type1.number);
		System.out.println(card5type1.suit);
		System.out.println(card5type2.number);
		System.out.println(card5type2.suit);
		System.out.println(card5type3.number);
		System.out.println(card5type3.suit);
		
		System.out.println(card6type1.number);
		System.out.println(card6type1.suit);
		System.out.println(card6type2.number);
		System.out.println(card6type2.suit);
		System.out.println(card6type3.number);
		System.out.println(card6type3.suit);
		
		System.out.println(card7type1.number);
		System.out.println(card7type1.suit);
		System.out.println(card7type2.number);
		System.out.println(card7type2.suit);
		System.out.println(card7type3.number);
		System.out.println(card7type3.suit);
		
		System.out.println(card8type1.number);
		System.out.println(card8type1.suit);
		System.out.println(card8type2.number);
		System.out.println(card8type2.suit);
		System.out.println(card8type3.number);
		System.out.println(card8type3.suit);
		
		System.out.println(card9type1.number);
		System.out.println(card9type1.suit);
		System.out.println(cardluck.number);
		System.out.println(cardluck.suit);
		System.out.println(card9type3.number);
		System.out.println(card9type3.suit);


		System.out.println("Which suit is the the lucky card?");
		String su=scanner.nextLine();
		
		System.out.println("Which number is the the lucky card?");
		int num=scanner.nextInt();
		
	

		if(num==cardluck.number && su.equals(cardluck.suit)){
	
			System.out.println("You guessed the right card!");
		}
		
		else
		
		{
			
			System.out.println("You did not guess the right card.");
		}
	}
}


