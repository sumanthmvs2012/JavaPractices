import java.util.HashMap;

public class CountOccurrences
{
    public static void main(String[] args)
    {
        String str = "helloa this is java";
        char ch = 'a';
        str = str.replace(" ", "");
        int res = (int)str.chars().filter(c-> c==ch).count();
        System.out.println(res);

    }
}
