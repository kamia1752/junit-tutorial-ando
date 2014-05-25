package junit.tutorial.snakecase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	public static String toSnakeCase(String text) {
		String after;
		StringBuilder sb = new StringBuilder();
		Pattern p = Pattern.compile("([A-Z])");
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			Matcher m = p.matcher(c + "");
			if (m.find()) {
				if(i != 0) {
					sb.append("_");
				}
				c = Character.toLowerCase(c);
			}
			sb.append(c);
		}
		after = sb.toString();
		
		return after;
	}
}
