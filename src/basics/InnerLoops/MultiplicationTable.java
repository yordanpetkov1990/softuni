package basics.InnerLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){
            for(int y = 1;y<=10;y++){
                System.out.printf("%d * %d = %d\n",i,y,i*y);
            }
        }
    }
}
