class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> vals = new Stack<>();
		for(int i = 0; i < tokens.length; i++){
			if(tokens[i].equals("+")){
				int first = vals.pop();
				int second = vals.pop();
				vals.push(first + second);
			} else if(tokens[i].equals("-")){
				int first = vals.pop();
				int second = vals.pop();
				vals.push(second - first);
			} else if(tokens[i].equals("*")){
				int first = vals.pop();
				int second = vals.pop();
				vals.push(first * second);
			} else if(tokens[i].equals("/")){
				int first = vals.pop();
				int second = vals.pop();
				vals.push(second / first );
			} else{
				vals.push(Integer.parseInt(tokens[i]));
			}
		}
		return vals.peek();	
  
    }
}
