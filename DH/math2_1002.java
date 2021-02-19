package DH;


class String_1002
{
    static int math2_1002( String usr_str ){
        int result = 0;

        if( usr_str.length() < 1000000 && usr_str.length() > 0  ){ 
            String tmp = usr_str.toUpperCase();
            result = tmp.split(" ").length;
        }
        System.out.println("result = "+result);
        return result;
    };
    
    // main 메소드
    public static void main (String[] args)
    {
        System.out.println("start");
        math2_1002( "asd asda asd asd " );

    }
}