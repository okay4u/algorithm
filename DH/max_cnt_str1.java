package DH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.TreeMap;
//import java.util.Map.Entry;

/*
    클래스

        1. 원리 이해하기
            사물의 상태 및 특성, 그애 관련된 기능을 정리하여 프로그램으로 표현하기

            Ex. 쟈동차 클래스
                class 자동차
                {
                    
                    차량 번호;    
                    연료량;                               ---> a. 자동차 상태 및 특성을 정의합니다.

                    차량 번호를 결정하기;
                    연료를 널기;
                    차량 번호와 남은 연료의 양 표시하기;    ---> b. 자동차 기능을 정의합니다.

                }

                a , b  코드뭉치를 '자동차라고 이름 붙였습니다.

        ------------------------------------------------------------------------------------------    
        2. 선언하기
            EX. 코드
                class 클래스 명
                {
                    형(type)명 필드(field)명;
                    ...
                    리턴 값의 형(type) 메소드(method) 명(인수목록)
                    {
                        문장;
                        ... 
                        return 식(expression);
                    }
                
                }

                클래스를 표현하기 위한 수단을 필드(field)라고 부릅니다.
                클래스의 기능을 표현하기 위한 수다능ㄹ 메소드(method)럭ㅎ 뷰룹나더,
                필드와 메소드 모두 클래스의 멤버(member)라고 부릅니다.
        
        ------------------------------------------------------------------------------------------    
        3. 객체 생성하기

        3.1. 클래스를 사용한다는것은 ?
                클래스를 선언한다고 사용할수 없다. 왜냐하면 구체적으로 '자동차'라는 "실제 차량번호는 무엇인지" 등을 표현하지 않았다.
                특정할수 있는 객체를 생성해야한다. 

                객체생성 ? "실제로 1대의 차를 만드는 작업"
        
        3.2. 객체 생성하기
                a. 객체를 담을 변수를 선언하기
                b. 객체를 만들고, 그 변수에 접근하기

*/

class max_cnt_str1
{
    // 상태,속성 (필드)
    // String input_str;
    // String[] array_str;

    // 기능 (메소드)
    static String get_max_cnt_str( String usr_str ){
        String result_str = "";
        char[] char_array;
        Map<String, Integer> cnt_map = new HashMap<>();   //  Map > 정의 > Map은 인터페이스 > Map인터페이스를 구현한 Map자료형  = { 해쉬, 입력한대로 출력linked, key소트순으로 출력 tree}


        // 기능1. 10000000을 넘지 않는다.
        if( usr_str.length() > 1000000 ){
            result_str = "";
            
        // 기능2. 알파벳은 26개, 26이상시 중복생성되므로 ?처리한다.
        }else if( usr_str.length() > 26 ){
            result_str = "?";
            
        }else if( usr_str.length() == 1 ){
            result_str = usr_str;

        // 기능3. 단어 2자리 이상일때 실행
        }else {

            char_array = usr_str.toCharArray();             // 문자열을 char로 변환
            System.out.println("char_array = "+ Arrays.toString(char_array) );
            // 갯수를 세는 자료형선택
            for( int i = 0; i <char_array.length; i ++ ){
                String item = String.valueOf(char_array[i]); // char 배열을 문자열로 변환
                System.out.println("item = "+ item );
                // 있으면, cnt증가
                if( cnt_map.containsKey( item ) ){    // HashMap > containKey 메소드 > HashMap에 containsValue 메소드에 값을 넘겨주면 해당 값이 HashMap에 있을경우 true를 없을 경우 false를 넘겨 줍니다.
                    cnt_map.put( item, cnt_map.get( item ) + 1 );
                // 없으면, defualt cnt 0 샛팅
                }else{
                    cnt_map.put( item, 0 );
                };
                System.out.println(item + " : "+ cnt_map.get( item ) );
            };
            // rst charaaa  -> c : 1  h : 1  a : 4  r  : 1

            // cnt 정렬이 필요 -> 자료형엔 없음 treeMap도 key정렬이라 안됨
            List<String> keySetList = new ArrayList<>( cnt_map.keySet() );   //  리스트의 sort사용
            Collections.sort(keySetList, (o1, o2) -> (cnt_map.get(o2).compareTo(cnt_map.get(o1))));
            // rst charaaa  -> a : 4, c : 1,  h : 1, r  : 1

            // console test
            // for(Character key : keySetList ) {
            //     System.out.println("key : " + key + " / " + "value : " + cnt_map.get(key));
            // };
            
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
        
        get_max_cnt_str("a");

    }
}