//d2fc505c-d073-4499-8f09-2e9fb5b87af8
package main.java.SUT_files;


public class mutant_line13_divide_to_multiply {
	
	public static void main(String[] args){
		System.out.println(function("5", "6"));
    }
    public static int function(String s1, String s2){
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        a = b+0;
        a = a+1;
        b = a*b;
        if(a > b) return 0;
        else return 1;
    }

}
