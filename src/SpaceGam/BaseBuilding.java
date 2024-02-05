package SpaceGam;

import java.util.List;

public abstract class BaseBuilding {
    private String name;
    private int level;
    private double contructionTime;
    private double metalRequired;
    private double gasRequired;
    private double crystalRequired;
    private double uraniumRequired;



    public BaseBuilding(String name, int level, double contructionTime,double metalRequired,double gasRequired,double crystalRequired,double uraniumRequired) {
        this.name = name;
        this.level = level;
        this.contructionTime = contructionTime;
        this.metalRequired = metalRequired;
        this.gasRequired = gasRequired;
        this.crystalRequired = crystalRequired;
        this.uraniumRequired = uraniumRequired;
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getContructionTime() {
        return contructionTime;
    }
    public void construct(Planet target){

    }


}
