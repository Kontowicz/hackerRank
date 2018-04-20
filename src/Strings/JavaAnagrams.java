package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b){
        if(a.length()!=b.length())
            return false;

        a = a.toUpperCase();
        b = b.toUpperCase();

        Map<Character,Integer>  m = new HashMap<Character, Integer>();
        Map<Character,Integer>  m1 = new HashMap<Character, Integer>();
        for(int i=0; i<a.length(); i++){
            if(!m.containsKey(a.charAt(i))) {
                m.put(a.charAt(i), 1);
            }
            else {
                Integer freq = m.get(a.charAt(i));
                m.put(a.charAt(i), ++freq);
            }

            if(!m1.containsKey(b.charAt(i))) {
                m1.put(b.charAt(i), 1);
            }
            else {
                Integer freq = m1.get(b.charAt(i));
                m1.put(b.charAt(i), ++freq);
            }
        }

        if(m.equals(m1)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        System.out.println(isAnagram(a,b) ? "Anagrams":"Not Anagrams");
    }
}
