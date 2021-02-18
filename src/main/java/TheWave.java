import java.util.Locale;

public class TheWave {

    public static String[] wave(String str) {
        Integer counter = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) != ' '){ counter++; }
        }
        String[] answer = new String[counter];
        for (int i = 0, j=0; i<str.length(); i++){
            if (str.charAt(i) != ' '){
                String first = str.substring(0, i);
                String character = Character.toString(str.charAt(i)).toUpperCase();
                String rest = str.substring(i+1);
                answer[j] = first + character + rest;
                j++;
            }
        }
        return answer;
    }
}
