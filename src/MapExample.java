import com.sun.source.doctree.SystemPropertyTree;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample
{
    public static void main(String[] args)
    {
        List<String> mapnames = Arrays.asList("alice", "bob", "charlie"); //map
        List<Integer> reducelist = Arrays.asList(1,2,3,4,5); //reduce
        List<Integer> peeknumbers = Arrays.asList(1, 2, 3, 4, 5); //peek
        List<List<String>> listOfListsforflatlist = Arrays.asList(   //flatlist
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );
        List<Integer> distinctnumbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> sortednumbers = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> skipnumbers = Arrays.asList(1, 2, 3, 4, 5);

        mapnames.stream().map(String::toUpperCase).forEach(System.out::println); // map for converting the data eg:- lower to uppercase

        int ourlist = reducelist.stream().reduce(0,(a, b) -> a+b);
        System.out.println("Reduce operation:- "+ourlist);


        System.out.print("Flatlist:- ");
        listOfListsforflatlist.stream().flatMap(Collection::stream).forEach(flatlist -> System.out.println(flatlist + " "));

        final List<Integer> sqaredList = peeknumbers.stream()
                .peek(before -> System.out.println("before :- " + before))  // before modification
                .map(n -> n * n)
                .peek(after -> System.out.println("after :- " + after))  // after modification
                .collect(Collectors.toList());

        System.out.println("Distinct:- ");
        distinctnumbers.stream()
                .distinct().forEach(System.out::println);

        System.out.println("Sorted:- ");
        sortednumbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<String> words =
                Arrays.asList("apple", "banana", "kiwi", "cherry");

        List<String> lst = words.stream().sorted(Comparator.comparingInt(String::length)).toList();
        lst.forEach(System.out::println);

        System.out.println("Skip:- ");
        List<Integer> skipnum = skipnumbers.stream().skip(2).collect(Collectors.toList());
        skipnum.forEach(System.out::println);

        System.out.println("Limit:- ");
        skipnumbers.stream().limit(3).forEach(System.out::println);


        List<Integer> collectlist = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("Limit:- ");
        List<Integer> finallist = collectlist.stream()
                                             .filter(x->x%2 == 0)
                                             .map(x->x *x).collect(Collectors.toList());
        System.out.println("Limit:- " + finallist);


        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        List<Integer> myList1 = myList.stream().limit(1).collect(Collectors.toList());
        System.out.println("fist number:- " + myList1);
        myList.stream().findFirst().ifPresent(System.out::println);


        myList.stream().forEach(System.out::println); //rodrered
        System.out.println("..................");
        myList.parallelStream().forEach(System.out::println); //unordered


        String input = "Java articles are Awesome";

       // Character ch = input.toCharArray();

    }

}
