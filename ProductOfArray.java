import java.util.Arrays;

public class ProductOfArray {

  

    public static void main(String[] args){

          int nums[]= {1,2,3,4,5};

    int[] result = new int[nums.length];
    int pre=1, post=1;
        //ProductOfArray obj = new ProductOfArray();
        Arrays.fill(result, 1);
        for(int i=0; i<nums.length; i++){
            result[i] =pre;
            pre = pre*nums[i];
        }

        for(int i=nums.length-1; i>=0; i--){
            result[i] =result[i]*post;
            post = post*nums[i];
        }

        System.out.println(Arrays.toString(result));
    }

}
