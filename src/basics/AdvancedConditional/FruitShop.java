package basics.AdvancedConditional;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0;
        if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                price = quantity * 2.50;
            } else if (fruit.equals("apple")) {
                price = quantity * 1.20;
            } else if (fruit.equals("orange")) {
                price = quantity * 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = quantity * 1.45;
            } else if (fruit.equals("kiwi")) {
                price = quantity * 2.70;
            } else if (fruit.equals("pineapple")) {
                price = quantity * 5.50;
            } else if (fruit.equals("grapes")) {
                price = quantity * 3.85;
            }
            else{

            }
        }
        else if(day.equals("Saturday") || day.equals("Sunday")){
                if(fruit.equals("banana")){
                    price = quantity * 2.70;
                }
                else if(fruit.equals("apple")){
                    price = quantity * 1.25;
                }
                else if(fruit.equals("orange")){
                    price = quantity * 0.90;
                }
                else if(fruit.equals("grapefruit")){
                    price = quantity * 1.60;
                }
                else if(fruit.equals("kiwi")){
                    price = quantity * 3.00;
                }
                else if(fruit.equals("pineapple")){
                    price = quantity * 5.60;
                }
                else if(fruit.equals("grapes")){
                    price = quantity * 4.20;
                }

            }
        if(price > 0){
            System.out.printf("%.2f",price);
        }
        else{
            System.out.println("error");
        }
        }
    }

