package FirstMonth;
import java.util.HashSet;   

public class ContainsDuplicate {
    public static void main(String[] args){
        int []nums ={1,2,3,4,5,6,7};

        HashSet<Integer> hs = new HashSet<>();

        for(int i: nums){
            if(hs.contains(i)){
                System.out.println("Duplicate found");
                return;
            }
        else{
            hs.add(i);
        }
    }
    System.out.println("No duplicate found");

    }
    
}
