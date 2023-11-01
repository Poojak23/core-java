class  Clock
{
	String brand;
	String name;
	String time;
	String shape;
	
	 Clock()
	{
		super();
		System.out.println("constucter with default parameter");
	}
	 Clock(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("Constructer with brand:" +brand);
	}
	 Clock(String brand,String name)
	{
		super();
		this.brand=brand;
		this.name=name;
		System.out.println("Constructer with brand:"+brand);
		System.out.println("Constructer with name:"+name);
	}
	 Clock(String brand,String name,String time)
	{
		super();
		this.brand=brand;
		this.name=name;
		this.time=time;
		System.out.println("Constructer with Name brand and time:"+brand+" "+name+" "+time);
		 
	}
	 Clock(String name,String brand,String shape,String time)
	{
		super();
		this.brand=brand;
		this.name=name;
		this.time=time;
		this.shape=shape;
		System.out.println("Constructer with name brand shape and time:"+shape+" "+name+" "+brand+" "+time);
		 
	}


}