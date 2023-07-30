

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> heroesAndHP = new LinkedHashMap<>();
        Map<String, Integer> heroesAndMP = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String[] tokens = scan.nextLine().split(" ");

            String hero = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);

            if (hp <= 100) {
                heroesAndHP.put(hero, hp);
            }
            if (mp <= 200) {
                heroesAndMP.put(hero, mp);
            }


        }
        String command = scan.nextLine();
        while(!command.equals("End")){
            String[] tokens = command.split("\\s+-\\s+");
            String commandName = tokens[0];
            String heroName = tokens[1];
            switch (commandName){
                case"CastSpell":
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    if(heroesAndMP.get(heroName) >=mpNeeded){
                        heroesAndMP.put(heroName,heroesAndMP.get(heroName)-mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n",heroName,spellName,heroesAndMP.get(heroName));
                    }
                    else{
                        System.out.printf("%s does not have enough MP to cast %s!\n",heroName,spellName);
                    }
                    break;
                case"TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    heroesAndHP.put(heroName,heroesAndHP.get(heroName)-damage);
                    if(heroesAndHP.get(heroName) > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",heroName,damage,attacker,heroesAndHP.get(heroName));
                    }
                    else{
                        System.out.printf("%s has been killed by %s!\n",heroName,attacker);
                        heroesAndHP.remove(heroName);
                    }
                    break;
                case"Recharge":
                    int amount = Integer.parseInt(tokens[2]);
                    int startValue =heroesAndMP.get(heroName);
                    if(startValue<200){
                        heroesAndMP.put(heroName,heroesAndMP.get(heroName) + amount);
                    }


                    if(heroesAndMP.get(heroName) >= 200){
                        amount = 200 - startValue;
                        heroesAndMP.put(heroName,200);
                    }
                    System.out.printf("%s recharged for %d MP!\n",heroName,amount);
                    break;
                case"Heal":
                    int amountToHeal = Integer.parseInt(tokens[2]);
                    int startValueToHeal =heroesAndHP.get(heroName);
                    if(startValueToHeal<100){
                        heroesAndHP.put(heroName,heroesAndHP.get(heroName) + amountToHeal);
                    }
                  
                    if(heroesAndHP.get(heroName) >= 100){
                        amountToHeal = 100 - startValueToHeal;
                        heroesAndHP.put(heroName,100);
                    }
                    System.out.printf("%s healed for %d HP!\n",heroName,amountToHeal);


                    break;

            }

            command= scan.nextLine();
        }
        for(Map.Entry<String,Integer> entry : heroesAndHP.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(" " + "HP: " + entry.getValue());
            System.out.println(" " + "MP: " + heroesAndMP.get(entry.getKey()));
        }
    }
}
