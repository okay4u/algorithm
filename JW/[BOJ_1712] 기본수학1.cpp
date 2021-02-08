// BOJ 1712 손익분기점  
#include<cstdio>
 
int main(){
	
	int a,b,c;	
	scanf("%d %d %d",&a,&b,&c);
	
	
	if(b >= c){
		printf("-1");
		return 0;
	}else{

		int sales, cost, x;
		sales = 0;
		cost = a;
		x = 0;
		while(sales<=cost){
			x++;
			sales = c*x;
			cost = a + b*x;		
		}		
		printf("%d",x+1);	
			
	}
	return 0;	
}
