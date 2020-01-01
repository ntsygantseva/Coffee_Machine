package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 1200;
        int milk = 540;
        int beans = 120;
        int discups = 9;
        int money = 550;
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(discups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println("Write an action (buy, fill, take):");
        Scanner scan = new Scanner(System.in);
        String action = scan.next();
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino:");
                int coffeeChoice = scan.nextInt();
                switch (coffeeChoice) {
                    case 1:
                        water = water - 250;
                        beans -= 16;
                        money += 4;
                        discups -= 1;
                        break;
                    case 2:
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        money += 7;
                        discups -= 1;
                        break;
                    case 3:
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        money += 6;
                        discups -= 1;
                        break;
                    default:
                        System.out.println("You may enter only 1, 2 or 3");
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                int addWater = scan.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int addMilk = scan.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int addBeans = scan.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int addDiscups = scan.nextInt();
                water += addWater;
                milk += addMilk;
                beans += addBeans;
                discups += addDiscups;
                break;
            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
            default:
                System.out.println("You may enter only buy, fill or take");
                break;

        }

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(discups + " of disposable cups");
        System.out.println(money + " of money");
    }
}