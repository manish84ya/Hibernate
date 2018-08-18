package ex;

public class exe 
{
	public static void main(String[] args) 
	{
		int[] a = {1,0,5,0,8,9,0};
		int count = 0;
        for(int i = a.length-1; i>=0; i--) 
        {
            if(a[i] == 0) 
            {
                a[i] = a[a.length-1-count];
                a[a.length-1-count] = 0;
                count++;
            }
        }
        for(int i : a) 
        {
            System.out.print(i+ " ");
        }
	}
}