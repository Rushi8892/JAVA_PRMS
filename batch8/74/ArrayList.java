import java.util.*;
class ArrayList {

	public static void main(String[] args) {
		String s = "India is my country";
		String arr[]= s.split(s);
		ArrayList al = new ArrayList();
		al.addAll(arr);
		
		for (String i:arr) {
			System.out.println(i);
		}
	}

}