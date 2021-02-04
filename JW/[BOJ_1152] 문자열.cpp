#include<cstdio>
#include<cstring> 

int main(){
	
	char a[1000000];
	int rst;
	
	// 이따구로 입력 받구나 상상도 못했다 
	scanf("%[^\n]",a);	

	//printf("%s",a);
	
	/*
	' '
	'a'
	' a a '
	' aa a '
	'aa a a a a'
	' a '
	' a a'
	'a a '
	'a aaaaa a'	
	*/
	
	int last = strlen(a);
	if(last == 1){
		if(a[0] == ' '){
			printf("0\n");
			return 0;
		}else{
			printf("1\n");
		}		
	}else{
		rst = 0;
		if(a[0] == ' ' && a[last-1] == ' '){
			for(int i=0; i<strlen(a); i++){
				if(a[i] >= 'A' && a[i] <= 'z') continue;
				else rst++;
			}
			printf("%d", rst-1);
			return 0;	
		}else if(a[0] != ' ' && a[last-1] != ' '){
			for(int i=0; i<strlen(a); i++){
				if(a[i] >= 'A' && a[i] <= 'z') continue;
				else rst++;
			}
			printf("%d",rst+1);
			return 0;	
		}else{
			for(int i=0; i<strlen(a); i++){
				if(a[i] >= 'A' && a[i] <= 'z') continue;
				else rst++;
			}
			printf("%d",rst);
			return 0;	
		}
	}
	
	
	
	
	
	


		
}
