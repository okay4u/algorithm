// BOJ 2869 �����̴� �ö󰡰� �ʹ�  (�ð��ʰ�) 
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
