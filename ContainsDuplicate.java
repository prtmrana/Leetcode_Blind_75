import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr=new int []{1,2,3};
        System.out.println("is array contain duplicate ---> "+containsDuplicate(arr));
    }

     public static boolean containsDuplicate(int[] nums) {
        //**************bruteforce approach ************

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]) return true;
        //     }
        // }

        //************optimal approach */
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            
            set.add(nums[i]);
        }
        return false;
    }
}
