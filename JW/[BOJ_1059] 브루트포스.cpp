/*
5
10 20 30 40 50
30 
*/


#include<cstdio>
#include<algorithm>
#include<vector>

using namespace std;
int main(){


	int n, nn;
	int arr[50];
	int setFrom, setTo;
	vector<int> from;
	vector<int> to;	
	
	
	scanf("%d", &n);
	for(int i=0; i<n; i++) scanf("%d", &arr[i]);
	scanf("%d", &nn);
	
	sort(arr,arr+n);
	
	bool flag = true;
	for(int i=0; i<n; i++){
		
		if(arr[i+1] == '\0'){
			flag = false; 
			break;	
		}
		
		if(nn > arr[i] && nn < arr[i+1]){
			setFrom = arr[i];
			setTo = arr[i+1];
			break;			
		}
	}
	
	
	// vector 31 40
	// 
	for(int i=nn; i<setTo; i++){
		if(i==nn+1) break;
		for(int j=nn+1; j<setTo; j++){
			from.push_back(i);
			to.push_back(j);			
		}
	}
	
	for(int i=nn; i>setFrom; i--){
		if(i==nn-1) break;
		for(int j=nn-1; j>setFrom; j--){
			from.push_back(i);
			to.push_back(j);
		}
	}
	
	
	if(flag == false){
		printf("%d", 0);
	}else{
		printf("%d", from.size());
	}
	
	
	
	
	return 0;
	
	
} 
