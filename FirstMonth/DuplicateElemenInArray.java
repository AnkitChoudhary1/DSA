package FirstMonth;
import java.util.*;

public class DuplicateElemenInArray {
    public static void main(String[] args){
        int[] nums = {99,2,34,33,5,6,7,8,9,1,11};
        HashSet<Integer> num = new HashSet<>();

        for(int i : nums){
            if(num.contains(i)){
                System.out.println("Duplicate found " +i);
                return;
            }
            else{
                num.add(i);
            }
        }
        System.out.println("No dublicate element found");


    }
    
}
