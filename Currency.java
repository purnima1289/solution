import java.util.*;
import java.io.*;

class Currency {

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i< arr.length; i++){
			arr[i]= sc.nextInt();
		}
		int sum = sc.nextInt();
		int[] dp = new int[sum+1];
		dp[0] =1;
		for(int i = 0; i< arr.length; i++){
			for(int j= arr[i]; j< dp.length;j++){
				dp[j]+= dp[j - arr[i]];
			}
		}
		System.out.println(dp[sum]);
	}
}


