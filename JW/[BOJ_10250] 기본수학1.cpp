// BOJ 10250 ACM 호텔 - (틀렸습니다) 
#include<cstdio>

int main(){
	
	int t,h,w,c,idx;
	int floor[100];
	int side[100];
	
	scanf("%d",&t);
	idx = 0;

	while(t--){
		
		scanf("%d %d %d", &h, &w, &c);

		int tmpI = 0, tmpJ = 0, cnt = 0;
        bool flag = false;
        
		for(int i=0; i<w; i++){
			if(flag) break;
			for(int j=0; j<h; j++){
				cnt++;
				if(cnt == c){
					tmpJ = j + 1;
					tmpI = i + 1;
					flag = true;
					break;			
				}	
			}
		}
		
        floor[idx] = tmpJ;
		side[idx] = tmpI;
		idx++;
		
	}
	
	for(int i=0; i<idx; i++){
		printf("%d0%d\n",floor[i], side[i]);		
	}
	
	return 0;
 		
}
