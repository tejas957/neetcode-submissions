class MinStack {
	private Stack<Integer> main;
	private Stack<Integer> mins;

    public MinStack() {
    //make a second stac kthat keeps a track of min till now

	main = new Stack<>();
	mins = new Stack<>();

    }
    
    public void push(int val) {
		main.push(val);
		if(mins.isEmpty()){
			mins.push(val);
		}
		else{
			mins.push(Math.min(mins.peek(), val));
		}
       
    }
    
    public void pop() {
		main.pop();
		mins.pop();

        
    }
    
    public int top() {
		return main.peek();
        
    }
    
    public int getMin() {
        
		return mins.peek();
    }
}
