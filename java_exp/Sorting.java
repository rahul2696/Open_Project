import java.util.Arrays;  
public class Sorting
{  
public static int removeDuplicate(int arr[], int n)
{  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int d = 0;  
        for (int i=0; i<n-1; i++)
		{  
            if (arr[i] != arr[i+1])
			{  
                temp[d++] = arr[i];  
            }  
         }  
        temp[d++] = arr[n-1];     
        
        for (int i=0; i<d; i++)
		{  
            arr[i] = temp[i];  
        }  
        return d;  
    }  
       
    public static void main (String[] args) 
	{  
        int arr[] = {1,1,2,2,3,3,6,6}; 
        Arrays.sort(arr);  
        int length = arr.length;  
        length = removeDuplicate(arr,length);  
       
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  