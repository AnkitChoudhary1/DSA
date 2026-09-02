package FirstMonth;

public class RemoveElement {
    public static void main(String[] args){
        int []nums ={1,2,3,4,5,6,7,84,3,45,52,332};
        int n = 5;
        int index=0;
        for(int i: nums){
            if(i!=n){
                nums[index++]=i;
            }
        }
        System.out.println(index);
        
    }
    
}
