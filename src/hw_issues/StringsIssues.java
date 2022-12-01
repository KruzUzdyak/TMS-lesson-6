package hw_issues;

import java.util.Scanner;

public class StringsIssues {

    public static void main(String[] args) {
        String e  = "e";
        System.out.printf("H%sllo %s !", e, "world");
        System.out.println();
        String str = String.format("H%sllo %s ! %b", e, "world", true);
        System.out.println(str);
//        printToBrowser(str);
//        saveToFile(str);
    }

    void hw(){
        for (int i = 1; i < 10; i += 2) {
            System.out.println("odd");
        }

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("your input:");
        while (!scanner.hasNextInt()){
            scanner.nextLine();
        }
        i = scanner.nextInt();
        System.out.println(i);
    }
}
