package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static LinkedList<String> linkedList2 = new LinkedList<>();



    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.println( "sozni kiriting " );
        String english = input.nextLine();
        System.out.println( strTranlator( english ) );

    }
    public static String translate(String toTranslate){





        linkedList2.add("а");
        linkedList2.add("б");
        linkedList2.add("с");
        linkedList2.add("д");
        linkedList2.add("е");
        linkedList2.add("ф");
        linkedList2.add("г");
        linkedList2.add("х");
        linkedList2.add("и");
        linkedList2.add("к");
        linkedList2.add("л");
        linkedList2.add("м");
        linkedList2.add("н");
        linkedList2.add("о");
        linkedList2.add("п");
        linkedList2.add("р");
        linkedList2.add("т");
        linkedList2.add("у");
        linkedList2.add("ш");
        linkedList2.add("р");
        linkedList2.add("з");



        if (toTranslate.equalsIgnoreCase("a"))
            return linkedList2.get(0);
        if (toTranslate.equalsIgnoreCase("b"))
            return linkedList2.get(1);
        if (toTranslate.equalsIgnoreCase("s"))
            return linkedList2.get(2);
        if (toTranslate.equalsIgnoreCase("d"))
            return linkedList2.get(3);
        if (toTranslate.equalsIgnoreCase("e"))
            return linkedList2.get(4);
        if (toTranslate.equalsIgnoreCase("f"))
            return linkedList2.get(5);
        if (toTranslate.equalsIgnoreCase("g"))
            return linkedList2.get(6);
        if (toTranslate.equalsIgnoreCase("x"))
            return linkedList2.get(7);
        if (toTranslate.equalsIgnoreCase("i"))
            return linkedList2.get(8);
        if (toTranslate.equalsIgnoreCase("k"))
            return linkedList2.get(9);
        if (toTranslate.equalsIgnoreCase("l"))
            return linkedList2.get(10);
        if (toTranslate.equalsIgnoreCase("m"))
            return linkedList2.get(11);
        if (toTranslate.equalsIgnoreCase("n"))
            return linkedList2.get(12);
        if (toTranslate.equalsIgnoreCase("o"))
            return linkedList2.get(13);
        if (toTranslate.equalsIgnoreCase("p"))
            return linkedList2.get(14);
        if (toTranslate.equalsIgnoreCase("t"))
            return linkedList2.get(15);
        if (toTranslate.equalsIgnoreCase("u"))
            return linkedList2.get(17);
        if (toTranslate.equalsIgnoreCase("sh"))
            return linkedList2.get(17);
        if (toTranslate.equalsIgnoreCase("ch"))
            return linkedList2.get(18);

        if (toTranslate.equalsIgnoreCase("r"))
            return linkedList2.get(19);
        if (toTranslate.equalsIgnoreCase("z"))
            return linkedList2.get(20);
        return toTranslate;
    }
    public static String strTranlator( String translator )
    {
        String newText = "";
        String selectedChar;
        String convertedChar;
        for (int i = 0; i < translator.length(); i++)
        {

            selectedChar = translator.charAt(i) + "";


            convertedChar = translate(selectedChar);

            if (convertedChar.equalsIgnoreCase(""))
            {
                newText = newText + " ";
            }

            else
            {
                newText = newText + convertedChar;
                if (!convertedChar.equalsIgnoreCase(""))
                {
                    newText = newText + "";
                }
            }
        }
        return newText;
    }
}