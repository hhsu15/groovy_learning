class GroovyTut {
	static void main(String[] args){
		
		def randString = "Random";

		println("A $randString string");
		//or
		printf("A %s string \n", randString);

		//more formating tricks
		// %-10s add padding on the lefthand side
		// %.2f shows 2 decimal point for floater
		// %10s add 10 padding on the right hand side
		printf("%-10s %d %.2f %10s \n",
		['Stuff', 10, 1.345, 'Random']);
	}


}
