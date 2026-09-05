package FirstMonth;

public class MergeSortedArray {
    public static void main(String[] args){
        int []nums1 ={1,2,3,0,0,0};
        int [] nums2 ={5,6,7};
        int n=3, m=3, i=nums1.length-1;
       while(m-1>=0){
        if(n-1>=0 && nums1[n-1]>nums2[m-1]){
            nums1[i--]=nums1[(n--)-1];
        }
        else{
            nums1[i--]= nums2[(m--)-1];
        }
       } 
       System.out.println(java.util.Arrays.toString(nums1));
    }
    
}
