package basicjavaprograms;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of samples:");
		int n=sc.nextInt();
		int[] s=new int[n];
		System.out.println("enter samples:");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}
		System.out.print("enter number of ranges:");
		int r=sc.nextInt();
		int count=0;
		for(int k=0;k<r;k++)
		{
			System.out.println("enter lower range:");
			int l1=sc.nextInt();
			System.out.println("enter higher range:");
			int l2=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				if((s[i]>=l1)&&(s[i]<=l2))
				{
				count++;	
				}
			}
			System.out.println(count+" ");
			count=0;
		}
		
	}

}
