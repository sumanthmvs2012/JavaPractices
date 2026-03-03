import java.util.HashMap;

public class DuplicateCharacters
{
    public static void main(String[] args)
    {
        HashMap<Character, Integer> hp = new HashMap<>();
        String str = "helloa this is java";
        str= str.replace(" ", "");
        str = str.replace(",","");
        str= str.replace(".","");
        System.out.println(str);

        for(char ch : str.toCharArray())
        {
            hp.put(ch, hp.getOrDefault(ch,0) + 1);
        }
        System.out.println(hp);


        StringBuilder st = new StringBuilder(str);
        for(char ch : str.toCharArray())
        {
            if(ch == ch+1)
            {

            }
        }

    }
}
