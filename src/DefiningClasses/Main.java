package DefiningClasses;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Map<Integer,BankAccount> bankAccountMap = new HashMap<>();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        while(!command.equals("End")){
            if(command.equals("Create")){
                BankAccount bankAccount = new BankAccount();
                bankAccountMap.put(bankAccount.getId(),bankAccount);
                System.out.println(String.format("Account ID%d created",bankAccount.getId()));
            }else if(command.contains("Deposit")){
                String[] tokens = command.split("\\s+");
                int id = Integer.parseInt(tokens[1]);

                double amount = Double.parseDouble(tokens[2]);
                try{
                    bankAccountMap.get(id).deposit(amount);
                    System.out.println(String.format("Deposited %s to ID%d", decimalFormat.format(amount),id));
                }catch (Exception e){
                    System.out.println("Account does not exist");
                }


            }else if(command.contains("SetInterest")){
                String[] tokens = command.split("\\s+");
                double interest = Double.parseDouble(tokens[1]);
                BankAccount.setInterestRate(interest);
            } else if (command.contains("GetInterest")) {
                String[] tokens = command.split("\\s+");
                int id = Integer.parseInt(tokens[1]);

                int years = Integer.parseInt(tokens[2]);
                try{
                    System.out.printf("%.2f\n",bankAccountMap.get(id).getInterest(years));
                }catch (Exception e){
                    System.out.println("Account does not exist");
                }

            }




            command = scan.nextLine();
        }
    }
}
