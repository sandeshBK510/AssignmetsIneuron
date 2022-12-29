package StringAssignment;

import java.util.Arrays;

public class AnagramString {
    static void isAnagram(String str1,String str2){
       boolean s = true;
       if(str1.length()!=str2.length()){
           s = false;
       }else{
           char[] s1 = str1.toLowerCase().toCharArray();
           char[] s2 = str2.toLowerCase().toCharArray();
           Arrays.sort(s1);
           Arrays.sort(s2);
           s=Arrays.equals(s1,s2);
       }
       if (s){
           System.out.println( str1+" and "+ str2+" are Anagram");
       }else {
           System.out.println( str1+" and "+ str2+" are not  Anagram");

       }
    }
    public static void main(String[] args) {
        isAnagram("keep","keek");

    }

}
