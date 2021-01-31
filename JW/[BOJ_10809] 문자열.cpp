#include<cstdio>
#include<cstring>

int main(){
	
	
	char s[100];
	char alpha[26];
	char rst[26] = {-1};
	
	for(int i=0; i<26; i++){
		rst[i] = -1;
	}
	
	for(int i=0; i<26; i++){
		alpha[i] = (char)(i + 97);
	}
	
	scanf("%s",s);
	
	for(int i=0; i<26; i++){
		for(int j=0; j<strlen(s); j++){
			if(alpha[i] == s[j]){
				rst[i] = j;
				break;
			}		
		}
	}
	for(int i=0; i<26; i++){
		printf("%d ",rst[i]);
	}
	
	
}
