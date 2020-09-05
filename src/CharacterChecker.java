import java.util.*;

class CharacterChecker {

    public static void main(String[] args) {
        String su = "UADFASDF";
        String sl = "ahhjADFDSF";
        String sd = "1KADF";
        String so = "@JADF";

        CharacterChecker characterChecker = new CharacterChecker();
        System.out.println( "Upper : "+  characterChecker.solution(su));
        System.out.println( "Lower : "+  characterChecker.solution(sl));
        System.out.println( "Digit : "+  characterChecker.solution(sd));
        System.out.println( "Other : "+  characterChecker.solution(so));
    }

    public String solution(String s) {
        char c = s.charAt(0);
        if (Character.isUpperCase(c)) {  // please fix condition
            return "upper";
        } else if (Character.isLowerCase(c)) {  // please fix condition
            return "lower";
        } else if (Character.isDigit(c)){  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }
}