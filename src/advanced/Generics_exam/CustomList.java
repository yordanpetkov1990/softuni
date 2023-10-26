package advanced.Generics_exam;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> data;
    public CustomList(){
        this.data = new ArrayList<>();
    }
    public void add(T element){
        this.data.add(element);
    }
    public T remove(int index){
        return this.data.remove(index);
    }
    public boolean contains(T element){
        return this.data.contains(element);
    }
    public void swap(int firstIndex, int secondIndex){
        T element1 = this.data.get(firstIndex);
        T element2 = this.data.get(secondIndex);
        this.data.set(firstIndex,element2);
        this.data.set(secondIndex,element1);
    }
    public int countGreaterThan(T element){
        int count = 0;
        for (T x: this.data) {
            if(x.compareTo(element) > 0){
                count++;
            }
        }

        return count;
    }
    public T getMax(){
        return this.data.stream().max((e1,e2) -> e1.compareTo(e2)).get();
    }
    public T getMin(){
        return this.data.stream().min((e1,e2) -> e1.compareTo(e2)).get();
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
