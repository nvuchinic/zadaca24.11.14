package zadaca;

public class zadatak9 {
	/**
	 * funkcija koja vraca stepen unesenog broja b
	 * (mnozi broj samim sobom onoliko puta koliki iznosi drugi parametar)
	 * @param b predstavlja bazu, odnosno broj koji se stepenuje(mnozi samim sobom)
	 * @param st predstavlja stepen (broj puta koliko cemo parametar b mnoziti samim sobom)
	 * @return stepen broja b na st
	 */
	public static int pow(int b, int st) {
		int step=b;
	if(st==1)return b;
	else{
		for(int i=1;i<st;i++) {
			step=step*b;
		}
	}
	return step;
	}
	
public static void main(String[] args) {
	System.out.println("Unesite bazu i stepen:");
	int b=TextIO.getInt();
	int s=TextIO.getInt();
	int st=pow(b,s);
	System.out.println("Broj "+b+ " na stepen "+s+" iznosi "+st);
}
}
