package DH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class math1_10250
{
    
    // main 메소드 -> 틀림
    public static void main (String[] args)
    {
        double H,W,N = 0;
        String y = "";
        String x = "";
        String rst = "";
        List dataList = new ArrayList<Object>();
    
        /*
            scanner 여러줄 뽑기 응용
            2
            6 12 10
            30 50 72
            스캐너 생성 
            한줄 받고, 그줄의 입력값으로 loop문 
        
        */
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        

        for( int i = 0; i < T; i++ ){
            String[] tmpVal = sc.nextLine().trim().split(" ");
            dataList.add( tmpVal );
            // H = Integer.parseInt(inputVal[0]);         
            // W = Integer.parseInt(inputVal[1]);         
            // N = Integer.parseInt(inputVal[2]);  
        };
        sc.close();
        

        // setting
        for( int j = 0; j < dataList.size(); j++ ){
            String[] tmpVal = (String[]) dataList.get(j);
            
            H = Integer.parseInt(tmpVal[0]);         
            W = Integer.parseInt(tmpVal[1]);         
            N = Integer.parseInt(tmpVal[2]); 

            if(  1 <= H && 1 <= W && H <= 99 && W <= 99 && 1 <= N && N <= H * W){
                // Caculation
                // 열단위로 1층부터 순서대로 채워짐
                // 10 / 행 = 1.4 ->  호수 ceil(1.4) = 2 & 층수 = 나머지4
    
                // 자리수 포맷 -> 층수가 두자리, 1자리냐에 따라 다름
                y = ("" + N % H).replace(".0",""); // 행 = 층수 = y
                System.out.println("y  = "+y );
                x = N / H > 10 ? ("" + Math.ceil(N / H)).replace(".0","") : "0" + (""+ Math.ceil(N / H)).replace(".0","");    // 열 = 호수 = x
                System.out.println("x = "+x);  
                
                System.out.println( y + x );
                                
            };
        };       
   
    }

    // --------------------------
    // 한 case 입력받아 출력 작성
    // 덩어리로 수정
    /*
        java.util.Scanner sc = new java.util.Scanner(System.in);
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+"값과"+b);;
    */
};