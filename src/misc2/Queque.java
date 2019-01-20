package misc2;

public class Queque {

	private int MAX_SIZE = 20;
	private char[] queque;
	private int ctr = -1;
	
	Queque(){
		ctr = 0;
	}
	
	Queque(char c){
		queque[0] = c;
		ctr++;
	}
	
	public char dqueque(){
		if(ctr > -1){
			return queque[ctr--];
		}else{
			return 0;
		}
	}
	
	public void enqueque(char c){
		if(ctr >= MAX_SIZE){
			System.out.println("Queque full");
		}else{
			queque[ctr++] = c;
		}
	}
	
	public boolean isEmpty(){
		if(ctr < 0){
			return true;
		}else{
			return false;
		}
	}
	
}
