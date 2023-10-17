import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Garage  implements Iterable<Integer> {
    private List<Integer> integerList;

    public Garage() {
        this.integerList = List.of(10,20,30,40,50,60,70);
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator();

    }
    private class CustomIterator implements Iterator<Integer>{

        int counter = 0;
        int evenIndex = 0;
        int oddIndex = 1;
        int totalCount =1;

        public int getIndex(){
            int norma = -1;
            int limit = (int) Math.ceil((double) integerList.size() / 2);
            if(counter < limit){
                counter++;
                totalCount++;
                norma = evenIndex;
                evenIndex+=2;

                return norma;
            }
            totalCount++;
            norma = oddIndex;
            oddIndex+=2;
            return norma;




        }


        @Override
        public boolean hasNext() {
           return totalCount <= integerList.size();
        }

        @Override
        public Integer next() {
            return integerList.get(getIndex());
        }
    }
}
