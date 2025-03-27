package topic7.forEachPositive;

public class ForEachPositive {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, 5, -6, 7};

        for (int element : array){
            if (element > 0){
                System.out.println(element);
            }
        }
    }
}
