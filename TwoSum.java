

public class TwoSum {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the size of the array: ");

        int [] nums=new int[]{1, 2, 3, 4, 5
        };

        int target=3;
        int[] result = twoSum(nums, target);

        for (int i : result) {
            System.out.println(i);
        }
       
    }

    public static int[] twoSum(int [] nums,int target){
         //brute force
         int [] returnArray=new int[2];
         for(int i=0;i<nums.length;i++){
             for(int  j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) {
                    returnArray[0]=i;
                    returnArray[1]=j;
                }
             }

         }

           return returnArray;
    }
}
