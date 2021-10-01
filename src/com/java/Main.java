package com.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    public void findDupCharOfGiven(String str) //to find the duplicate char
    {
/*An efficient Java program to return the duplicate characters from given String,
and also find the maximum occurring of that duplicate character in a given String.
(use data structure like HashSet or HashMap )*/


        // Creating HashMap
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();  //converting String to Array of character

        for (Character ch : charArray)
        {
            if (hm.containsKey(ch))
            {
                hm.put(ch, hm.get(ch) + 1);
            }
            else
            {
                hm.put(ch, 1);
            }
        }

        Set<Character> keys = hm.keySet(); //Converting to Set to find unique characters
        for (Character ch : keys)
        {
            if (hm.get(ch) > 1)
            {
                System.out.println(ch + "  is " + hm.get(ch) + " times");
            }
        }
              }

    public static void main(String[] args) {

        Main fd = new Main();
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a word");
        String str = s.nextLine();
        fd.findDupCharOfGiven(str);
    }
}