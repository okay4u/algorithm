// BOJ_11792
#include<cstdio>
#include<vector>

using namespace std;

int	cnt = 0;
vector<int> v1;
vector<int> v2;

void solve(int n, int from, int to){
	
	int mid = 6 - from - to;
		
	if(n == 1){
		cnt++;
		v1.push_back(from);
		v2.push_back(to);
		return;
	}
	if(n>=2){
		solve(n-1,from,mid);
		solve(1,from,to);
		solve(n-1,mid,to);		
	}
} 

int main(){
	int n;
	scanf("%d", &n);
	solve(n, 1, 3);
	printf("%d\n", cnt);
	
	for(int i=0; i<v1.size(); i++){
		printf("%d %d\n", v1[i], v2[i]);
	}
	return 0;
}
