package _00_Text_Funkifier;

import java.util.Locale;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] array = s.toCharArray();
		String newString = "";
		for (int i = 0; i < array.length; i++) {
			if(i%2 == 1){
				array[i]= Character.toUpperCase(array[i]);
			}else {
				array[i]= Character.toLowerCase(array[i]);
			}
			newString = newString + array[i];
		}
		return newString;
	}

}
