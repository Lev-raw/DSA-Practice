class Solution {
    public int maxProfit(int[] sums) {
        int minprice= Integer.MAX_VALUE;
        int maxprice=0;
        for(int i =0;i<sums.length;i++){
            minprice= Math.min(minprice,sums[i]);
            maxprice= Math.max(maxprice,sums[i]-minprice);
        }
 return maxprice;
    }
}