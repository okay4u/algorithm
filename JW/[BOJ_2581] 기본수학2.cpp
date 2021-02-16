// BOJ_2581 

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
	
	int m,n,sum;
	bool flag = false;
	scanf("%d %d", &m, &n);
	
	vector<int> v;
	sum = 0;
	for(int i=m; i<=n; i++){	
		if(simulation(i)) {
			v.push_back(i);
			sum += i;
			flag = true;	
		}else{
			continue;			
		}
		
	}
	if(flag){
		sort(v.begin(),v.end());
		printf("%d\n",sum);
		printf("%d",v[0]);	
	}else{
		printf("-1");
	}
	
	return 0;
	
}
