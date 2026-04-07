

public class MissingNumber {
    public static void main(String[] args) {
        int []  nums = new int[]{3,0,1};
        
        System.out.println("missing number is --> "+missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<nums.length;i++){
            actualSum+=nums[i];
        }
        return sum-actualSum;
    }
}
