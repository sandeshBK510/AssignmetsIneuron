package StringAssignment;

public class UniqueCharacter {
    static boolean isUniqueCharacter(String str){
        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                return false;

        return true;


    }
    public static void main(String[] args) {
        String str = "classification";
        if (isUniqueCharacter(str))
            System.out.println("the String "+str+" has unique Character");
        else
            System.out.println("the String "+str+" does not have  unique Character");

    }
}
