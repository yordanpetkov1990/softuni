import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int firstElement = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = firstElement;
        System.out.println();




        }
    }
