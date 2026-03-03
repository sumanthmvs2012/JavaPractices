public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "Sumanth";
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        System.out.println(rev);

        if(str.equals(rev))
        {
            System.out.println("It is pallindrome");
        }
        System.out.println("It is not a pallindrome");
    }
}
