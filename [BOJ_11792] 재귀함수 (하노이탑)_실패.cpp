#include<cstdio>
 
/*
1) n == 1 
   1 -> 3
2) n == 2
   1 -> 2
   1 -> 3
   2 -> 3
3) ...

*/

void solve(int n, int from,  int to){
	
	int mid = n - from - to;
	/*
	2 
	solve(1,from,mid)
	solve(1,from,to)
	solve(1,mid,to)
	
	3 (���) 
	solve(n-1,from,mid) == solve(2,from,mid) ==> solve(1,from,to), solve(1,from,mid), solve(1,to,mid) (������) 
	solve(1,from,to) => ���� ū ���� 
	solve(n-1,mid,to) == solve(2,mid,to) ==> solve(1,mid,from), solve(mid,to), solve(from,to) (�Ϸ�) 
	*/
	if(n == 1) {
		printf("%d %d", from, to);
		return;
	}
	if(n >= 2){
		solve(n-1,from,mid);
		solve(1,from,to);
		solve(n-1,mid,to);	
	}
}


int main(){
	
	int n;
	scanf("%d", &n);
	
	solve(n,1,3);	
	
	return 0;
}
