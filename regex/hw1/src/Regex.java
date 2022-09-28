import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{
    public static void Regexx() {
        String input = "tu456o ab996p yk228r tu456o";

        Pattern patern =Pattern.compile("\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)");
        Matcher matcher= patern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}

