package DH;


class String_2941
{
    

    static int get_str_cnt( String usr_str ){
        String[] alpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for( String item : alpha ){
            usr_str = usr_str.replace(item,"1");
        };
        System.out.println("length = "+usr_str.length());
        return usr_str.length();
    };
    
    // main 메소드
    public static void main (String[] args)
    {
        System.out.println("start");
        get_str_cnt( "ljes=njak" );

    }
}