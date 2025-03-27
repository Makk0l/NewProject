package topic6.countOccurrences;

public class CountOccurrences {
    public static void main(String[] args) {
        int i = 0;
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 5;
        array[2] = 3;
        array[3] = 5;
        array[4] = 4;

        for (int a : array){
            if (a == 5){
                i++;
            }
        }
        System.out.println(i);

    }
}
