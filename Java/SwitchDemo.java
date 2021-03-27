class SwitchDemo
{
	public static void main(String[] args)
	{
		int dir=Integer.parseInt(args[0]);
		switch(dir)
		{
			case 1:
				System.out.println("East");			
				break;
	
			case 2:
				System.out.println("West");			
				break;

			case 3:
				System.out.println("North");			
				break;

			case 4:
				System.out.println("South");			
				break;	

			default:
				System.out.println("please enter number between 1-4");			
				break;	
						
		}
	}
}