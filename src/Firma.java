import java.util.Scanner;

public class Firma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Een firma verkoopt balpennen in grote aantallen.\nBestellen: ");
		int bestel = input.nextInt();
		
		double prijs;
		int rest;
		
		if(bestel >= 0 && bestel < 10) {
			
			prijs = bestel * 2;
			System.out.print("De prijs: SRD "+Math.round(prijs*100.00)/100.00);
		}
		else if(bestel >= 10 && bestel < 50) {
			
			rest = bestel-(bestel % 2 + 1);
			prijs = (rest*2) + ((bestel-9)*1.50);
			System.out.print("De prijs: SRD "+Math.round(prijs*100.00)/100.00);
		}
		else if(bestel >= 50 && bestel <= 100) {

			rest = bestel-(bestel % 2 + 1);
			prijs = ((rest*2) + ((bestel-9)*1.50)) + ((bestel-49)*1.25);
			System.out.print("De prijs: SRD "+Math.round(prijs*100.00)/100.00);
		}
		else if(bestel > 100) {

			rest = bestel-(bestel % 2 + 1);
			prijs = (((rest*2) + ((bestel-9)*1.50)) + ((bestel-49)*1.25)) + ((bestel-100)*1.10);
			System.out.print("De prijs: SRD "+Math.round(prijs*100.00)/100.00);
	}

}
}
