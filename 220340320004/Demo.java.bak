//insertion sort problem
import java.util.*;
class Demo{
	
	
	static void insertionSort(int[]a1,int n){
		
		
		for(int j=1;j<n;j++)	
		{	
			int k=a1[j];
			int i=j-1;
			while(i>=0&&a1[i]>k)
			{	
			a1[i+1]=a1[i];
			i=i-1;
			}
			a1[i+1]=k;
		}
		
		for(int k=0;k<n;k++)
		{
			System.out.print(" "+a1[k]);
		}
	}
	
	


	public static void main(String[]args){

	int a1[]={1,2,4,5,3};
	int n=a1.length;
	
	insertionSort(a1,n);
	
	}

}