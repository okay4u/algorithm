package DH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.String;

public class math1_1747
{
    
    // main 메소드 -> 틀림
    public static void main (String[] args)
    {
        TreeSet<Integer> set1 = null; //TreeSet생성
        TreeSet<Integer> set2 = new TreeSet<Integer>(); //TreeSet생성
    
        Scanner sc = new Scanner(System.in);
        int conNum = Integer.parseInt( sc.nextLine().trim() );  // condition Num
        sc.close();
        
        set1 = new TreeSet<Integer>(Arrays.asList(2,3,5,7)); // 소수 추가
        // XYX, XYYX, XYZYX -> x는 자연수, y,z는 0을 포함한 자연수
        // 101
        if( conNum >= 3  ){
            // 314 -> 31X 와 비교
            String k = conNum.split(""); // 31X
            int xyz = Integer.parseInt(k.get(0) + k.get(1) + k.get(2));
            int sts = xyz > conNum ? xyz : xyz + 10; 

            for( int x = 1; x < 9; x++ ){
                for( int y = 0; y < 9; y++ ){
                }  
            }
        }

        // 기존 소수 규모
        // 다음 요소에 1번 소수 체크

   
    };

   
};