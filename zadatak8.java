package zadaca;

public class zadatak8 {
	
	/**
	 * funkcija koja vraca onu cifru iz broja (prvi parametar) koja je naznacena drugim parametrom
	 * @param n broj iy kojeg vracamo cifru
	 * @param poz redni broj cifre koju vracamo
	 * @return vraca cifru naynacenu
	 */
	public static int vratiCifru(int n, int poz) {
		int broj=0,cif=0,trC;
		while(n>0){
			cif=n%10;
			++broj;
			if(poz==broj) {
				trC=cif;
				break;
			}
			n=n/10;
		}
		return cif;
	}
	
	
public static void main(String[] args) {
	System.out.println("Unesite broj i poziciju:");
	int br=TextIO.getInt();
	int p=TextIO.getInt();
	int trCif=vratiCifru(br,p);
	System.out.println("Trazena cifra je "+trCif);

}
}
