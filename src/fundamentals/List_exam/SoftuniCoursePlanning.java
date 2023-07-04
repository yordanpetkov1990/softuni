package fundamentals.List_exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftuniCoursePlanning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> Lessons = Arrays.stream(input.nextLine().split(", ")).collect(Collectors.toList());

        String newInput = input.nextLine();

        while(!newInput.equalsIgnoreCase("course start")){
            List <String> Split = Arrays.stream(newInput.split("\\:+")).collect(Collectors.toList());

            String Command = Split.get(0);
            switch(Command){
                case"Add":
                    String lessonTitle = Split.get(1);
                    if(!Lessons.contains(lessonTitle)){
                        Lessons.add(lessonTitle);
                    }
                    break;
                case"Insert":
                    lessonTitle = Split.get(1);
                    int Index = Integer.parseInt(Split.get(2));

                    if(!Lessons.contains(lessonTitle) && (Index>=0 && Index<Lessons.size())){
                        Lessons.add(Index,lessonTitle);
                    }
                    break;
                case"Remove":
                    lessonTitle = Split.get(1);
                    String exerciseTitle = Split.get(1)+"-Exercise";

                    if(Lessons.contains(lessonTitle) && Lessons.contains(exerciseTitle)){
                        Lessons.remove(lessonTitle);
                        Lessons.remove(exerciseTitle);
                    }
                    if(Lessons.contains(lessonTitle)){
                        Lessons.remove(lessonTitle);
                    }

                    if(Lessons.contains(exerciseTitle)){
                        Lessons.remove(exerciseTitle);
                    }

                    break;
                case"Swap":
                    String lessonTitle1 = Split.get(1);
                    String lessonTitle2 = Split.get(2);

                    if(Lessons.contains(lessonTitle1) && Lessons.contains(lessonTitle2)) {
                        int indexOfFirst = Lessons.indexOf(lessonTitle1);
                        int indexOfSecond = Lessons.indexOf(lessonTitle2);

                        String tempValue = Lessons.get(indexOfFirst);

                        Lessons.set(indexOfFirst, lessonTitle2);
                        Lessons.set(indexOfSecond, tempValue);

                        if(Lessons.contains(lessonTitle1+"-Exercise")){
                            String tempName = lessonTitle1+"-Exercise";
                            Lessons.remove(lessonTitle1 + "-Exercise");

                            if(indexOfSecond+1<=Lessons.size()-1){
                                Lessons.add(indexOfSecond+1,tempName);
                            }else{
                                Lessons.add(tempName);
                            }
                        }

                        if(Lessons.contains(lessonTitle2+"-Exercise")){
                            String tempName = lessonTitle2+"-Exercise";
                            Lessons.remove(lessonTitle2 + "-Exercise");

                            if(indexOfFirst+1<=Lessons.size()-1){
                                Lessons.add(indexOfFirst+1,tempName);
                            }else{
                                Lessons.add(tempName);
                            }
                        }
                    }
                    break;
                case"Exercise":
                    lessonTitle = Split.get(1);
                    String newValue = lessonTitle+"-Exercise";

                    if(Lessons.contains(lessonTitle)){
                        int indexOf = Lessons.indexOf(lessonTitle);
                        if(indexOf<=Lessons.size()-1) {
                            Lessons.add(indexOf + 1, newValue);
                        }else{
                            Lessons.add(newValue);
                        }
                    }else{
                        Lessons.add(lessonTitle);
                        Lessons.add(newValue);
                    }
            }
            newInput=input.nextLine();
        }

        for(int i=1;i<=Lessons.size();i++){
            System.out.printf("%s.%s\n",i,Lessons.get(i-1));
        }
    }
}
