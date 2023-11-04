package pasha;

public class DuplicateElement {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5};
		
		for (int i =0 ; i<a.length;i++) {
			int count = 0;
			for (int j = i+1; j<a.length;j++) {
				if (a[i]==a[j]) {
					count++;
					a[j]='$';
				}
			}
			if(count>0 && a[i] !='$') {
				System.out.println(a[i]+"value repeated"+count);
			}
		}
	}
}
