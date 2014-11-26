package zadaca;

import java.util.Scanner;

public class zadatak1 {
	/**
	 * Funkcija koja ispituje da li je broj simetrican
	 * @param n broj koji ispitujemo
	 * @return vraca true/false ovisno je li broj simetrican ili nije
	 */
	public static boolean isSymetric(int n) {
		boolean symetric=false;
		int obrBr=0,cif;
		int m=n;
		while(m>0){
			cif=m%10;
			obrBr=obrBr*10+cif;
			m=m/10;
		}
		//System.out.println(obrBr);
		if(obrBr==n)
			symetric=true;
		return symetric;
		
	}
	
	
public static void main(String[] args) {
	int br;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite neki broj:");
	br=unos.nextInt();
	boolean simetrican;
	while(br!=0){
		simetrican=isSymetric(br);
		if(simetrican==true)
			System.out.println("Broj je simetrican \n\n");
		else System.out.println("Broj nije simetrican \n\n");
		
		System.out.println("Unesite neki broj:");
		br=unos.nextInt();
	}
}
}
