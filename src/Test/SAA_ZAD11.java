package Test;

public class SAA_ZAD11 {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-4,5,-6,7,-8};
        // 1
        int count =0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] > 0){
                if(arr[i+1] < 0){
                    count++;
                }
            }
            if(arr[i] < 0){
                if(arr[i+1] > 0){
                    count++;
                }
            }

        }
        System.out.println();
    }
}
