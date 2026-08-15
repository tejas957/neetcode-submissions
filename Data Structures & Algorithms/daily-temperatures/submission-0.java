class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //make a stack with temp and index
        //if number is less or equal to top of stack add
        //if greater keep popping until its equal or greater
        //make popped index equal to curr

        Stack<int[]> consTemps = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            int curr = temperatures[i];
            while (!consTemps.isEmpty() && consTemps.peek()[0] < curr) {
                int[] recent = consTemps.pop();
                result[recent[1]] = i - recent[1];
            }
            consTemps.push(new int[]{curr, i});
        }
        return result;
        
    }
}
