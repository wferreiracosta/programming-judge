/**
 * checkPalindrome
 */
public class checkPalindrome {

    public static void main(String[] args) {
        
    }

    boolean checkPalindromeJudge(String inputString) {
        StringBuffer inverttida = new StringBuffer(inputString);
        inverttida.reverse();
        if (inputString.equalsIgnoreCase(inverttida.toString()))
            return true;
        else if (inputString.length() == 1)
            return true;
        else
            return false;
    }
}