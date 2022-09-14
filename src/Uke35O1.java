import java.util.Scanner;

public class Uke35O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int beløp; 
   
   Scanner scan = new Scanner (System.in);
   System.out.println("Skriv ned beløp");
   beløp = scan.nextInt();
   scan.close();
   
   if (934051 <= beløp) {
	   System.out.println("Trinn 4,   14.52%" + "\n"+ beløp * 0.1452);
   }
   else if (580651 <= beløp && beløp <=934050 ) {
	   System.out.println("Trinn 3,   11.52%" + "\n" + beløp * 0.1152);
  }
	
   else if (230951 <= beløp && beløp <=580650) {
	   System.out.println("Trinn 2   2.41%" + "\n" + beløp * 0.0241);
   }
   else if (164101 <= beløp && beløp <=230950) {
	   System.out.println("Trinn 1,   0.93%" + "\n" + beløp * 0.093);
   }
   else {
	   System.out.println("Trinn 0,   0%" + "\n" + beløp * 0);
   }
	}
	}
