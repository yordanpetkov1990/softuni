package advanced.Generics_exam;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> customList){
        customList.getData().sort((e1,e2) -> e1.compareTo(e2));
    }
}
