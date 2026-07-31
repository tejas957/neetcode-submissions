class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int most = 0;
        while (l < r){
            int curr = Math.min(heights[l], heights[r]) * (r-l);
            most = Math.max(curr, most);
            if(heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return most;
    }
     
}
