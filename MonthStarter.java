 class MonthStarter{
	
	public static void main(String[] isfree){
		
		System.out.println("Starting main in MonthStarter");
		
		Month month=new Month("January",30,5,6);
		month.displayInfo();
		
		Month month1=new Month("Feb",30,5,6);
		month1.displayInfo();
		
		Month month2=new Month("March",31,5,7);
		month2.displayInfo();
		
		Month month3=new Month("April",30,5,6);
		month3.displayInfo();
		
		Month month4=new Month("May",31,6,6);
		month4.displayInfo();
		
		Month month5=new Month("June",30,5,7);
		month5.displayInfo();
		
		Month month6=new Month("July",31,5,6);
		month6.displayInfo();
		
		Month month7=new Month("August",31,5,8);
		month7.displayInfo();
		
		Month month8=new Month("September",30,5,4);
		month8.displayInfo();
		
		Month month9=new Month("October",31,5,9);
		month9.displayInfo();
		
		Month month10=new Month("November",30,5,7);
		month10.displayInfo();
		
		Month month11=new Month("December",31,5,6);
		month11.displayInfo();
				
	 
System.out.println("Ending main in MonthStarter");
	}
}