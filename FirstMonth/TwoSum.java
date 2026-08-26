package FirstMonth;

public class TwoSum {
    public static void main(String[] args){
        int []nums = {2,3,4,5,67,1,2,3,4,5,6,7,8,9};
        int target = 5;
        boolean found = false;
        outer:
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("the numers are "+nums[i]+" and"+nums[j]);
                    found = true;
                    break outer;
                }
            }

        }
        if(!found)
        System.out.println("No pair found");
    }

    /*
    System.out.println("Start small. Ship something.");
        int[] nums ={2,3,4,5,6,4,32,21,0,9,4,55};
        int target =999;
        boolean flag=false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){

        int rem = target-nums[i];
        if(map.containsKey(rem)){
            System.out.println("the numbers are "+nums[i]+" "+rem);
            //flag = true;
            return;

        } 
        else{
            map.put(nums[i],i);
        }
        }
        if(!flag){
            System.out.println("No such numbers");
        }
    */

        /* 
        import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] list = {1,3,2,5,6,8,9,10,14,45,22};
        int target = 275;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<list.length; i++){
            int remainder = target - list[i];
            if(map.containsKey(remainder)){
                System.out.println("The numbers are "+list[i]+" "+remainder);
                return ;
            }

            else{
                map.put(list[i],i );
            }
            
        }
        System.out.println("No such numbers");

    }
}

        */
    
}
