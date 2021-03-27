//we can perform initialisation,condition,incr/decr in one line
//thereby making the code compact

class ForDemo
{
	public static void main(String[] args)
	{
		//if there is only one statement belonging to block
		//then we need not to provide { }
		/*for(int i=0;i<10;i++)
		{
			System.out.println("Hello");
			System.out.println(i);
		}*/

		int i=0;
		
		for(;i<10;i++)
		{
			System.out.println("Hello");
			System.out.println(i);
		}
	}
}