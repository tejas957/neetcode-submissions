class Solution {
    public int longestConsecutive(int[] nums) {
        //first add the array to a set
        //set currstreak and longest
        //then check if the current number - 1 exists
        // if no then its a first val therefore keep checking until the end

        Set<Integer> vals = new HashSet<>();
        for(int i : nums){
            vals.add(i);
        }


        int curr;
        int longest = 0;

        for(int i : nums){
            if(!vals.contains(i-1)){
                int currstreak = 1;
                while(vals.contains(i+currstreak)){
                    currstreak++;
                }
                if (currstreak > longest){
                    longest = currstreak;
                }
            }
        } 
        return longest;
    }
}
