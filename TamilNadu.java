public class TamilNadu extends SouthIndia{
	static String capital = "Chennai";
	public TamilNadu(){
		
	}
	
		public TamilNadu(String primeMinister){
		super(primeMinister);
	}
	public void speakLanguage(){
	}
public  void eat(){
}
public void dress(){
}
	
public void cultivate(){
	System.out.println("Rice and Sugar cane cultivation");	
}
public void livingStyle(){
	System.out.println("Above Average development");
	
}
	
public static void main(String[] args)
{
	India1 ic= new TamilNadu(" Modi");
	SouthIndia si = new TamilNadu();
	System.out.println(India1.capital);
	System.out.println(TamilNadu.capital);
	si.cultivate();
	si.livingStyle();
	si.eat();
	si.speakLanguage();
	si.dress();
}

}
