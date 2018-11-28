class GroovyTut{
	static void main(String[] args){
		def name = "Hsin";
        //this won't give you the variable name
		println('I am ${name}\n')
		//this will render the name variable
		//"{}" is optional
		println("I am ${name}\n")
		
		//multi strin
		def multiString = '''I am 
		a string that goes on and on
		and on.....
		'''
		println(multiString);
		
		//string index
		println("3rd index of name " + name[3]);
		println("s index of name " + name.indexOf('s'));
		//slicing
		println("first 3 of name : " + name[0..2]);
		// or substring
		println(name.substring(0,3));
		
		//compare string using <=> operator
		// returns -1 if right is smaller than left
		// returns 1 if right is greater than left
		// returns 0 if equals
		println("Ant <=> Ant " + ('Ant' <=> 'Ant')) // returns 0

	}
}
