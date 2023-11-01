class ClockStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in ClockStarterStarter");
		
		Clock clock=new  Clock();
		System.out.println("class name is:"+clock.name);
		System.out.println("clock shape is:"+clock.shape);
		System.out.println("clock BRAND is:"+clock.brand);
		System.out.println("clock time is:"+clock.time);
		
		
		Clock clock1=new  Clock("Titan");
		System.out.println("class name is:"+clock1.name);
		System.out.println("clock shape is:"+clock1.shape);
		System.out.println("clock BRAND is:"+clock1.brand);
		System.out.println("clock time is:"+clock1.time);
		
		 Clock clock2=new  Clock("Timex","grandfather clock");
		System.out.println("class name is:"+clock2.name);
		System.out.println("clock shape is:"+clock2.shape);
		System.out.println("clock BRAND is:"+clock2.brand);
		System.out.println("clock time is:"+clock2.time);
		
		
		 Clock clock3=new  Clock("casio","atomic clock","4 O clock");
		System.out.println("class name is:"+clock3.name);
		System.out.println("clock shape is:"+clock3.shape);
		System.out.println("clock BRAND is:"+clock3.brand);
		System.out.println("clock time is:"+clock3.time);
		
		 Clock clock4=new  Clock("water clock","seiko","round","3 O clock");
		System.out.println("clock name is:"+clock4.name);
		System.out.println("clock BRAND is:"+clock4.brand);
		System.out.println("clock shape is:"+clock4.shape);
		System.out.println("clock time is:"+clock4.time);
		
		System.out.println("Starting main in ClockStarter");
		

		
}
}