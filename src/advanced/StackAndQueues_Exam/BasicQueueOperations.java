package advanced.StackAndQueues_Exam;

import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int s = Integer.parseInt(tokens[1]);
        int x = Integer.parseInt(tokens[2]);
        Deque<Integer> queue = new ArrayDeque<>();

        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).forEach(queue::offer);
        for (int i = 0; i <s; i++) {
            queue.poll();
        }
        if(queue.contains(x)){
            System.out.println(true);
        }else{
            if(!queue.isEmpty()){
                System.out.println(Collections.min(queue));
            }else{
                System.out.println(0);
            }
        }
    }
}
