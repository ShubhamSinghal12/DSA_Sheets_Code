int countDigits(int n){
	// Write your code here.
	int count = 0;
	int temp = n;
	while(temp != 0)
	{
		int rem = temp%10;
		if(rem != 0 && n % rem == 0) count++;
		temp = temp/10;
	}
	return count;
}