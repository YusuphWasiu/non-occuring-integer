import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int myArray[] = {1,3,6,4,1,2};
        Arrays.sort(myArray);

        for (int i=0; i<myArray.length; i++){
            list.add(myArray[i]);
            if (list.indexOf(i) != myArray[i]){
                System.out.println(list);
            }

        }









//        System.out.println("Hello World!");
    }
}
