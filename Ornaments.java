class  Ornaments
{
	String type="metal";//litrals
	String designType;
	double cost;
	int weight;
	
	 Ornaments()
	{
		super();
		System.out.println("constucter with default parameter");
	}
	 Ornaments(String type)
	{
		super();
		this.type=type;
		System.out.println("Constructer with type:" +type);
	}
	 Ornaments(String type,String designType)
	{
		super();
		this.type=type;
		this.designType=designType;
		System.out.println("Constructer with type:"+type);
		System.out.println("Constructer with designType:"+designType);
	}
	 Ornaments(String type,String designType,double cost)
	{
		super();
		this.type=type;
		this.designType=designType;
		this.cost=cost;
		System.out.println("Constructer with type designType and cost:"+type+" "+designType+" "+cost);
		 
	}
	 Ornaments(String type,double cost,int weight ,String designType)
	{
		super();
		this.type=type;
		this.designType=designType;
		this.cost=cost;
		this.weight=weight;
		System.out.println("Constructer with type designType weight and cost:"+cost+" "+type+" "+weight+" "+designType);
		 
	}


}