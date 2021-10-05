package com.java;
import java.util.*;
/*An efficient Java program to return the duplicate characters from given String,
and also find the maximum occurring of that duplicate character in a given String.
(use data structure like HashSet or HashMap )*/

public class Main
{
    public void findDupCharOfGiven(String str) //to find the duplicate char
    {
        // Creating HashMap
        Map<Character, Integer> hm = new HashMap<>();
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
    public void MaxDupCharOfGiven(String str){
        int maxCount =0;
            HashMap<Character, Integer> map = new HashMap<>();
            char[] chars = str.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                char c = chars[i];
                if(map.containsKey(c)){
                    int count = map.get(c);
                    count++;
                    if(maxCount<count)
                        maxCount++;
                    map.put(c, count);
                }else{
                    map.put(c, 1);
                }
            }

            Set set = map.keySet();
            Iterator<Character> iterator = set.iterator();
            while(iterator.hasNext()){
                char key = iterator.next();
                if(map.get(key)==maxCount){
                    System.out.println("Character: " + key + " has occurred max times: " + maxCount);
                }
            }
        }

    public static void main(String[] args) {

        Main operation = new Main();
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a String");
        String str = s.nextLine();
        str = str.replaceAll("\\s+","");
        operation.findDupCharOfGiven(str);
        operation.MaxDupCharOfGiven(str);

    }
}