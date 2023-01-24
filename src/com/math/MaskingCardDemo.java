package com.math;

public class MaskingCardDemo  {

	private String maskString(String strText, int start, int end, char maskChar) {

		int maskLength = end - start;
		if (maskLength == 0)
			return strText;

		StringBuilder sbMaskString = new StringBuilder(maskLength);

		for (int i = 0; i < maskLength; i++) {
			sbMaskString.append(maskChar);
		}
		return strText.substring(0, start) + sbMaskString.toString() + strText.substring(start + maskLength);
	}

	
	public static void main(String[] args) {


		MaskingCardDemo sc=new MaskingCardDemo();
		System.out.println(sc.maskString("1234567890123456", 5, 12,'X'));
		
		

	}




	

}
