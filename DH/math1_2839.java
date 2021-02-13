package DH;

import java.util.Scanner;

public class math1_2839
{
    
    // main 메소드 
    public static void main (String[] args)
    {
        double rst = 0;
        double action1 = 0;
        double action2 = 0;
        
        Scanner sc = new Scanner(System.in);
        int x_int = Integer.parseInt(sc.nextLine().trim());
        double x_dob = x_int;
        sc.close();
        
        

        // setting
        action1 = (x_int / 5) + ( x_dob % 5 / 3 ); // 자연수
        System.out.println("action1 = "+action1+" , x / 5 = "+x_int / 5+" , x % 5 / 3 = "+x_dob % 5 / 3);
        if( (x_dob % 5) % 3 == 0 ){
            rst = action1;
        }else{
            System.out.println("action2 = "+action2+" , x_int / 3 = "+x_int / 3+" , x_dob % 3 = "+x_dob % 3);
            if(  x_dob % 3 == 0  ){
                rst = x_int / 3;
            }else{
                rst = -1;
            };
        };
          
        System.out.println( String.valueOf(rst).replace(".0", "") ); 
   
    }

};