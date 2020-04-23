import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class DailyReport {
    public static void main(String[] args) throws IOException {
        Scanner input = null;
        Burger[] burgers = new Burger[11];
        try {
            input = new Scanner(new File("C:\\Users\\Test\\IdeaProjects\\lab12\\src\\input.txt"));
        }catch (Exception e){
            System.out.println("exception file input os");
        }

        int j = 0;
        while (input.hasNext()) {
            String newCode;
            int newQuantity;

            newCode = input.next();
            newQuantity = input.nextInt();

            burgers[j] = new Burger(newCode, newQuantity);
            j++;
        }

        System.out.println("\t\t ABC BURGER DAILY SALES REPORT");
        double totalPrice;
        double totalIncome = 0.0;
        String currentCode;
        System.out.println("Num\t Code \t DESCRIPTION \t\t\t PRICE(RM)\t\t QUANTITY \t\t TOTAL PRICE(RM)");
        for (int i = 0; i < burgers.length; i++) {

            currentCode = burgers[i].getCode();
            totalPrice = burgers[i].getQuantity() * MenuList.valueOf(currentCode).getPrice();
            System.out.println(
                    (i + 1) + "\t" + (burgers[i].getCode()) + "\t" +
                    (MenuList.valueOf(currentCode).getDesc()) + "\t\t\t" +MenuList.valueOf(currentCode).getPrice() +
                    "\t\t"+burgers[i].getQuantity() +" \t\t"+ Math.round(totalPrice)
            );

            totalIncome += totalPrice;
        }

        System.out.println();
        System.out.println("\t\t\t total Items Sold = "+ Burger.totalItem+ " burgers(s)");
        System.out.println("\t\t\t total Items Sold = RM"+ totalIncome);
    }
}

