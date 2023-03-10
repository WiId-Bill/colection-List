import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер операции: \n 1. Добавить. \n 2. Показать. \n 3. Удалить.\n 4.Поиск");
            String operation = scanner.next();
            if ("end".equals(operation)) {
                System.out.println("Программа завершена!");
                break;
            }
            int productCount = Integer.parseInt(operation);

            switch (productCount) {
                case 1:
                    addProduct(scanner, list);
                    break;

                case 2:
                    shoppingList(list);
                    break;
                case 3:
                    shoppingList(list);
                    deleteProduct(scanner, list);
                    break;
                case 4:
                    searchProduct(scanner, list);
                    break;
                default:
                    System.out.println("Ввели не правильную команду");
            }
        }
    }

    private static void searchProduct(Scanner scanner, ArrayList<String> list) {
        System.out.println("Введите текст для поиска:");
        String text = scanner.next();
        String queryLower;
        queryLower = text.toLowerCase();
        String itemLower;
        for (int i = 0; i < list.size(); i++) {
            itemLower = list.get(i).toLowerCase();
            if (itemLower.contains(queryLower)) {
                System.out.println((i + 1) + "." + list.get(i));
            }
        }
    }

    private static void addProduct(Scanner scanner, ArrayList<String> list) {
        System.out.println("Какую покупку хотите добавить?");
        list.add(scanner.next());
        int sum = 0;
        for (String i : list) {
            sum++;
        }
        System.out.println("Итого в Списке покупок:" + sum + "");
    }

    private static void deleteProduct(Scanner scanner, ArrayList<String> list) {
        System.out.println("Какую хотите удалить? ВВедите номер или название:");
        String numberName = scanner.next();
        try {
            int index = Integer.parseInt(numberName) - 1;
            list.remove(index);
        } catch (Exception e) {
            list.remove(numberName);
        }
    }

    private static void shoppingList(List<String> list) {
        System.out.println("Список покупок:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." + list.get(i));
        }
    }
}