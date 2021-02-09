// BOJ 2869 달팽이는 올라가고 싶다  (시간초과) 
#include<cstdio>

int main(){
	
	
	int a,b,v;
	scanf("%d %d %d",&a,&b,&v);
	
	int rst = 0;
	int x = 0;
	
	while(rst<v){
		x++;
		rst = (a-b)*x + b;		
	}
	printf("%d",x);
 		
}
