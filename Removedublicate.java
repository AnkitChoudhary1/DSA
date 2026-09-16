import java.util.HashMap;

public class Removedublicate {
    public static void main(String[] args){
        //Leet code 219. Contains Duplicate II
        int[] nums ={1,2,3,1}; 
        int  k=3;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i= 0; i<nums.length; i++){
            if(hm.containsKey(nums[i]) && i-hm.get(nums[i])<=k){
                System.out.println("Duplicate found");
                return;
            }
            else{
                hm.put(nums[i], i);
            }

        }

        System.out.println("No duplicate found");


    }
    
}
