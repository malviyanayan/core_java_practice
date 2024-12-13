import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A{
    public static void main(String[] args){
        String str = "cat hot cit cot kyio cotki";
        String regex = "c.t";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        while(m.find()){
            System.out.println(m.toMatchResult().start() + m.toMatchResult().group());
        }

    }
}