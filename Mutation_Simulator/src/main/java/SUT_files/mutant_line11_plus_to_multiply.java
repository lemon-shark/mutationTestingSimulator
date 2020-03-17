//c8048974-5228-41e1-a48f-d4ae816a76c2
package main.java.SUT_files;


public class mutant_line11_plus_to_multiply {
	
	public static void main(String[] args){
		System.out.println(function("5", "6"));
    }
    public static int function(String s1, String s2){
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        a = b*0;
        a = a+1;
        b = a/b;
        if(a > b) return 0;
        else return 1;
    }

}
