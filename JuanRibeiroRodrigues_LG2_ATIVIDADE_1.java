/* class 2   lesson-1

Calculate how much a smoker spends over a lifetime on cigarettes:

Consider 20 cigarettes per wallet
Report the total amount of money spent

Student: Juan Ribeiro Rodrigues / PRONT:SP309300X / 

SUBTITLE:  Y->Year   D->DAY  C-> BAG COST  T->MONEY SPENT
*/

import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {                             
		System.out.println("How many years have you been a smoker?");
		Scanner in = new Scanner(System.in);
		int Y, D, C, T;
		Y = in.nextInt(); 
		System.out.println("How many cigarettes do you smoke per day?");
		D = in.nextInt();
		System.out.println("How much does a cigarette bag cost?");
	    C = in.nextInt();
		T = C*((Y*(365*D)/20));
		System.out.println("This person spent on cigarettes: "+T);
	}
}


