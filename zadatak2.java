package zadaca;

public class zadatak2 {
	/**
	 * funkcija koja vraca informaciju da li string parametar sadrzi duple znakove
	 * @param str string koji ispitujemo 
	 * @return vraca boolean vrijednost(string ima/nema duplih znakova)
	 */
	public static boolean hasDoubleChar(String str){
		boolean doubleC=false;
		int brojac=0;
		int duz=str.length();
		for(int i=0;i<duz;i++){
			brojac=0;
			char znak=str.charAt(i);
			for(int j=0;j<duz;j++){
				if(znak==str.charAt(j)){
					++brojac;
					if(brojac>1){
				doubleC=true;
						break;	
				}
				}
			}
		}
		//if(brojac>1)
			//doubleC=true;
		return doubleC;
	}
	
public static void main(String[] args) {
	System.out.println("Unesite string:");
	String myString=TextIO.getln();
	
	boolean imaDupli=hasDoubleChar(myString);
	if(imaDupli==true)
		System.out.println("String ima duplih znakova");
	else
		System.out.println("String nema duplih znakova");
	

	
}
}
