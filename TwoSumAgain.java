import java.util.HashMap;
import java.util.Map;

public class TwoSumAgain {
    public static void main(String[] args){
   
        int []nums ={2,3,4,5,55,32};
        int target =99;
      // Create a hash map to store the value and index position 
      Map<Integer, Integer> map = new HashMap<>();

      //Iterate through the array 
      for(int i=0; i<nums.length; i++){
        int compliment = target - nums[i];
        //check if the remaining element is there or not 
        if(map.containsKey(compliment)){
            // return new int[]{map.get(compliment), i};
            System.out.println(map.get(compliment) + " " + i);
            return;
        }
        else
        //Adding the number and index in hash map 
        map.put(nums[i], i);
      }
        //Return empty array if nothing is found
       System.out.println("No such elements");
    }   
}

