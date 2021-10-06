public class PalindromeString {

    public static boolean Palindrome(String str)
        {
            int i = 0, j = str.length() - 1;
            while (i < j) {

                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }

            return true;
        }
        public static void main(String[] args)
        {
            String str = "level";
            if (Palindrome(str))
                System.out.print("It is Palindrome");
            else

                System.out.print("It is not a Palindrome");
        }
    }



