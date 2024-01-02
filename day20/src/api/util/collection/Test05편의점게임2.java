package api.util.collection;
import java.util.ArrayList;
import java.util.Scanner;

public class Test05편의점게임2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> items = new ArrayList<>();

        while (true) {
            System.out.println("편의점에 가면~");
            String input = scanner.nextLine();

            if (items.contains(input)) {
                System.out.println("게임 오버!");
                System.out.println("<입력한 물건들>");
                for (int i = 0; i < items.size(); i++) {
                    System.out.println("- " + items.get(i));
                }
                break;
            } else {
                items.add(input);
            }
        }
        scanner.close();
    }
}