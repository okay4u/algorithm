
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

#include<cstdio>
int main(){

	int n = 0;
	char arr[100];
	int sum = 0;
	
	// 문자는 '1' 아스키코드 값은 49  
	//printf("%d", '1'-48);	
	scanf("%d",&n);
	scanf("%s",arr);
	for(int i=0; i<n; i++){
		sum += arr[i] - 48;
	}
	printf("%d",sum);
	
}

