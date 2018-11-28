class GroovyTut{
	static void main(String[] args){
	    println("hello world!!!!");

		//define variable
		//groovy allows dynamically defined variable
		def age = "Dog";
		age = 40;
		println("5 + 4 =" + (5 + 4));

		//floater operation
		println("5.2 + 4.4 = " + (5.2.plus(4.4)));
		println("5.2 - 4.4 = " + (5.2.minus(4.4)));
		// does the same thing for floater
		println("5.2 - 4.4 = " + (5.2-(4.4)));
		println("random number " + new Random().nextInt()%100)
	}
}
