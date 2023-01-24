package com.practice;

public class FindStringWithUpperCaseDemo {

	public static void main(String[] args) {
		 String a1 = "ProgressiveWorld";
         String a2 = "HumanRace";
         int firstUpperA1 = -1;
         int firstUpperA2 = -1;
         for (int i = 0; i < a1.length(); i++) { 
             if (Character.isUpperCase(a1.charAt(i))) {
                 firstUpperA1 = i;
                 break;
             }
         }



         for (int i = 0; i < a2.length(); i++) {
             if (Character.isUpperCase(a2.charAt(i))) {
                 firstUpperA2 = i;
                 break;
             }
         }
         String c5 = a1.substring(0, firstUpperA1) + a2.substring(firstUpperA2);
         System.out.println(c5);

	}

}
