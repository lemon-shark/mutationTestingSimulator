//c44dd971-5df6-421c-9306-8eae466e5eaf
package main.java.SUT_files;


public class mutant_line11_plus_to_divide {
	
	public static void main(String[] args){
		System.out.println(function("5", "6"));
    }
    public static int function(String s1, String s2){
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        a = b/0;
        a = a+1;
        b = a/b;
        if(a > b) return 0;
        else return 1;
    }

}
