import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isArmStrong(n));

	}

	public static boolean isArmStrong(int n)
	{
		int digits = (int)Math.log10(n)+1;
		int temp = n;
		int sum = 0;
		while(temp != 0)
		{
			sum += (int)Math.pow((temp%10),digits);
			temp /= 10;
		}
		return sum == n;
	}
}
