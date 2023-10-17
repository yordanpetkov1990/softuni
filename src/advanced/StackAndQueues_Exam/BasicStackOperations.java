package advanced.StackAndQueues_Exam;

import java.util.*;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split(" ");
        Deque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(tokens[0]);
        int s = Integer.parseInt(tokens[1]);
        int x = Integer.parseInt(tokens[2]);

        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).forEach(stack::push);
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if(stack.contains(x)){
            System.out.println("true");
        }else{
            if(!stack.isEmpty()){
                List<Integer> collect = stack.stream().sorted((e1, e2) -> Integer.compare(e2, e1)).collect(Collectors.toList());

                System.out.println(collect.get(collect.size()-1));
            }else{
                System.out.println(0);
            }
            }

        }
    }

