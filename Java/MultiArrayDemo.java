class MultiArrayDemo
{
	public static void main(String[] args)
	{
		int[][] arr=new int[2][2];//declaration
		int[][] arr3={
				{5,6},
			      	{7,8}
			    };
		int[][] arr4=new int[][]{
				{5,6},
			      	{7,8}
			    };
		int[][] arr5=new int[2][2];
		arr5[0][0]=7;
		arr5[0][1]=2;
		arr5[1][0]=4;
		arr5[1][1]=8;

	

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr5[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}