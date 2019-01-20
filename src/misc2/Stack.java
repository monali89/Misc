package misc2;

public class Stack {

	private int MAX_SIZE = 20;
	private int ctr = -1;
	private char[] stack;
	
	Stack(char c){
		this.stack = new char[MAX_SIZE];
	}
	
	Stack(){
		
	}
	
	public char pop(){
		if(ctr<0){
			return 0;
		}else{
			return stack[ctr--];
		}
	}
	
	public void push(char c){
		if(ctr == MAX_SIZE){
			System.out.println("STACK Overflow");
		}else{
			stack[ctr++] = c;
		}
	}
	
	public char peek(){
		if(ctr < 0){
			return stack[ctr];
		}else{
			return 0;
		}
	}
	
}
