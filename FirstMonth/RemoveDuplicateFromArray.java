package FirstMonth;

import java.util.HashSet;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
      HashSet<Integer> n = new HashSet<>();
      int size=0;
      int[] num = {1,2,3,3,4,5,6,7,8,8,9};
      for(int i=0; i<num.length; i++){
        if(!n.contains(num[i])){
          n.add(num[i]);
          num[size]=num[i];
          size++;
        }
      }
      System.out.println(size);
    }
    
}
