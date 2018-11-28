class GroovyTut{
	static void main(String[] args){
    	def greeting = "goodbye";
        

		//so this is basically the arrow function like js
		def sayGoodbye = {theName -> 
			println("$greeting $theName")
			}

		sayGoodbye("Hsin");
        
		def isEven = {num ->
			return num % 2 == 0
		}

	   println("is 3 an even number? " + isEven(3));

		def randList = [1, 4, 6];
		randList.each {
        	println(it);
		}

		def employees = [
          'Hsin':38,
		  'Jess': 36
		]

		employees.each {
        println("$it.key : $it.value")
		}
        
		//you can also do it this way using each
		//if you use -> you can name the variable, 
		//otherwise you will use 'it'
		def randNums = [3, 6, 7, 9];
		randNums.each {num -> if(num %2 == 0){
           println(num);
		   }  	
		}
	}
}
