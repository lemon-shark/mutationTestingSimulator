package demo429;

public class sample_program {
	
	public static void main(String[] args){
		System.out.println(function("10", "5"));
    }
    public static int function(String s1, String s2){
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        a = b+0;
        a = a+1;
        b = a/b;
        if(a > b) return 0;
        else return 1;
    }

}
