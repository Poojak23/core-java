class KeyChain{

String Brand;
String UserName;
int length;
String Password;
String Shape;

KeyChain(){
this("Honda","Reshma",10,"reshma@123","Rectangle");
System.out.println("Invoke the no-argumrnt...");

}

KeyChain(String Brand){
	System.out.println("Invoke the String argumrnt:"+Brand);
	this.Brand=Brand;	
}
KeyChain(String Brand,String Visibility){
	this("Honda");
	this.UserName=UserName;	
	System.out.println("Invoke the String,String argumrnt:"+Brand+","+UserName);
	
}
KeyChain(String Brand,String UserName,int length){
	this("Honda","Reshma");
	this.length=length;	
	System.out.println("Invoke the String,String,int argumrnt:"+Brand+","+UserName+","+length);
}

KeyChain(String Brand,String UserName,int length,String Password){
	this("Honda","Reshma",10);
	this.Password=Password;	
	System.out.println("Invoke the String,String,int, String argumrnt:"+Brand+","+UserName+","+length+","+Password);
}

KeyChain(String Brand,String UserName,int length,String Password,String Shape){
	this("Honda","Reshma",10,"reshma@123");
	this.Shape=Shape;	
	System.out.println("Invoke the String,String,int, String,String  argumrnt:"+Brand+","+UserName+","+length+","+Password+","+Shape);
}

}