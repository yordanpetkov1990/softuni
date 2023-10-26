package advanced.IteratorsAndComparators;

import java.util.Comparator;

public class CustomPersonComparator1 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = 0;
        result = Integer.compare(o1.getName().length(),o2.getName().length());
        if(result == 0){
//            char first = o1.getName().toLowerCase().charAt(0);
//            char second = o2.getName().toLowerCase().charAt(0);
//            result =Character.compare(first,second);
            String value1 = o1.getName().toLowerCase().charAt(0) + "";
            String value2 = o2.getName().toLowerCase().charAt(0) + "";
            result = value1.compareTo(value2);
        }
        return result;
    }
}
