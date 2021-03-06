#include<cstdio>
#include<algorithm>
#include<vector>
#include<cmath>
#include<cstring>

/*
 보드의 크기가 N×N 이다. 보드의 크기와 보드판의 블록 상태가 주어졌을 때, 최대 5번 이동해서 만들 수 있는 가장 큰 블록의 값을 구하는 프로그램을 작성하시오.
*/
using namespace std;

bool check(int n){
	bool flag = false;
	for(int i=1; i<=10; i++){
		if(n == pow(2,i)) {
			flag = true;
			break;	
		}
	}	
	if(flag) return flag;
	else return flag;
}


int main(){
	
	int n;
	int arr[20][20];
	int cpy[20][20];
	
	int visit[20][20];
	
	int move1[2] = {-1,0};
	int move2[2] = {0,1};
	int move3[2] = {1,0};
	int move4[2] = {0,-1};
	 
	
	
	memset(visit,-1, sizeof(int));
	
	
	scanf("%d",&n);
	for(int i=0; i<n; i++){
		for(int j=0; j<n; j++){
			scanf("%d",&arr[i][j]);
			memcpy(cpy,arr,sizeof(arr));
		}
	}
	
	
	
	
	return 0;
	
	
} 
