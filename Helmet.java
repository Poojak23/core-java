class Helmet
{

String Brand;
String Visibility;
int weight;
String Size;
String OuterShell;

Helmet(){

System.out.println("Invoke the no-argumrnt...");

}

Helmet(String Brand){
	System.out.println("Invoke the String argumrnt:"+Brand);
	this.Brand=Brand;	
}
Helmet(String Brand,String Visibility){
	this("Sportgear");
	this.Visibility=Visibility;	
	System.out.println("Invoke the String,String argumrnt:"+Brand+","+Visibility);
	
}
Helmet(String Brand,String Visibility,int weight){
	this("Sportgear","BrightColour");
	this.weight=weight;	
	System.out.println("Invoke the String,String,int argumrnt:"+Brand+","+Visibility+","+weight);
}

Helmet(String Brand,String Visibility,int weight,String Size){
	this("Sportgear","BrightColour",100);
	this.Size=Size;	
	System.out.println("Invoke the String,String,int, String argumrnt:"+Brand+","+Visibility+","+weight+","+Size);
}

Helmet(String Brand,String Visibility,int weight,String Size,String OuterShell){
	this("Sportgear","BrightColour",100,"Circular");
	this.OuterShell=OuterShell;	
	System.out.println("Invoke the String,String,int, String,String  argumrnt:"+Brand+","+Visibility+","+weight+","+Size+","+OuterShell);
}


}