package SAA_2kurs;


import java.util.*;


public class Kursova6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] countArr = new int[arr.length];


        int count = 1;
        int indexCheck;
        for (int i = 0; i < arr.length-1; i++) {
            indexCheck = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[indexCheck++] > arr[j]){
                    count++;
                    countArr[i] = count;
                }else{
                    break;
                }
            }
            count = 1;

        }
        int maxCount = Integer.MIN_VALUE;
        int maxStartIndex = -1;
        for (int i = 0; i < countArr.length; i++) {

           int countRedica = countArr[i];

            if(countRedica > maxCount){
                maxCount = countRedica;
                maxStartIndex = i;
            }


           int iterationCount = 0;


           if(countRedica != 0){
               for (int j = i; j <arr.length ; j++) {
                   if(countRedica == iterationCount++){
                       break;
                   }
                   System.out.print(arr[j] + " ");
               }
               System.out.print("Count - " + countRedica);
               System.out.println();
           }

        }

        int iterationCount = 0;
        System.out.println("Redicata s nai golqma duljina :");
        for (int i = maxStartIndex; i < arr.length; i++) {
            if(iterationCount == maxCount){
                break;
            }
            System.out.print(arr[i] + " ");
            iterationCount++;
        }
    }
}
