package com.sudano.namecheck.utils;

import java.util.List;

public class Strings {
	
	public static List<String> strings;
	
	public static void updateStrings() {
		strings.add("AD4(X");
		strings.add("6754632");
		strings.add("9/+++++");
		strings.add("[aJP[aJPWW9:WW9:35353535-,,$-,,$AD");
		strings.add("QQ77*.6))2");
		strings.add("^hUn[w");
		strings.add("!J*Z]JUadJ");
		strings.add("(L$y;DDDI)V");
		strings.add("(+#/2,69:DG?KNHRUV`c[gjdruk{~v");
		strings.add("007:04DG0LX[0`gj0dps0");
		strings.add("");
		
	}
	
	public static List<String> getNicks() {
		return strings;
	}
	
	public static void insertString(String nickname) {
		strings.add(nickname);
	}

}
