package Sorting;
import java.util.*;

public class TernarySearch {
			public static int tenarysearch(int a[],int l,int r,int p) {
				if(l<=r) {
				 int mid=l+(r-l)/3;
				 int mid1=mid+(r-l)/3;
				 if (a[mid]==p) {
					 return mid;
				 }
				 else if (a[mid1]==p) {
					 return mid1;
				 }
				 else if(a[mid]>p){
					 return tenarysearch(a,l,mid-1,p);
				 }
				 else if (a[mid1]<p){
					 return tenarysearch(a,mid1+1,r,p);
				 }
				 else {
					 return tenarysearch(a,mid+1,mid1-1,p);
				 }
				}
				return -1;
			}

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("How many elements do you want to store :");
				int n=sc.nextInt();
				int a[]= new int[n];
				
				System.out.println("Enter array of sorted elements");
				for(int i=0;i<n;i++) {
					a[i]=sc.nextInt();
				}
				System.out.println("Enter the element you want to search");
				int ele=sc.nextInt();
				int n1=a.length;
				int result=tenarysearch(a,0,n-1,ele);
				
				if(result>=0) {
					System.out.println("element found at index:"+ result);
				}
				else {
				System.out.println("element not found");
				}
		}
}
