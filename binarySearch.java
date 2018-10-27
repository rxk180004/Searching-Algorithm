package Sorting;

public class binarySearch {
	public static int binarysearch(int a[],int l,int r,int p) {
		if(l<=r) {
		 int mid=l+(r-l)/2;
		 
		 if (a[mid]==p) {
			 return mid;
		 }
		 else if(a[mid]>p){
			 return binarysearch(a,l,mid-1,p);
		 }
		 else if (a[mid]<p){
			 return binarysearch(a,mid+1,r,p);
		 }
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[]= {0,1,2,12};
		int n=a.length;
		int x=12;
		int result=binarysearch(a,0,n-1,x);
		
		if(result>=0) {
			System.out.println("element found at index:"+ result);
		}else {
		System.out.println("element not found");
		
	}

		

	}

}
