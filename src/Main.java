import java.util.function.BiPredicate;

public class Main {
    public static String betterString(String s1, String s2, BiPredicate<String, String> predicate){
        String result;
        if (predicate.test(s1,s2))
            result = s1;
        else
            result = s2;
        return result;
    }

    public static boolean onlyLetters(String s){
        for (char c : s.toCharArray()){
            if (!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Test";

        String longer = Main.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        System.out.println(longer);

        String first = Main.betterString(str1, str2, (s1, s2) -> true);
        System.out.println(first);

        System.out.println("Test123");
        System.out.println(Main.onlyLetters("Test123"));
    }
}
