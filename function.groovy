class GroovyTut{
	static void main(String[] args){
		sayHello();
        println(getSum(10, 20));
		def myList = [1, 3, 5]
		println(doubleList(myList));

		def nums = sumAll(2, 5, 6, 8);
		println(nums);
	}
    
	static def sayHello(){
		println("Hello");
	}
   
    static def getSum(num1=0, num2=0){
		return num1 + num2
	}

	static def doubleList(list){
	    // this is sorta like the list comprehension
		// essentially creates a new list
		// has to be 'it'
    	def newList = list.collect {it * 2};
		return newList
    }

	//... means unknow number of args, same as * in python
	static def sumAll(int... num){
    	def sum = 0;
		num.each { sum += it; }
		return sum
	}
	
}
