class GroovyTut{
	static void main(String[] args){
    // you can use the traditional for loop
	// but this is the better one
		def randList = [1, 3, 4, 6];
		for(i in randList){
        	println(i);
	    }	
		
		//for map
		def custs = [
		   100: "Paul",
		   120: "Hsin",
		   130: "Jess"
		]
		for (item in custs){
        	println("$item.value : $item.key");
		}

	}

}
