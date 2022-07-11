package task_1;
import java.util.Arrays;

public class ArraysUniqeSymbols {

    public static int getArrayUniqeSymbols(int[] array){
        Arrays.sort(array);
        int countOfUniques = 1;
        int currentValue = array[0];
        for(int i = 1; i < array.length; i++) {
            if(currentValue != array[i]){
                countOfUniques++;
                currentValue = array[i];
            }
        }
        return countOfUniques;
    }
}
