package StringCaculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scaculator2 {
			
	public static void main(String[] args) {
		Scaculator cal = new Scaculator();
		
		System.out.println(cal.sum("-1;2;3"));		 
	}
	
	public int sum (String text) {
		int result = 0;
		String numbers[] = new String[] {};
				
		if (text == null || text.isEmpty() ) {
			return 0;
		}
		
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);		
		
		if(m.find()) {
			String customText = m.group(1);
			numbers = m.group(2).split(customText);
			
		}else {
			numbers = text.split(",|:");			
		}
						
		
		for(String i : numbers) {
			if (Integer.parseInt(i) < 0) {				
				throw new RuntimeException();
			}
			result += Integer.parseInt(i);
		}
		
		return result;
	}	
	
}
