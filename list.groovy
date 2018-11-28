class GroovyTut{
	static void main(String[] args){
		
		def primes = [2, 3, 5, 7, 11];

		println("Third item in prime " + primes[2]);
		// you can also do this
		println("Third item in prime " + primes.get(2));

		//get length 
		println('length of list is' + primes.size());

		//add item
		primes.add(17);
		println(primes);

		// you can do this too
		primes<<19;
		println(primes);

		primes<<29;
		// the + operator is not changing the list
		println(primes+[31, 37]);

		//short hand
		def oneToTen = 1..10;
		println(oneToTen[2]);
	
		
	}
}
