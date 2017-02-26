/**
 * 
 */
package com.rrlearning.myutil;

/**
 * @author Sankar Ramasamy
 *
 */
public class StringOperation {
	
	/**
	 * This subString first check the isEmpty and not equal to null after that process the substring
	 * @param str
	 * @param pointA
	 * @param pointB
	 * @return
	 */
	public static String getSubString(String str, int pointA, int pointB) {
		String finalVal = null;
		if (str != null && !str.equalsIgnoreCase("") && str.length() > 1) {
			finalVal = str.substring(pointA, pointB);
		}else {
			finalVal = str;
		}
		return finalVal;
	}
}
