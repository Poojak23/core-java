class KeyBoardStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in KeyBoardStarter");
		
		KeyBoard keyboard=new KeyBoard();
		System.out.println("keyboard color is:"+keyboard.color);
		System.out.println("keyboard brand is:"+keyboard.brand);
		System.out.println(" noOfKeys in keyboard  is:"+keyboard.noOfKeys);
		System.out.println("keyboard type is:"+keyboard.type);
		System.out.println("keyboard cost is:"+keyboard.cost);

		
		KeyBoard keyboard1=new KeyBoard("red");
		System.out.println("keyboard color is:"+keyboard1.color);
		System.out.println("keyboard brand is:"+keyboard1.brand);
		System.out.println("noOfKeys in keyboard  is:"+keyboard1.noOfKeys);
		System.out.println("keyboard type is:"+keyboard1.type);
		System.out.println("keyboard cost is:"+keyboard1.cost);
		
		KeyBoard keyboard2=new KeyBoard("blue","lenova");
		System.out.println("keyboard color is:"+keyboard2.color);
		System.out.println("keyboard brand is:"+keyboard2.brand);
		System.out.println(" noOfKeys in keyboard  is:"+keyboard2.noOfKeys);
		System.out.println("keyboard type is:"+keyboard2.type);
		System.out.println("keyboard cost is:"+keyboard2.cost);
		
		KeyBoard keyboard3=new KeyBoard("white"," HP",44);
		System.out.println("keyboard color is:"+keyboard3.color);
		System.out.println("keyboard brand is:"+keyboard3.brand);
		System.out.println(" noOfKeys in keyboard  is:"+keyboard3.noOfKeys);	
		System.out.println("keyboard type is:"+keyboard3.type);
		System.out.println("keyboard cost is:"+keyboard3.cost);
		
		KeyBoard keyboard4=new KeyBoard("pink","hp",41,"membrane keyboard");
		System.out.println("keyboard color is:"+keyboard3.color);
		System.out.println("keyboard brand is:"+keyboard3.brand);
		System.out.println(" noOfKeys in keyboard  is:"+keyboard3.noOfKeys);
		System.out.println("keyboard type is:"+keyboard3.type);
		System.out.println("keyboard cost is:"+keyboard3.cost);
		
		KeyBoard keyboard5=new KeyBoard("grey","apple",49,"razer pro ultra",680);
		System.out.println("keyboard color is:"+keyboard5.color);
		System.out.println("keyboard brand is:"+keyboard5.brand);
		System.out.println(" noOfKeys in keyboard  is:"+keyboard5.noOfKeys);
		System.out.println("keyboard type is:"+keyboard5.type);
		System.out.println("keyboard cost is:"+keyboard5.cost);
		
		
		
		
		System.out.println("Starting main in KeyBoardStarter");
	}
}