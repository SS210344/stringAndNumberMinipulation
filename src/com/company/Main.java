package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String myText = "Programming is amazing! No seriously.";
        System.out.println(myText.length());
        System.out.println(myText.charAt(0));
        System.out.println(myText.substring(0,7));
        System.out.println(myText.replace("ing is","ers are"));
        int a = 'A';
        System.out.println(a);
        char b =66;
        System.out.println(b);
        Integer.parseInt("7");
        Integer.toString(7);

         */

        double myDouble = 3.14159265359;

        System.out.println((double) Math.round(myDouble*100000)/100000);
        System.out.println((double) Math.round(myDouble));
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println(df.format(myDouble));

        System.out.println(Math.pow(2,8));
        BigDecimal bd= new BigDecimal(myDouble);
        bd=bd.setScale(2,BigDecimal.ROUND_DOWN);
        System.out.println(bd.doubleValue());

    }
}
/* Integer.parseInt("7");
        Integer.toString(7);
        int myInt = 9;
        double myDouble = myInt;

        double myDouble = 9.78;
        int myInt = myDouble;
 */