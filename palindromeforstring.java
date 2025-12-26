public class Main {
    public static void main(String[] args) {
        String str="abccba";
        if(isPalindrome(str))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
  
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}
