package sorting;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.util.*;

public class SortingTool {
    @Parameter(names = "-dataType")
    public static String dataType = "word";
    @Parameter (names = "-sortingType")
    public static String sortingType = "natural";

    public static void printLongType(Scanner scanner, ArrayList<Long> list, String sortingType) {
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            list.add(number);
        }

        if (sortingType.equals("byCount")) {
            list.sort(Comparator.comparingLong(a -> Collections.frequency(list, a)).thenComparingLong(a -> (long) a));
            System.out.printf("Total numbers: %d.\n", list.size());
            for (Long num :
                   new LinkedHashSet<>(list)) {
                int frequency = Collections.frequency(list, num);
                int percent = (int) ((double)frequency / (double)list.size() * 100);
                System.out.printf("%d: %d time(s), %d%%%n", num, frequency, percent);
            }
        } else {
            list.sort(Long::compareTo);
            System.out.printf("Total numbers: %d.\n", list.size());
            System.out.print("Sorted data: ");
            list.forEach((a) -> System.out.print(a + " "));
        }
    }

    public static void printLineType(Scanner scanner, ArrayList<String> list, String sortingType) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            list.add(line);
        }

        if (sortingType.equals("byCount")) {
            list.sort(Comparator.comparing(a -> Collections.frequency(list, a)).thenComparing(Object::toString));
            System.out.printf("Total lines: %d.\n", list.size());
            for (String line :
                    new LinkedHashSet<>(list)) {
                int frequency = Collections.frequency(list, line);
                int percent = (int) ((double)frequency / (double)list.size() * 100);
                System.out.printf("%s: %d time(s), %d%%%n", line, frequency, percent);
            }
        } else {
            list.sort(String::compareTo);
            System.out.printf("Total lines: %d.\n", list.size());
            System.out.print("Sorted data: ");
            list.forEach(System.out::println);
        }
    }

    public static void printWordType(Scanner scanner, ArrayList<String> list, String sortingType) {
        while (scanner.hasNext()) {
            String line = scanner.next();
            list.add(line);
        }

        if (sortingType.equals("byCount")) {
            list.sort(Comparator.comparing(a -> Collections.frequency(list, a)).thenComparing(Object::toString));
            System.out.printf("Total words: %d.\n", list.size());
            for (String word :
                    new LinkedHashSet<>(list)) {
                int frequency = Collections.frequency(list, word);
                int percent = (int) ((double)frequency / (double)list.size() * 100);
                System.out.printf("%s: %d time(s), %d%%%n", word, frequency, percent);
            }
        } else {
            list.sort(String::compareTo);
            System.out.printf("Total words: %d.\n", list.size());
            System.out.print("Sorted data: ");
            list.forEach((a) -> System.out.print(a + " "));
        }
    }

    public static void startSortingTool(String[] args) {
        JCommander commander = JCommander
                .newBuilder()
                .addObject(new SortingTool())
                .build();
        commander.parse(args);
        Scanner scanner = new Scanner(System.in);

        switch (dataType) {
            case "long":
                ArrayList<Long> longList = new ArrayList<>();
                SortingTool.printLongType(scanner, longList, sortingType);
                break;
            case "line":
                ArrayList<String> lineList = new ArrayList<>();
                SortingTool.printLineType(scanner, lineList, sortingType);
                break;
            default:
                ArrayList<String> wordList = new ArrayList<>();
                SortingTool.printWordType(scanner, wordList, sortingType);
                break;
        }
    }
}
