/**
 * Name:	John Sanchez
 * ID: 1212846256
 * Assignment Number: 2
 * Description:	AddingMachine takes user input and adds every input together while
 * 	keeping track on every input and inserting the history in a String.
 */
package cse360assign2;

public class AddingMachine {

	private int total;	//holds the total 
	private String receipt = ""; //keeps track of history of values
	
	/**
	 *  This method calls the addingmachine constructor
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		receipt = "0"; //initial total
	}
	
	/**
	 * getTotal returns the total after the inputs are calculated
	 */
	public int getTotal () {
		return total; //returns total
	}
	
	/**
	 * add adds the value onto the total while also keeping track of the inserted value
	 * by putting it in a string
	 */
	public void add (int value) {
		total += value;	//adds value to total
		receipt += " + " + value;	//adds "+ value" to the history when used add
	}
	
	/**
	 * subtract subtracts the value from the total while also keeping track of the inserted value
	 * by putting it in a string
	 */
	public void subtract (int value) {	
		total -= value;	//subtracts value to total
		receipt += " - " + value;	//adds "- value" to the history when used subtract
	}
		
	/**
	 * returns the string of the history of calculations
	 */
	public String toString () {
		return receipt;	//sends history of every value
	}

	/**
	 *  clears history as well as the total
	 */
	public void clear() {
		receipt = "0";	//clears history
		total = 0;	//returns the total to 0
		
	}
}
