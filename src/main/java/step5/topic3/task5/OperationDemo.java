package step5.topic3.task5;

import java.util.List;

public class OperationDemo {
    public static void main(String[] args) {
       for (Operation operation : Operation.values()){
           operation.apply(12,10);
       }
       Operation.DIVIDE.apply(5,0);
    }
}
