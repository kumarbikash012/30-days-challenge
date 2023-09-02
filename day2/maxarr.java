// Maximum in array 


class Test
{
	static int arr[] = {0,1,2,3,4,5};
	
	static int largest()
	{
		int i;
		
		int max = arr[0];
		

		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		
		return max;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Largest in given array is " + largest());
		}
}
