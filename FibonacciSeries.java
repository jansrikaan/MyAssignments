package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; int j=1; int sum=1;
		System.out.println(i);
		System.out.println(j);
		for (i = 3; i <=11; i++) {
			System.out.println(sum);
		i=j;
		j=sum;
		sum=i+j;
		
			
		}
	}

}
