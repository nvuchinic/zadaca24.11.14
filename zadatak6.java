package zadaca;

import java.util.Scanner;

public class zadatak6 {
/**
 * funkcija koja vraca informaciju da li je parametar broj(br) djeljiv 
 * sa drugim parametrom(djelilac)
 * @param br broj ciju djeljivost provjeravamo
 * @param djelilac 
 * @return vraca boolean vrijednost da li je broj djeljiv ili ne sa djeliocem
 */
	public static boolean jeDjeljiv(int br, int  djelilac){
		boolean djeljiv=false;
		if(br%djelilac==0)
			djeljiv =true;
		return djeljiv;
	}
	
	public static void main(String[] args) {
	int n;
	System.out.println("Unesite neki broj:");
	Scanner unos=new Scanner(System.in);
	n=unos.nextInt();
	unos.close();
	for(int i=n;i>0;i--){
		if((jeDjeljiv(i,5))||(jeDjeljiv(i,7))||(jeDjeljiv(i,11))){
			System.out.println(i);
		}
	}
	
}
}
