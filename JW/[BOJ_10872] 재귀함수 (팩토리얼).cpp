// BOJ_10872 ÆÑÅä¸®¾ó
#include<cstdio>

int solve(int n) {
	if (n == 0) return 1;
	return solve(n - 1) * n;
}


int main() {

	int n;

	scanf_s("%d", &n);
	printf("%d", solve(n));


	return 0;
}