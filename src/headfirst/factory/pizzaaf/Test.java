package headfirst.factory.pizzaaf;
import java.awt.print.Printable;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;

import redis.clients.jedis.Jedis;


public class Test {

	/**
	 * @param args
	 */


	public static void main(String[] args) {
//		System.out.println("hello");
//		for(DataList dataList : DataList.values()){
//			System.out.println(dataList);
//			System.out.println(dataList.ordinal() + "-->" + dataList.name() + "(" + dataList.getName() + ")");
//		}
		
//		byte a = 0;
//		for(int i = 0 ;  i < 1000 ; i++){
//			System.out.println(a++);
//		}
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);

//		
//		System.out.println("test");
//		
//		JSONArray result = new JSONArray();
//
//		System.out.println(result.toString());
		Jedis jedis = new Jedis("10.1.70.4", 6379);
		System.out.println(jedis);
		String valueString = jedis.get("name");
		System.out.println(valueString);
		valueString = jedis.get("age");//null
		System.out.println(valueString);
		//redis> hset myhash field1 Hello
		valueString = jedis.hget("myhash", "field1");
		System.out.println(valueString);
		valueString = jedis.hget("myhash", "field2");
		System.out.println(valueString);//null
		valueString = jedis.hget("myhash2", "field1");
		System.out.println(valueString);//null
		
		Map<String, String> hgetAll = jedis.hgetAll("myhash");
		System.out.println(hgetAll);
		
		 hgetAll = jedis.hgetAll("myhash1");
		 System.out.println(hgetAll);//{}
		 System.out.println(hgetAll.isEmpty());
		 
		 
		 Set<String> smembers = jedis.smembers("myset");
		 System.out.println(smembers);//[]
		 System.out.println(hgetAll.isEmpty());
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
//

	}

}

class Cat{
	public void print() {
		System.out.println(getClass().getSimpleName());
	}
}
