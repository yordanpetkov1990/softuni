package advanced.halloween;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Kid> data;
    private int capacity;

    public House(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }
    public void addKid(Kid kid){
        if(data.size() < capacity){
            data.add(kid);
        }
    }
    public boolean removeKid(String name){
        return data.removeIf(kid -> kid.getName().equals(name));
    }
    public Kid getKid(String street){
        return data.stream().filter(kid -> kid.getStreet().equals(street)).findFirst().orElse(null);
    }
    public int getAllKids(){
        return data.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder("Children who visited a house for candy:\n");
        data.stream().forEach(kid -> sb.append(String.format("%s from %s street\n",kid.getName(),kid.getStreet())));
        return sb.toString();
    }
}
