package StringAssignment;

public class Palindrome {
    static void isPalindrome(int n ){
        int temp = n;
        int sum = 0;
        while (n>0){
            int r = n%10;
             sum = (sum*10)+r;
             n=n/10;
        }
        if (temp==sum){
            System.out.println("Number is palindrome");

        }else {
            System.out.println("number is not a palindrome ");
        }

    }
    public static void main(String[] args) {
        int n = 1552;
        isPalindrome(n);

    }
}
