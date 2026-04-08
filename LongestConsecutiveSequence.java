import java.util.Arrays;


public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums=new int[]{100,4,200,1,3,2};
        System.out.println("longest consecutive seq is --> "+longestConsecutive(nums));
    }
     public static int longestConsecutive(int[] nums) {
        if(nums.length<1) return 1;
        Arrays.sort(nums);

        int count=1;
        int max=1;
        System.out.println(Arrays.toString(nums));
       for(int j=1;j<nums.length;j++){
           if(nums[j]==nums[j-1]){
            continue;
           }else if(nums[j]==nums[j - 1] + 1){
            count++;

           }else{
            count=1;
           }

           max=Math.max(max, count);
       }
        return max;
    }
}
