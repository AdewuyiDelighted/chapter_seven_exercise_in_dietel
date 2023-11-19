import java.util.Arrays;

public class ArrayBonus {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(showBestScore()));
    }
    public static int[] setArray(){
        int [] array = new int[20];
        for(int index = 0; index < 10;index++){
            array[index] = index +1;
        }
    return array;
    }
    public static int[] multiplyAllElementByArrayBonus(){
        int [] hasElements = setArray();
        int arrayBonus = 2 ;
        for(int index = 0; index < hasElements.length;index++){
            hasElements[index] = hasElements[index] * arrayBonus;
        }
        return hasElements;
    }
    public static int[] showBestScore(){
        int [] elements = multiplyAllElementByArrayBonus();
        int [] bestScore = new int[10];
        for(int index = 0; index < elements.length;index++){
            if(elements[index] != 0){
                bestScore[index] = elements[index];
            }
        }
        return bestScore;
    }

}
