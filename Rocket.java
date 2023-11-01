class Rocket
{
	String engineName;
	String name;
	String fuelType;
	double weight;
	int length;
	
	Rocket()
	{
		super();
		System.out.println("constucter with default parameter");
	}
	Rocket(String engineName)
	{
		super();
		this.engineName=engineName;
		System.out.println("Constructer with engineName:" +engineName);
	}
	Rocket(String engineName,String name)
	{
		super();
		this.engineName=engineName;
		this.name=name;
		System.out.println("Constructer with engineName:"+engineName);
		System.out.println("Constructer with name:"+name);
	}
	Rocket(String engineName,String name,double weight)
	{
		super();
		this.engineName=engineName;
		this.name=name;
		this.weight=weight;
		System.out.println("Constructer with engineName name and weight:"+engineName+" "+name+" "+weight);
		 
	}
	Rocket(String name,double weight,int length,String fuelType)
	{
		super();
		this.length=length;
		this.name=name;
		this.weight=weight;
		this.fuelType=fuelType;
		System.out.println("Constructer with name length weight and fuelType:"+length+" "+name+" "+weight+" "+fuelType);
		 
	}


}