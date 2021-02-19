package DH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class max_cnt_str2
{
    static String String_max_cnt_str2( String usr_str ){
        String result_str = "";
        char[] char_array;
        Map<String, Integer> cnt_map = new HashMap<>();  


        // 10000000을 넘지 않는다.
        if( usr_str.length() > 1000000 ){
            result_str = "";
            
        // 알파벳은 26개, 26이상시 중복생성되므로 ?처리한다.
        }else if( usr_str.length() > 26 ){
            result_str = "?";
            
        }else if( usr_str.length() == 1 ){
            result_str = usr_str;

        // 단어 2자리 이상일때 실행
        }else {

            char_array = usr_str.toCharArray();            
            System.out.println("char_array = "+ Arrays.toString(char_array) );
            // 문자별 개수 자료구조 샛팅
            for( int i = 0; i <char_array.length; i ++ ){
                String item = String.valueOf(char_array[i]); 
                
                if( cnt_map.containsKey( item ) ){    
                    cnt_map.put( item, cnt_map.get( item ) + 1 );
                
                }else{
                    cnt_map.put( item, 0 );
                };
                System.out.println(item + " : "+ cnt_map.get( item ) );
            };
            // rst charaaa  -> c : 1  h : 1  a : 4  r  : 1

            // 내림차순 정렬
            List<String> keySetList = new ArrayList<>( cnt_map.keySet() );   //  리스트의 sort사용
            Collections.sort(keySetList, (o1, o2) -> (cnt_map.get(o2).compareTo(cnt_map.get(o1))));
            // rst charaaa  -> a : 4, c : 1,  h : 1, r  : 1

            // 상위2개 비교
            int cnt1 = 0;
            int cnt2 = 0;
            int idx = 0;
            for(String key : keySetList ) {
                if( idx == 0 ){
                    cnt1 = cnt_map.get( key );
                    result_str = key;

                }else if( idx == 1 ){
                    cnt2 = cnt_map.get( key );

                }else{
                    break;

                }
                idx = idx + 1;
            };
                
            if( cnt1 == cnt2 ){
                result_str = "?";
            };
            
        }

        System.out.println("result_str = "+result_str);
        return result_str;
    };
    


    // main 메소드
    public static void main (String[] args)
    {
        System.out.println("start");
        String_max_cnt_str2( "asdasdasdasdasd" );

    }
}