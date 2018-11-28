class GroovyTut{
	static void main(String[] args){
		
		def paulMap = [
		'name': 'Paul',
		'age': 35,
		'address': 'abc',
		'list':[1,2,3]
		];

		println(paulMap.get('age'));
		println(paulMap['list'][1]);
		println(paulMap['name']);
		
		//other operations..
		paulMap.put('city', 'taipei');
		paulMap.containsKey('city');
		paulMap.size();
	}

}
