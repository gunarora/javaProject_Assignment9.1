//Package Declaration is necessary
package javaProject_Assignment9;

/*Create an application having a Generic HashMap with Empcode as key and EmpName as value.
  Display only EmpNames as output.*/  
 
//importing Hashmap and map
import java.util.HashMap;
import java.util.Map;

public class GenricHashMap {

	//Main method started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashmap - creating object
		Map<Integer, String> map = new HashMap<Integer, String>();

		//key, value
		Integer Empcode   = new Integer(001);
		String  EmpName = "Gunjan";
		//store value in hashmap
		map.put(Empcode, EmpName);

		//accessing value using key
		String outputData = map.get(Empcode);
		//Print output Data
		System.out.println(outputData);

	}

}
