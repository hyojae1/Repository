package StringCaculator;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scaculator {
			
	public static void main(String[] args) {
		Scaculator cal = new Scaculator();
		
		System.out.println(cal.sum("-1;2;3"));
		 
	}
	
	public int sum (String a) {	
		
		if (nullCheck(a)) {
			return 0;
		}			
		
		return toInts(a);
	}
	
	private int toInts(String v) {		
		int result = 0;
		
		for (String i : split(v)) {
			result += negativNmberCheck(Integer.parseInt(i));
		}
		
		return result;
	}
	
	
	private int negativNmberCheck(int num) {
		if (num < 0) {
			throw new RuntimeException();
		}
		return num;
	}
	
	private String[] split(String test) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(test);
		
		if(matcher.find()) {			
			String sp = matcher.group(1);			
			return matcher.group(2).split(sp);						
		}
		
		return test.split(",|;");
	}
	
	private boolean nullCheck(String a) {
		if (a == null || a.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
}
