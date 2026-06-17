import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();

        String vowels = "aoyeui";
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) == -1) {
                ans.append('.').append(ch);
            }
        }

        System.out.println(ans);
    }
}