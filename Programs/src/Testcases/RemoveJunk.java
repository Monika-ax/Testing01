package Testcases;

public class RemoveJunk {
	public static void main(String[]args) {
		String s = "@#$$##@$# Test   Selenium";
		String s1 = "  &*&*(&(*(* Test for selenium";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}
	

}
