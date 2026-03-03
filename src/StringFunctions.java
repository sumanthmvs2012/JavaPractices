import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringFunctions
{
    public static void main(String[] args)
    {

        StringMethods sm = new StringMethods();
        sm.Remove_Duplicates("hello");
        sm.Anagrams("ant", "ten");
        sm.First_NonRepeated("hellojavaisgood");
        sm.String_Digits("1234sumanth");
        int sum_of_vowelConsonant = sm.Count_VowelConstant("vowels");
        System.out.println("Count Vowels:- "+ sum_of_vowelConsonant);

        //Check if a String is a Rotation of Another String
        sm.RotationString();
        String longestStr = sm.Longest_word("hello Javacyui is good");
        System.out.println(longestStr);

        sm.CountCharacters();
    }
}

class StringMethods
{
    public void Remove_Duplicates(String str)
    {
        HashSet<Character> hc = new HashSet<>();
        for(char ch : str.toCharArray())
        {
           hc.add(ch);
        }
        System.out.println("Remove_Duplicates:- " + hc);
    }

    public void Anagrams(String str1, String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();
        HashMap<Character, Integer> hp = new HashMap<>();
        HashMap<Character, Integer> hp2 = new HashMap<>();
        if(len1 == len2)
        {
            for(char ch: str1.toCharArray())
            {
               hp.put(ch, hp.getOrDefault(ch,0)+1);
            }
           // System.out.println(hp);

            for(char ch1: str2.toCharArray())
            {
                hp2.put(ch1, hp2.getOrDefault(ch1,0)+1);
            }
            //System.out.println(hp2);

            boolean sameKeys = hp.keySet().equals(hp2.keySet());
            System.out.println("Anagrams:- " + sameKeys);
        }
    }

    public void First_NonRepeated(String str)
    {
        LinkedHashSet<Character> hc = new LinkedHashSet<>();
        for(char ch : str.toCharArray())
        {
            hc.add(ch);
        }
        char ch1 = hc.stream().findFirst().get();
        System.out.println("First_NonRepeated:- " + ch1);
    }

    public void String_Digits(String str)
    {
        char[] ch = str.toCharArray();
        boolean b = str.matches("\\d+");
        if(!b)
        {
            System.out.println("String_Digits --> Does have digits");
        }
        else {
            System.out.println("String_Digits --> Doesn't have digits");
        }
    }

    public int Count_VowelConstant(String str)
    {
        char[] charry = str.toCharArray();
        int vowels = 0;
        int consonant = 0;
        for(char ch:str.toCharArray())
        {
            if(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u' | ch == 'A' | ch == 'E' | ch == 'I' | ch == 'O' | ch == 'U')
            {
                vowels += 1;
            }
            else
            {
                consonant += 1;
            }
        }
        //System.out.println("vowels:- " + vowels + "consonant:- " + consonant);

        return vowels;
    }


    //Check if a String is a Rotation of Another String
    public void RotationString()
    {
        // I was disappointed
        String str1 = "ant";
        String str2 = "tan";

        if(str1.length() == str2.length() && (str1+ str1).contains(str2))
        {
            System.out.println("It is a rotation");
        }
        else
        {
            System.out.println("It is not a rotation");
        }
    }

    //11. Find the longest word in a sentence

    /*
  1. First divide the sentence using string array by removing the spaces.
  2. Write a loop for the string array. Inside the loop we take the lenght of the each word.
  3. Store the length and the word in the Linkedhashmap for the odered way.
  4. THen extract the max key by using max key and the value by max value using the hashmap methods. Print it.
   */

    public String Longest_word(String str)
    {
        String[] myArray = str.split(" ");
        HashMap<String, Integer> lsm = new HashMap<>();
        for(String s : myArray)
        {
            lsm.put(s ,s.length());
        }
        System.out.println(lsm);

        Map.Entry<String, Integer> entry = lsm.entrySet().stream()
                                              .max(Map.Entry.comparingByKey()).orElse(null);

        return entry.getKey();
    }

    //22. Compress a string (aaabb -> a3b2)

    /*
    1. first string to array using toCharArray
    2. create a linkedhashmap to get a ordered map
    3. running a for loop to iterate the map
    4. using getorDefault to get the count kf the characters
    5. then change the keys into char and combine all the characters
     */

    public void CountCharacters()
    {
       String str = "aaabb";



    }

}


