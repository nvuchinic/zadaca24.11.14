package zadaca;

public class zadatak7 {
	
	public static int randomInInterval(int min, int max){
		int rand=min + (int)(Math.random() * ((max - min) + 1));
//Min + (int)(Math.random() * ((Max - Min) + 1))
		return rand;
	}
	
	public static boolean isOdd(int br){
		boolean odd=false;
		if(br%2!=0)
			odd=true;
		return odd;
	}
	
public static void main(String[] args) {
	int n,start, end;
	System.out.println("Unesite pocetak i kraj intervala:");
	start=TextIO.getInt();
	end=TextIO.getInt();
	for(int i=1;i<=5;i++){
		n=randomInInterval(start,end);
		System.out.print("Generisali smo broj "+n+", ");
		if(isOdd(n)==true)
			System.out.println("broj je neparan");
		else
			System.out.println("broj je paran");
	}
}
}
