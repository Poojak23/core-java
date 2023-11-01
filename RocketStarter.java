class RocketStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in RocketStarter");
		
		Rocket rocket=new Rocket();
		System.out.println("rocket name is:"+rocket.name);
		System.out.println("rocket engine name is:"+rocket.engineName);
		System.out.println("rocket length is:"+rocket.length);
		System.out.println("rocket weight is:"+rocket.weight);
		System.out.println("rocket fuel type is:"+rocket.fuelType);
		
		
		Rocket rocket1=new Rocket("Vikas");
		System.out.println("rocket name is:"+rocket1.name);
		System.out.println("rocket engine name is:"+rocket1.engineName);
		System.out.println("rocket length is:"+rocket1.length);
		System.out.println("rocket weight is:"+rocket1.weight);
		System.out.println("rocket fuel type is:"+rocket1.fuelType);
		
		Rocket rocket2=new Rocket("Viking","pragyan");
		System.out.println("rocket name is:"+rocket2.name);
		System.out.println("rocket engine name is:"+rocket2.engineName);
		System.out.println("rocket length is:"+rocket2.length);
		System.out.println("rocket weight is:"+rocket2.weight);
		System.out.println("rocket fuel type is:"+rocket2.fuelType);
		
		
		Rocket rocket3=new Rocket("Vikas","LMV-130",800);
		System.out.println("rocket name is:"+rocket3.name);
		System.out.println("rocket engine name is:"+rocket3.engineName);
		System.out.println("rocket length is:"+rocket3.length);
		System.out.println("rocket weight is:"+rocket3.weight);
		System.out.println("rocket fuel type is:"+rocket3.fuelType);
		
		Rocket rocket4=new Rocket("Vikas",900,200,"Liquid hydrogen");
		System.out.println("rocket name is:"+rocket4.name);
		System.out.println("rocket engine name is:"+rocket4.engineName);
		System.out.println("rocket length is:"+rocket4.length);
		System.out.println("rocket weight is:"+rocket4.weight);
		System.out.println("rocket fuel type is:"+rocket4.fuelType);
		
		//Rocket rocket5=new Rocket("Vikas",900,200,"Liquid hydrogen");
		//System.out.println("rocket name is:"+rocket5.name);
		//System.out.println("rocket engine name is:"+rocket5.engineName);
		//System.out.println("rocket length is:"+rocket5.length);
		//System.out.println("rocket weight is:"+rocket5.weight);
		//System.out.println("rocket fuel type is:"+rocket5.fuelType);
		
		System.out.println("Starting main in RocketStarter");
		
	}
}