class Solution {
    public boolean isValid(String s) {
        Stack<Character> par = new Stack<>();
		Map<Character, Character> close = new HashMap<>();
		close.put(')', '(');
		close.put('}', '{');
		close.put(']', '[');

		for(int i = 0; i < s.length(); i++){
			char curr = s.charAt(i);
			if(close.containsKey(curr)){
				if(!par.isEmpty() && par.peek() == close.get(curr)){
					par.pop();
				}
				else{
					return false;
				}
			} else {
				par.push(curr);
			}
		}

			return par.isEmpty();
		

	}

    
}
