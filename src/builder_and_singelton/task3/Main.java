package builder_and_singelton.task3;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(new Product(900, "Apple", "Iphone"));
        shop.addProduct(new Product(800, "Samsung Galaxy", "Samsung Galaxy S"));
        shop.addProduct(new Product(500, "Huawei", "Honor 20"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует магазин");
        while (true) {
            listOfDeal();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    shop.showAll();
                    break;
                case 2:
                    System.out.println("Выберите по какому параметру будете фильтровать");
                    System.out.println("1. Цена\n" +
                            "2. Фильтрация товаров по ключевым словам");
                    int par = Integer.parseInt(scanner.nextLine());
                    switch (par) {
                        case 1:
                            System.out.println("Введите цену");
                            int price = Integer.parseInt(scanner.nextLine());
                            shop.applyFilters(new PriceFilter(price));
                            break;
                        case 2:
                            System.out.println("Введите слово");
                            String keyWord = scanner.nextLine();
                            shop.applyFilters(new KeyWordFilter(keyWord));
                            break;
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    static void listOfDeal() {
        System.out.println("Выберите действие:");
        System.out.println("1. Вывод доступных для покупки товаров\n" +
                "2. Фильтрация товаров по ключевым словам, ценам, производителям\n" +
                "0. Выход");
    }
}
