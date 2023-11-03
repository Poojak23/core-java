class Month
{
String name;
int noOfDays;
int noOfWeekEnds;
int noOfHolidays;

Month(String name,int noOfDays,int noOfHolidays,int noOfWeekEnds)
{
	this.name=name;
	this.noOfDays=noOfDays;
	this.noOfHolidays=noOfHolidays;
	this.noOfWeekEnds=noOfWeekEnds;
	System.out.println("invoked String int int int args.... ");
}
 void displayInfo(){
		
		System.out.println("Starting displayInfo");
		System.out.println(this.name);
		System.out.println(this.noOfDays);
		System.out.println(this.noOfHolidays);
		System.out.println(this.noOfWeekEnds);
		
		
		System.out.println("Ending displayInfo");


}
}