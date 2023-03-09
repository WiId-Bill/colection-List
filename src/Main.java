import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true){
            System.out.println("Введите номер операции: \n 1. Добавить. \n 2. Показать. \n 3. Удалить.");
            String operation = scanner.next();
            if ("end".equals(operation)) {
                System.out.println("Программа завершена!");
                break;
            }
            int productCount = Integer.parseInt(operation);
            switch ( productCount){
                case 1 :
                    System.out.println("Какую покупку хотите добавить?");
                    String product = scanner.next();
                    list.add(product);
                   int sum = 0;
                    for (String i: list) {
                        sum++;
                        }
                    System.out.println("Итого в Списке покупок:"+ sum +"");
                    break;

                case 2 :
                    System.out.println("Список покупок:");
                    for (int i=0 ; i< list.size();i++ ){
                        System.out.println((i+1)+"."+list.get(i));
                }
                    break;

                case 3 :
                    System.out.println("Список покупок:");
                    for (int i=0 ; i< list.size();i++ ){
                        System.out.println((i+1)+"."+list.get(i));
                    }
                    System.out.println("Какую хотите удалить? ВВедите номер или название:");
                    String numberName = scanner.next();
                    try{
                        int index = Integer.parseInt(numberName)-1;
                        list.remove(index);
                    } catch (Exception e){
                        list.remove(numberName);
                    }
                default:System.out.println("Ввели не правильную команду");
            }
        }

    }
}