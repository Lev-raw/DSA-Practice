class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
              int element =nums[0];
              int count =1;
               for(int i =1 ; i< n ; i++){
                        if(count ==0){
                           element = nums[i];
                           count =1 ;
                        }
                        else if(element==nums[i]){
                            count++;
                        }
                        else
                        count--;
                       
               }
               int actualcount =0;
                for(int x:nums){
                            if(x==element) actualcount++;
                }
                if(actualcount>n/2) return element;
                return -1;


                        
        
    }
}