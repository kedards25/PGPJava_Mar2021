	/*
	Array
	Refers to multiple values using one reference variable
	Array is defined as collection of elements of same data type stored in adjecant memory 		location*/

//Java program by default imports java.lang.object 
//we call these libraries, packages in java
import java.util.Date;

class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] arr=new int[3];//declaration
		int[] arr3={5,6,8};
		int[] arr4=new int[]{5,6,8};
		int[] arr5=new int[3];
		arr5[0]=7;
		arr5[1]=2;
		arr5[2]=4;

		Date currDate=new Date();
		System.out.println(currDate);
	

		for(int i=0;i<3;i++)
		{
			System.out.print(arr5[i]+"\t");
		}
		
	}
}