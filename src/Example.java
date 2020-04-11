import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

    public static void main(String[] args){

        String line = "Hello World";
        //This pattern is case sensitive
        String find_pattern = ".*woRLd.*";
        //To make it case insensitive
        Pattern pattern = Pattern.compile(find_pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        boolean isMatched_n = matcher.matches();

        boolean isMatch = Pattern.matches(find_pattern, line);
        System.out.println("Find the Word ? " + isMatch);

        System.out.println("Find the word(Case Insensitive)  ? " + isMatched_n + "\n");

        //split
        String checkLine = "HelloBSutha!BThisBisBSumi\n";
        String pattern_check = "b";
        Pattern pattern_s = Pattern.compile(pattern_check, Pattern.CASE_INSENSITIVE);
        String[] myStrings = pattern_s.split(checkLine);
        for(String res : myStrings){
            System.out.println(res);
        }

        //Find if there is number presented in a string
        String check_number = "You cuteness level is 100%";
        //String find_number  = "(.)*(//d) (.)*";
        String find_number  = "\\d+";
        Pattern pattern_number = Pattern.compile(find_number);

        Matcher match_num = pattern_number.matcher(check_number);

        //List<String> age = new ArrayList<String>();
        while(match_num.find()){
            System.out.println(match_num.group());

        }

        //replace
        String replace_string = "\nYou are My angry Bird";
        String change_word = "Bird";
        String replace_word = "Cat";

        Pattern p = Pattern.compile(change_word);
        Matcher m = p.matcher(replace_string);
        replace_string = m.replaceAll(replace_word);
        System.out.println(replace_string);

        //find DOB
        String dob = "Your DOB is 23/08/1994";
        String check_dob = "(\\d{1,4}([.\\-/])\\d{1,2}([.\\-/])\\d{1,4})";

        Pattern p_dob = Pattern.compile(check_dob);
        Matcher m_dob = p_dob.matcher(dob);

        while(m_dob.find()){
            System.out.println(m_dob.group());
        }


    }
}
