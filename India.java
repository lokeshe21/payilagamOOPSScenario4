public class India{
static String capital="New Delhi";
String citizenName;
int age;// if no value assigned by default 0 for short int long
float height;// by default it is 0.0
boolean nri;// by default false
String fatherName;//by default set to null if no value assigned
	
public static void main(String[] args)
{
	//int xy;
	//System.out.println(xy);
India citizen= new India();
India citizen2= new India();
citizen.age=27;
citizen.height= 5.7f;
citizen.nri=false;
citizen.fatherName= "Elumalai";
citizen.citizenName="Lokesh";
System.out.println(citizen.fatherName);
System.out.println(citizen.age);
System.out.println(citizen.height);
System.out.println(citizen.nri);
System.out.println(India.capital);//class specific object
System.out.println(citizen.citizenName);
citizen2.age=27;
citizen2.height= 5.7f;
citizen2.nri=false;
citizen2.fatherName= "Pqr";
citizen2.citizenName="Xyz";
System.out.println(citizen2.fatherName);
System.out.println(citizen2.age);
System.out.println(citizen2.height);
System.out.println(citizen2.nri);
System.out.println(India.capital);//class specific object
System.out.println(citizen2.citizenName);
	citizen.applyPan();
	
}
public void applyPan(){
}
}

	
	
	