package cse360assign2;

public class AddingMachine {

	private int total;
	private String receipt=""; //keeps track of history of values
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		receipt="0"; //initial total
	}
	
	public int getTotal () {
		return total; //returns total
	}
	
	public void add (int value) {
		total += value;	//adds value to total
		receipt+= " + " + value;	//adds "+ value" to the history when used add
	}
	
	public void subtract (int value) {	
		total-=value;	//subtracts value to total
		receipt+= " - " + value;	//adds "- value" to the history when used subtract
	}
		
	public String toString () {
		return receipt;	//sends history of every value
	}

	public void clear() {
		receipt="";	//clears history?
		
	}
}
