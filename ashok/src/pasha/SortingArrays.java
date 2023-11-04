package pasha;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SortingArrays {
	public static void main(String[] args) {
		SortingArrays sa = new SortingArrays();
		sa.SortEle();
		System.out.println("********");
		sa.SortEle2();
		System.out.println("**************");
		sa.SortEle3();
	}

	public void SortEle() {
			int a[]= {8,9,20,13,14,11,6,7,8,9,1,2,3,4},temp;
			for (int i = 0; i<a.length; i++) {
				for (int j = i+1; j<a.length; j++) {
					if (a[i]>a[j]){
						temp = a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]+" ");
		}}

	public void SortEle2() {
		int a[] = { 6, 7, 8, 9, 10, 1, 2,20,11,212,33,45, 3, 4, 5 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	public void SortEle3() {
		int a[]= {3,4,5,6,7,8,9,1,2,10,11,12,18,19,16};
		List<int[]>list = Arrays.asList(a);
		Set<Integer>Set = new TreeSet<Integer>();
		
	}
}
