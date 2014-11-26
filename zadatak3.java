package zadaca;

import java.util.Scanner;

public class zadatak3 {
	/**
	 * funkcija koja vraca broj koji se sastoji od samo parnih ili samo neparnih cifri
	 *  proslijedjenog broja, ovisno od vrijednosti drugog parametra
	 * @param n broj integer 
	 * @param paran boolean vrijednost
	 * @return vraca broj koji se sastoji od parnih ili neparnih cifri 
	 * proslijedjenog parametra n
	 */
	public static int podbroj(int n, boolean paran){
		int cif,parC=0,nepC=0,brN=1, brP=1;
		while(n>0) {
		cif=n%10;
		if(cif%2==0){
			parC=cif*brP+parC;
			brP=brP*10;
		}
		else {
			nepC=cif*brN+nepC;
			brN=brN*10;
		}
		n=n/10;
		
		}
		if(paran==true)
			return parC;
		else return nepC;
	}
	
	
public static void main(String[] args) {
	int a;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite neki broj:");
	a=unos.nextInt();
	
	while(a!=0){
		System.out.println("Broj od parnih cifara: "+podbroj(a,true));
		System.out.println("Broj od neparnih cifara "+podbroj(a,false));
		System.out.println("Unesite neki broj:");
		a=unos.nextInt();
	}
	

}
}
