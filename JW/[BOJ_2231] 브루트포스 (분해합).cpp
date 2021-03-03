// BOJ_2231 
#include<cstdio>

int main(){
	
	int n;	
	scanf("%d",&n);
	
	bool flag = false;
	
	for(int i=1; i<=1000000; i++){
		int target = i;
		int sum = 0;
		while(target != 0){
			sum += target%10;
			target /= 10; 
		}
		
		if((i+sum) == n){
			printf("%d", i);
			flag = true;
			break;
		}		
	}
	
	if(flag == false){
		printf("%d",0);	
	}
	
	return 0;
}
