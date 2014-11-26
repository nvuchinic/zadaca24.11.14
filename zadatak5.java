package zadaca;

public class zadatak5 {
	/**
	 * funkcija koja vraca sve trocifrene brojeve koji su djeljivim sa parametrom n
	 * @param n broj kojim se dijeli
	 */
	public static void ispisiDjeljiveBrojeve(int n){
		for(int i=100;i<=999;i++){
			if(i%n==0){
				System.out.println(i);
			}
		}
	}
	
public static void main(String[] args) {
	System.out.println("Unesite neki prirodan broj:");
	int br=TextIO.getInt();
	if(br>0){
		ispisiDjeljiveBrojeve(br);
		} else
	System.out.println("Greska, to nije prirodan broj");
}
}
