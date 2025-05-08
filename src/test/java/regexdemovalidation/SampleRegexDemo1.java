package regexdemovalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleRegexDemo1 {
    public static void main(String[] args) {
        String name ="234567 this is my order";
        String name1 ="234567";
        String num ="65";

        System.out.println(num.matches("([0-9]|[1-5][0-9]|6[0-5])"));
        System.out.println(name1.matches("([0-9]{6})"));

        String otpmsg = "[#] 278221 is your LOGIN OTP for Flipkart. DO NOT SHARE this code with anyone, including Flipkart delivery agents.";
        String regex ="([0-9]{6})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(otpmsg);

        if(matcher.find()){
            String group  = matcher.group();;
            System.out.println("extracted data :"+group);

        }
    }
}
