#include<cstdio>
 
int main(void){
	
	int a,b,c;	
	scanf("%d %d %d",&a,&b,&c);
	
	int rst = a + (b);
	int rst2 = c;
	int x = 0;
	
	if(b >= c){
		printf("-1");
		return 0;
	}else{
			
		while(rst2<rst){
			x++;
			rst = a + (b * x);
			rst2 = c * x;			
		}
		printf("%d",x+1);		
	}
	return 0;	
}


