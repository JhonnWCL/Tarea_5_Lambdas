package helper;

import java.util.List;

public class Print {
    public static void printList(List<String> list){
        list.forEach(System.out::println);
    }
    public static void printDescription1(List<String> list){
        printDelimiter(1);
        System.out.println(Colors.Blue+"Given a list of strings, write a method that returns a list of all string that start\n" +
                "with the letter 'a' (lower case) and have exactly 3 letters\n" +
                "list data-> \"alcohol\", \"ala\", \"aword\",\"a  l   r\",\"a123;sd  % .\",\"a2 ls\"\n" +
                Colors.Red+"Output:"+Colors.Default);
        list.forEach(System.out::println);
    }
    public static void printDescription2(String result){
        printDelimiter(2);
        System.out.println(Colors.Blue+"Write a method that returns a comma separated string based on a given list of integers\n" +
                "Each element should be preced by the letter 'e' if the number is even and preceded by the letter\n"+
                "'o' if the number is odd For example, if the input list is (3,44) the ouput should be 'o3,e44'\n" +
                "list data -> 2, 21, 5, 2, 11");
        System.out. println(Colors.Red+"Output:\n"+Colors.Default+result);
    }
    public static void printDescription3(String result){
        printDelimiter(3);
        System.out.println(Colors.Blue+"Create a String that consists of the first letter of \n" +
                "each word in the list of String provided " +
                "list data -> \"hola\", \"mundo\", \"java\"");
        System.out. println(Colors.Red+"Output:\n"+Colors.Default+result);
    }

    public static void printDescription4(){
        printDelimiter(4);
        System.out.println(Colors.Blue+"Remove the words that have odd lengths from the\n"+
                "list. change the input list\n"+
                "list data -> \"holas\", \"como\", \"esta\",\"usted\"\n" +
                Colors.Red+"Output:"+Colors.Default);
    }

    public static void printDescription5(){
        printDelimiter(5);
        System.out.println(Colors.Blue+"Replace every word in the list with its upper case equivalent. Change the\n"+
                "input list list is not empty. Strings in list are not null or the empty string\n"+
                "list data -> \"holA\", \"mundo\", \"Cbba\"\n" +
                Colors.Red+"Output:"+Colors.Default);
    }

    public static void printDescription6(String result){
        printDelimiter(6);
        System.out.println(Colors.Blue+"Convert every key-value pair of the map into a string and append them all into a\n"+
                "single string , in iteration order. The input is never empty and the keys are not null or the empty string\n"+
                "list data -> <\"Key1\",1> <\"Key3\",3> <\"Key2\",2> <\"Key4\",4>");
                System.out. println(Colors.Red+"Output:\n"+Colors.Default+result);
    }

    public static void printDescription6(){
        printDelimiter(6);
        System.out.println(Colors.Blue+"Create a new thread that prints the numbers from numbers from the list. Print output to the\n"+
                "'out' argument instead of System.out. The list is never null or empty or contains null\n"+
                "The printed numbers must be separated by a white-space character\n"+
                "list data -> 2,21,5,2,11");
        System.out. println(Colors.Red+"Output:"+Colors.Default);
    }

    private static void printDelimiter(int n){
        System.out.println(Colors.Green+"-----------------------------------------------------------------------------------------------");
        System.out.print(Colors.Red+"Exercise :"+n+" ");
    }
}