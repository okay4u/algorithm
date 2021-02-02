#include<cstdio>
#include<cstring>
#include<algorithm>

using namespace std;

int main(){
	
	char arr[1000001];
	char alpha[26];
	int rst[26];
	int rst2[26];
	
	
	for(int i=0; i<26; i++){
		alpha[i] = char(i + 65); 
	}
	
	scanf("%s",arr);
	
	for(int i=0; i<strlen(arr); i++){
		if(arr[i] >= 97) arr[i] = arr[i] - 32;
	}	

	int cnt;
	 
	for(int i=0; i<strlen(alpha); i++){		
		cnt = 0;
		for(int j=0; j<strlen(arr); j++){
			if(alpha[i] == arr[j]) cnt = cnt + 1;	
		}
		rst[i] = cnt;
		rst2[i] = cnt;
	}
	// rst A : 2, B : 7, C : 11, ... Z : 9
		
	sort(rst, rst+26);
	
	if(rst[24] == rst[25]){
		printf("?");
	}else{
		for(int i=0; i<26; i++){
			if(rst[25] == rst2[i]){
				printf("%c", alpha[i]);
			}	
		}	
	}	 
}
