class Bracelet{

String Matetrial;
String Design;
int weigth;
String Size;
String Porpose;

Bracelet(){
this("gemstones","tennis bracelets",50,"comfortably fit","wristwatches ");
System.out.println("Invoke the no-argumrnt...");

}

Bracelet(String Matetrial){
	System.out.println("Invoke the String argumrnt:"+Matetrial);
	this.Matetrial=Matetrial;	
}
Bracelet(String Matetrial,String Design){
	this("gemstones");
	this.Design=Design;	
	System.out.println("Invoke the String,String argumrnt:"+Matetrial+","+Design);
	
}
Bracelet(String Matetrial,String Design,int weigth){
	this("gemstones","tennis bracelets");
	this.weigth=weigth;	
	System.out.println("Invoke the String,String,int argumrnt:"+Matetrial+","+Design+","+weigth);
}

Bracelet(String Matetrial,String Design,int length,String Size){
	this("gemstones","tennis bracelets",50);
	this.Size=Size;	
	System.out.println("Invoke the String,String,int, String argumrnt:"+Matetrial+","+Design+","+weigth+","+Size);
}

Bracelet(String Matetrial,String Design,int length,String Password,String Porpose){
	this("gemstones","tennis bracelets",50,"comfortably fit");
	this.Porpose=Porpose;	
	System.out.println("Invoke the String,String,int, String,String  argumrnt:"+Matetrial+","+Design+","+weigth+","+Size+","+Porpose);
}

}