// BOJ_1929 기본수학2 시간초과 
#include<cstdio>
#include<vector>
#include<algorithm> 

using namespace std;

bool simulation(int idx){
	
	int cnt = 0;
	for(int i=1; i<=idx; i++){
		if(idx%i == 0) cnt++; 
	}
	
	if(cnt == 2) return true;
	else return false;
}



int main(){
	
	int m,n;
	scanf("%d %d", &m, &n);
	
	vector<int> v;
	for(int i=m; i<=n; i++){	
		if(simulation(i)) {
			v.push_back(i);
		}else{
			continue;			
		}
		
	}
	for(int i=0; i<v.size(); i++){
		printf("%d\n", v[i]);
	}
	
		
	return 0;
	
}
