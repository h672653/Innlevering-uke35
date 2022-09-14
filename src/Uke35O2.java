import java.util.Scanner;

public class Uke35O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int poeng;
		Scanner scan = new Scanner (System.in);
		System.out.println("Skriv ned poengsum");
		poeng = scan.nextInt();
		scan.close();
		
		{
			if (90<= poeng && poeng <=100) {
			System.out.println("A");
			}
			else if (80<= poeng && poeng <=89) {
			System.out.println("B");
			}
			else if (60 <= poeng && poeng <=79) {
			System.out.println("C");
			}
			else if (50 <= poeng && poeng <=59) {
			System.out.println("D");
			}
			else if (40 <= poeng && poeng <=49) {
			System.out.println("E");
			}
			else if (0 <= poeng && poeng <=39) {
			System.out.println("F");
			}
			else {
			System.out.println("Ugyldig prøv på nytt, prøv tall mellom 0-100");	
			}
		}}}

