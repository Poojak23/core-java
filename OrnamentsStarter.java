class OrnamentsStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in OrnamentsStarter");
		
		Ornaments ornaments=new Ornaments();
		System.out.println("ornaments type is:"+ornaments.type);
		System.out.println("ornaments designType is:"+ornaments.designType);
		System.out.println("ornaments cost is:"+ornaments.cost);
		System.out.println("ornaments weight is:"+ornaments.weight);
		
		Ornaments ornaments1=new Ornaments("gold");
		System.out.println("ornaments type is:"+ornaments1.type);
		System.out.println("ornaments designType is:"+ornaments1.designType);
		System.out.println("ornaments cost is:"+ornaments1.cost);
		System.out.println("ornaments weight is:"+ornaments1.weight);
		
		Ornaments ornaments2=new Ornaments("silver","flower design");
		System.out.println("ornaments type is:"+ornaments2.type);
		System.out.println("ornaments designType is:"+ornaments2.designType);
		System.out.println("ornaments cost is:"+ornaments2.cost);
		System.out.println("ornaments weight is:"+ornaments2.weight);
		
		Ornaments ornaments3=new Ornaments("gold","lakshmi design",5200);
		System.out.println("ornaments type is:"+ornaments3.type);
		System.out.println("ornaments designType is:"+ornaments3.designType);
		System.out.println("ornaments cost is:"+ornaments3.cost);
		System.out.println("ornaments weight is:"+ornaments3.weight);
		
		Ornaments ornaments4=new Ornaments("copper",6000,30,"round");
		System.out.println("ornaments type is:"+ornaments4.type);
		System.out.println("ornaments designType is:"+ornaments4.designType);
		System.out.println("ornaments cost is:"+ornaments4.cost);
		System.out.println("ornaments weight is:"+ornaments4.weight);
	
System.out.println("ending main in OrnamentsStarter");	
    }
}