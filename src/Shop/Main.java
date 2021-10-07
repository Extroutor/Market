package Shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String command;

        MarketManager marketManager = new MarketManager();

        marketManager.addMarket("Diksi");
        marketManager.addMarket("Magnit");
        marketManager.addMarket("Okay");

        marketManager.listsMarkets();

        int amount = marketManager.getProductsAmount("Magnit", "Картошка");
        System.out.println(amount);

        marketManager.supplyProducts("Magnit", "Картошка", 100, 150);
        amount = marketManager.getProductsAmount("Magnit", "Картошка");
        System.out.println(amount);

//        while (true) {
//            command = scanner.next();
//            switch (command) {
//                case "add market":
//                    break;
//                case "supply":
//                    break;
//                case "lookup":
//                    break;
//                case "list":
//                    break;
//                case "cheapest":
//                    break;
//                case "sell":
//                    break;
//                case "profit":
//                    break;
//                case "profitable":
//                    break;
//                case "exit":
//                    break;
//                default:
//                    return;
//            }
//        }
    }

}
