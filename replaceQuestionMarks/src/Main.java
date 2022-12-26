public class Main {
    public static String replaceQuestionMarks(String S) {
        StringBuilder sb = new StringBuilder(S);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '?') {
                // Check if it's start of the string
                if(i == 0 && sb.charAt(i) == '?'){
                    sb.setCharAt(i,'b');
                }
                // Check two previous characters
                else if (i >= 2 && sb.charAt(i - 1) == sb.charAt(i - 2)) {
                    sb.setCharAt(i, sb.charAt(i - 1) == 'a' ? 'b' : 'a');
                }
                // Check two next characters
                else if (i + 2 < sb.length() && sb.charAt(i + 1) == sb.charAt(i + 2)) {
                    sb.setCharAt(i, sb.charAt(i + 1) == 'a' ? 'b' : 'a');
                }
                // Choose 'a' as the default replacement
                else {
                    sb.setCharAt(i, 'a');
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceQuestionMarks("??"));
        System.out.println(replaceQuestionMarks("a?bb"));
        System.out.println(replaceQuestionMarks("??abb"));
        System.out.println(replaceQuestionMarks("a?b?aa"));
        System.out.println(replaceQuestionMarks("aa??aa"));
        System.out.println(replaceQuestionMarks("aa??????aa"));
        System.out.println(replaceQuestionMarks("aa??????bb"));
        System.out.println(replaceQuestionMarks("????????"));
    }
}