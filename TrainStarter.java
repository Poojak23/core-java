 class TrainStarter
{
	public static void main(String[] args)
	{
		System.out.println("running main in TrainStarter");
		
		Train train=new Train();
		System.out.println("Train name is:"+train.name);
		System.out.println("Train length is:"+train.length);
		System.out.println("Train color is:"+train.color);
		System.out.println("************");
		
		Train train1=new Train();
		System.out.println("Train name is:"+train1.name);
		System.out.println("Train length is:"+train1.length);
		System.out.println("Train color is:"+train1.color);
		System.out.println("************");
		
		
		PenDrive penDrive=new PenDrive();
		System.out.println("PenDrive brand is:"+penDrive.brand);
		System.out.println("penDrive length is:"+penDrive.length);
		System.out.println("penDrive space is:"+penDrive.space);
		System.out.println("************");
		
		PenDrive penDrive1=new PenDrive();
		System.out.println("PenDrive brand is:"+penDrive1.brand);
		System.out.println("penDrive length is:"+penDrive1.length);
		System.out.println("penDrive space is:"+penDrive1.space);
		System.out.println("************");
		
		
		Perfume perfume=new Perfume();
		System.out.println("Perfume brand is:"+perfume.brand);
		System.out.println("Perfume fragrance is:"+perfume.fragrance);
		System.out.println("Perfume cost is:"+perfume.cost);
		System.out.println("************");
		
		Perfume perfume1=new Perfume();
		System.out.println("Perfume brand is:"+perfume1.brand);
		System.out.println("Perfume fragrance is:"+perfume1.fragrance);
		System.out.println("Perfume cost is:"+perfume1.cost);
		System.out.println("************");
		
		
		Ambulence ambulence=new Ambulence();
		System.out.println("Ambulence type is:"+ambulence.type);
		System.out.println("Ambulence cameraModel is:"+ambulence.cameraModel);
		System.out.println("Ambulence speed is:"+ambulence.speed);
		System.out.println("************");
		
		Ambulence ambulence1=new Ambulence();
		System.out.println("Ambulence type is:"+ambulence1.type);
		System.out.println("Ambulence cameraModel is:"+ambulence1.cameraModel);
		System.out.println("Ambulence speed is:"+ambulence1.speed);
		System.out.println("************");
		
		Hospital hospital=new Hospital();
		System.out.println("Hospital name is:"+hospital.name);
		System.out.println("Hospital location is:"+hospital.location);
		System.out.println("deptNames in Hospital is:"+hospital.deptNames);
		System.out.println("************");
		
		Hospital hospital1=new Hospital();
		System.out.println("Hospital name is:"+hospital1.name);
		System.out.println("Hospital location is:"+hospital1.location);
		System.out.println("deptNames in Hospital is:"+hospital1.deptNames);
		System.out.println("************");
		
		
		Mall mall=new Mall();
		System.out.println("Mall location is:"+mall.location);
		System.out.println("noOfWorkers in Mall is:"+mall.noOfWorkers);
		System.out.println("Mall owner name is:"+mall.ownerName);
		System.out.println("************");
		
		Mall mall1=new Mall();
		System.out.println("Mall location is:"+mall1.location);
		System.out.println("noOfWorkers in Mall is:"+mall1.noOfWorkers);
		System.out.println("Mall owner name is:"+mall1.ownerName);
		System.out.println("************");
		
		
		Temple temple=new Temple();
		System.out.println("Temple  name is:"+temple.name);
		System.out.println("Temple deity is:"+temple.deity);
		System.out.println("Temple constYear is:"+temple.constYear);
		System.out.println("*************");
		
		Temple temple1=new Temple();
		System.out.println("Temple  name is:"+temple1.name);
		System.out.println("Temple deity is:"+temple1.deity);
		System.out.println("Temple constYear is:"+temple1.constYear);
		System.out.println("************");
		
		
		Kidney kidney=new Kidney();
		System.out.println("Kidney length:"+kidney.length);
		System.out.println("Kidney weight is:"+kidney.weight);
		System.out.println("Kidney shape is:"+kidney.shape);
		System.out.println("************");
		
		Kidney kidney1=new Kidney();
		System.out.println("Kidney length:"+kidney1.length);
		System.out.println("Kidney weight is:"+kidney1.weight);
		System.out.println("Kidney shape is:"+kidney1.shape);
		System.out.println("************");
		
		
		BusStand busStand=new BusStand();
		System.out.println("BusStand location is:"+busStand.location);
		System.out.println("BusStand name is:"+busStand.name);
		System.out.println("no of people in BusStand:"+busStand.noOfPeopleInBusStand);
		System.out.println("************");
		
		BusStand busStand1=new BusStand();
		System.out.println("BusStand location is:"+busStand1.location);
		System.out.println("BusStand name is:"+busStand1.name);
		System.out.println("no of people in BusStand:"+busStand1.noOfPeopleInBusStand);
		System.out.println("************");
		
		
		
		AllStation station=new AllStation();
		System.out.println("Station location is:"+station.location);
		System.out.println("Station name is:"+station.nameOfStation);
		System.out.println("pin of Station:"+station.pin);
		System.out.println("************");
		
		AllStation station1=new AllStation();
		System.out.println("Station location is:"+station1.location);
		System.out.println("Station name is:"+station1.nameOfStation);
		System.out.println("pin of Station:"+station1.pin);
		System.out.println("************");
		
		
		SpaceStation spaceStation=new SpaceStation();
		System.out.println("SpaceStation distance is:"+spaceStation.distance);
		System.out.println("no of starts in space:"+spaceStation.noOfStars);
		System.out.println("name of the galaxy is:"+spaceStation.galaxyName);
		System.out.println("************");
		
		SpaceStation spaceStation1=new SpaceStation();
		System.out.println("SpaceStation distance is:"+spaceStation1.distance);
		System.out.println("no of starts in space:"+spaceStation1.noOfStars);
		System.out.println("name of the galaxy is:"+spaceStation1.galaxyName);
		System.out.println("************");
		
		
		
		System.out.println("ending main in TrainStarter");
	}
}