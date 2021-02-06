package DH;


class str_cnt
{
    static int get_str_cnt( String usr_str ){
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
        get_str_cnt( "asd asda asd asd " );

    }
}