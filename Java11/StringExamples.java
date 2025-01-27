package Java11;

import java.util.stream.Collectors;

public class StringExamples {
    public static void main(String[] args) {
        // using isBlank() : check if a string is empty or contains only whitespace
        String empty = "";
        String whiteSpace = " ";
        String text = "Blue Planet!";
        System.out.println(empty.isBlank());
        System.out.println(whiteSpace.isBlank());
        System.out.println(text.isBlank());

        // using lines(): return a stream of lines a string, split by line terminators(\n or \r\n)
        String multiLineText = "Line\nLine2\nLine3";
        multiLineText.lines().forEach(System.out::println);

        var lines = multiLineText.lines().collect(Collectors.toList());
        System.out.println(lines);

        // using strip(): removes all leading and trailing whitespaces (supports unicode)
        // using stripLeading():removes only leading whitespaces
        // using stripTailing(): removes only trailing whitespaces
        String task = "  Task1   ";
        System.out.println("'" + task.strip() + "'");
        System.out.println("'" + task.stripLeading() + "'");
        System.out.println("'" + task.stripTrailing() + "'");

        System.out.println();

        // using repeat(int count): repeats the string count number of times
        String word = "Blue Planet";
        System.out.println(word.repeat(5));

        // using indent(int n)
        // Positive n: Adds spaces at the beginning of each line
        // Negative n: Removes spaces (up to |n|) from the start of each line

        String t = "Hello\nWorld";
        System.out.println(t.indent(4));;

        System.out.println(t.indent(-2));

        // using transform(Function<String, R>)
        // applies a function to the string and returns the result
        System.out.println();
        String tt = "hello";
        String result = tt.transform(str -> str.toUpperCase());
        System.out.println(result);

    }
}
