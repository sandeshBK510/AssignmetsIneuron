package StringAssignment;

public class CountCVSP {
    static void countCharacterType(String str){
        int vowels = 0 ,consonants = 0,specialChar=0,digit=0;
        for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                    ch = Character.toLowerCase(ch);
                    if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                        vowels++;
                    }else{
                        consonants++;
                    }
                } else if (ch>='0'&&ch<=9) {
                    digit++;
                    
                }else {
                    specialChar++;
                }

        }
        System.out.println("vowels:"+vowels);
        System.out.println("consonants:"+consonants);
        System.out.println("special Characters:"+specialChar);
    }
    public static void main(String[] args) {
        String str = "classification#123";
        countCharacterType(str);

    }
}
