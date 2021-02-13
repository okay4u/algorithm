package DH;

import java.util.Scanner;

public class math1_2869
{
    
    // main 메소드
    public static void main (String[] args)
    {
        double A,B,V = 0;
        double x = 0;

        //System.out.println("나무높이V : 낮이동+A : 밤이동-B 을 공백 구분으로 입력하세요 ");
        Scanner sc = new Scanner(System.in);
        String[] inputVal = sc.nextLine().trim().split(" ");
        sc.close();

        // setting
        A = Integer.parseInt(inputVal[0]);         
        B = Integer.parseInt(inputVal[1]);         
        V = Integer.parseInt(inputVal[2]);         
        
        if(  1 <= B && B < A && A <= V && V <= 1000000000 ){
            // Caculation
            // 재귀함수는 순차처리시 작업량 많음 ->   X
            // 부등호 계산식으로 eq값에 +1하면됨->  0
                // (A - B) x >= V   ->  x >=  V / ( A - B ); => 하루 단위 ( 낮에 이동시 도착 가능 )
                // A , A + ( -B + A ), ...  => 최대 길이 단위 
            x =  Math.ceil( (V  - A) / ( - B + A ) + 1);                
        };

        System.out.println(x);

    }
};