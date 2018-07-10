package shifting;

import java.util.LinkedList;
import java.util.Queue;

public class shift {
	static String getShiftedString(String s, int leftShifts, int rightShifts) {
		for (int i = 0; i < rightShifts; i++) {
			s = s.charAt(s.length()-1)+s.substring(0, s.length()-1);
		}
		for (int i = 0; i <leftShifts; i++) {
			s = s.substring(1,s.length()) +s.charAt(0);
		}
		
		return s;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		System.out.print(getShiftedString(s,1,2));
}
}