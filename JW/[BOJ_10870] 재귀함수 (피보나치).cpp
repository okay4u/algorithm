// BOJ_10870 피보나치
#include<cstdio>

int solve(int n) {

	if (n == 0) return 0;
	if (n == 1) return 1;
	/*
	0 1 2 3 5 8 13 21 
		
	*/
	return solve(n-1) + solve(n - 2);

	/*
	n = 2, solve(1) + solve(0)
	n = 3, solve(2) + solve(1) 
	    -> solve(2) => solve(1) + solve(0) 
	*/
}


int main() {

	int n;
	scanf_s("%d", &n);

	printf("%d", solve(n));
	

	return 0;
}