package DH;

import java.util.Scanner;
import java.util.TreeSet;

class String_2581
{
    static int sum = 0;

    static void get_str_cnt( String usr_str ){
        
        Boolean sFlag = false;
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        TreeSet<Integer> set2 = new TreeSet<Integer>();
        TreeSet<Integer> set3 = new TreeSet<Integer>(); // 60보다 작은수 나열

        // 입력
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt( sc.nextLine().trim() );
        int num2 = Integer.parseInt( sc.nextLine().trim() );
        sc.close();

        // U 
        if( num1 > num2 ){
            System.out.println("-1");
        }else{
            double maxData = Math.sqrt( num2 ) + 1;
            for( int i = 2; i < num2 + 1 ; i++ ){  // 소수는 2부터 시작 ( 1은 나머지가 0으로 됨 )
                set1.add( i );

                if( i < num1 ){ set3.add(i); };    // 버릴 작은수

                sFlag = false;
                if( i < maxData ){
                    sFlag = true;
                    int s = 2;
                    while( s < i ){                // 소수는 2부터 시작 ( 1은 나머지가 0으로 됨 )
                        if( i % s == 0 ){ sFlag = false; break; };
                        s++;
                    };
                };
                
                // 소수들의 합집합
                if( sFlag ){
                    int j = 2;
                    while( i * j < num2 +1  ){
                        set2.add( i * j );
                        j += 1;
                    };
                }
                
            }; 
            set1.removeAll( set2 );
            set1.removeAll( set3 );
            
            // rst
            set1.stream().forEach( (item) -> { System.out.println(item); } ); 
            
            
        };
    };
    
    // main 메소드
    public static void main (String[] args)
    {
        //System.out.println("start");
        get_str_cnt( "asd asda asd asd " );

    }
}