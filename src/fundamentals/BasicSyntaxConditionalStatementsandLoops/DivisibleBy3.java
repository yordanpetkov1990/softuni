package fundamentals.BasicSyntaxConditionalStatementsandLoops;

public class DivisibleBy3 {
    public static void main(String[] args) {
        for(int i = 3;i<=100;i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
