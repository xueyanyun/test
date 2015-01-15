import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.PortUnreachableException;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Map.Entry;

import javax.xml.crypto.Data;


public class Test_bak {	
	
	
//	public static int a = 1;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		BufferedReader in = new BufferedReader(new FileReader("e://000000_0"));
		String line = null;
		try {
			while((line = in.readLine()) != null){
				//String[] fields = line.split("\001");
				String[] fields = line.split("");
				System.out.println(fields[0]);
				System.out.println(fields[1]);
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		
//		Date aDate;
//		System.out.println(aDate);
		
		
//		Test test = new Test();
//		System.out.println(test.a);
//		test.a++;
//		System.out.println(test.a);
//		Test test1 = new Test();
//		System.out.println(test1.a);
//		
//		java.util.Date date,date1;
//		date1 = new java.util.Date();
//		date = date1;
//		
//		System.out.println(date);
//		System.out.println(date1);
		
//		String number = "123b";
//		double num = 0;
//		try {
//			num = Double.parseDouble(number);
//		} catch (NumberFormatException e) {
//			// TODO: handle exception
//			System.out.println(num + " is not a number");
//		}
//	
		
		
//		//int[] a = new int[3];
//		a[0] = 0;
//		a[1] = 1;
//		a[2] = 2;
//		
//		
//		for (int x : a) {
//			System.out.println(x);
//		}
//		
//		
//		System.out.println("x");
//		System.out.println("x");
//		System.out.println("x");
//		System.out.println("x");
//		
//		
//		
//		String[] modeArr= "2:0:0".split(",");			
//		for(String mode: modeArr){
//			String[] split = mode.split(":");
//			if(split.length == 3){
//				int[] record = {Integer.parseInt(split[0]),Integer.parseInt(split[1]),Integer.parseInt(split[2])};
//				orderMode.add(record);
//			}
//		}
//		
//		
//		
//		for(int[] mode : orderMode) {
//			System.out.println("a");
//		}
//		
		
//		String line = "397337318|382058217|38.5%|385548745|37.4%|397469438|36.2%|351248287|34.6%|383247532|24.0%|384437365|20.6%|375931367|14.6%|382273585|10.5%|390553522|7.7%|396248994|6.6%";
//		 HashMap<String, HashSet<String>> orderRecMap = new HashMap<String, HashSet<String>>();
//		
//		String[] fields = line.split("\\|", -1);
//		if(fields.length == 21){
//			String srcBookId = fields[0];						
//			HashSet<String> set = new HashSet<String>();
//			for(int j = 1; j < fields.length ; j = j + 2){
//				set.add(fields[j]);
//			}
//			orderRecMap.put(srcBookId, set);		
//		}
//		
//		Iterator<Entry<String, HashSet<String>>> iterator = orderRecMap.entrySet().iterator();
//		while(iterator.hasNext()){
//			Entry<String, HashSet<String>> next = iterator.next();
//			String key = next.getKey();
//			HashSet<String> value = next.getValue();
//			Iterator<String> iterator2 = value.iterator();
//			while(iterator2.hasNext()){
//				System.out.println(iterator2.next());
//			}
//		
//		}
		
		
//		String teString = "hello  world x";
//		StringTokenizer itr = new StringTokenizer(teString);
//		while(itr.hasMoreTokens()){
//			System.out.println(itr.nextToken());
//		}
		
//		double confidence = 0.1343543543;
//		
//		System.out.println(String.format("%.1f%%", 100 * confidence));
//		Properties properties = new Properties();
//		properties.setProperty(key, value)
//		properties.
//		System.out.println(Boolean.parseBoolean("true"));
//		System.out.println(Boolean.parseBoolean("false"));
//		System.out.println(Boolean.parseBoolean("false1"));
//		System.out.println(Boolean.parseBoolean("1"));
//	 final HashMap<Integer, String> orderMode = new HashMap<Integer, String>();/*2:asc,6:asc*/
//		String orderModeStr = "2:desc,6:asc";
//		String[] modeArr= orderModeStr.split(",");
//		for(String mode: modeArr){
//			String[] split = mode.split(":");
//			if(split.length == 2){
//				orderMode.put(Integer.parseInt(split[0]), split[1]);
//			}
//		}
//		
//		TreeSet<String> set = new TreeSet<String>(new Comparator<String>() {
//
//			public int compare(String o1, String o2) {
//				String[] fields1 ;
//				
//					fields1 = o1.split("\\|",-1);
//				
//				String[] fields2;
//		
//					fields2 = o2.split("\\|",-1);
//				
//				Iterator<Entry<Integer, String>> iter = orderMode.entrySet().iterator();
//				
//				while(iter.hasNext()){	
//					Entry<Integer, String> entry = iter.next();
//					int index = entry.getKey();
//					double orderByField1 = Double.parseDouble(fields1[index]);
//					double orderByField2 = Double.parseDouble(fields2[index]);
//				
//					if( entry.getValue().equalsIgnoreCase("asc")){
//						if(orderByField1 > orderByField2) {
//							return 1;
//						}else if (orderByField1 < orderByField2) {
//							return -1;
//						}						
//					}else {
//						if( orderByField2 > orderByField1 ){
//							return 1;
//						}else if (orderByField2 <orderByField1) {
//							return -1;
//						}						
//					}					
//				}
//				return o1.compareTo(o2);
//			}
//		});
//		
//		set.add("u1|b7|1|c|1|9|6");
//		set.add("u1|b13|1|c|2|3|8");
//		set.add("u1|b8|1|c|1|10|3");
//		set.add("u1|b12|1|c|2|5|5");
//		set.add("u1|b12|0|c|2|5|5");
//		set.add("u1|b12|0|c|2|5|5");
//		set.add("u1|b12|0|c|2|5|4");
//		Iterator<String> iterator = set.iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//		}
		
//		String test = null;
//		System.out.println(test + "a");
//		int[] test = {13,38,27,49,76,65,49,97};	
//		CreateHeap(test, 8);
//		for(int i = 0; i < test.length; ++i){
//			System.out.println(test[i]);
//		}
//		
//		System.out.println("====");
//		
//		heapSort(test,8);
//		for(int i = 0; i < test.length; ++i){
//			System.out.println(test[i]);
//		}
//		
//		int[] outArray = new int[3];
//		
//		
//		for(int i = 0; i  < 3; i++){
//			outArray[i] = test[i];
//			
//		}
//		CreateHeap(outArray, 3);
//		System.out.println("====");
//		
//		for(int i = 0; i < outArray.length; ++i){
//			System.out.println(outArray[i]);
//		}
//		
//		System.out.println("====");
//		
//		for(int i = 3; i < test.length -1; ++i){
//			int x = test[i];
//			if( x > outArray[0]){
//				outArray[0] = x;
//				heapAdjust(outArray, 0 , outArray.length -1);				
//			}
//		}
//		
//		for(int i = 0; i < outArray.length; ++i){
//			System.out.println(outArray[i]);
//		}
//		Properties properties = new Properties();
//		properties.setProperty("hello", "xueyanyun");
//		System.out.println(properties.get("hello"));
//		System.out.println(properties.get("xueyanyun"));
//		
//		HashSet<Double> set = new HashSet<Double>();
//		set.add(0.5);
//		set.add(0.3);
//		set.add(0.4);
//		set.add(0.0);
//		set.add(0.0);
//		set.add(0.0);
//		set.add(0.0);
//		set.add(0.0);
//		set.add(0.0);
//		set.add(0.0);
//		int min = 5;
//		int max = 60;
//		Random rand = new Random();
//		for(int i = 0; i < 100; ++i){
//			int randNum = rand.nextInt(600)+50;
//			System.out.println(randNum/1000.0);
//		}

//		
//		Iterator<Double> iter = set.iterator();
//		Double first = iter.next();
////		int num = (int)(first * 1000);
////		if(first == 0.0 || first > 0.6 || first < 0.05){
////			num =  (rand.nextInt(600-50 +1 )+50);
////			System.out.println(num/1000.0);
////		}
////		for(int i = 1; i < 10; i++){
////			num = rand.nextInt(num -50 ) + 51;
////			System.out.println(num/1000.0);
////		}
//		
//		
//		
////		double num= iter.next();
////		if(first == 0.0 || first > 0.6 || first < 0.05){
////			num =  rand.nextDouble() * 0.3 + 0.3;
////			System.out.println(num);
////			System.out.printf("%.3f\n",num);
////		}
////		for(int i = 1; i < 10; i++){
////			num = rand.nextDouble() * (num - 0.05) + 0.05;
////			System.out.println(num);
////			System.out.printf("%.3f\n",num);
////		}
//		
//		
//		double num= iter.next();
//		if(first == 0.0 || first > 0.6 || first < 0.05){
//			num =  rand.nextDouble() * 0.50 + 0.15;
//			System.out.println(num);
//			System.out.printf("%.3f\n",num);
//		}
//		first = num;
//		double low_range;
//		if(first > 0.45){
//			low_range = 0.5;			
//		}else if(first > 0.3){
//			low_range = 0.65;			
//		}else{
//			low_range = 0.75;
//		}
//		for(int i = 1; i < 10; i++){
//			
//			if(0.5* num > 0.05){
//				num = rand.nextDouble() * (num - low_range * num) + low_range * num;
//			}
//			else {
//				num = rand.nextDouble() * (num - 0.05) + 0.05;
//			}
//			System.out.println(num);
//			System.out.printf("%.3f\n",num);
//		}
		
		
//		while(iter.hasNext()){
//			double item = iter.next();
//			item 
//			
//			
//		}
//		for(int i = 0; i < 10000; ++i){
//			System.out.println(rand.nextDouble());
//		}
//		
		
	
		
		
		

		
		
		
		
	}
	
	
//	public static void CreateHeap(int[] heap,int length){
//		for(int i = length / 2 -1 ; i >= 0; i--){
//			heapAdjust(heap, i, length -1);
//		}
//	}
//	
//	
//	public static void heapAdjust(int[] heap, int s ,int m){
//		int tmp = heap[s];
//		for(int j = 2 * s + 1; j <= m; j = 2 * j + 1){
//			if( j < m   && heap[j] < heap[j+1] ) ++j;
//			if(tmp >= heap[j]) break;
//			heap[s] = heap[j];
//			s = j;		
//		}		
//		heap[s] = tmp;
//	}
//	
//	
//	public static void heapSort(int heap[], int length){
//		CreateHeap(heap, length);
//		for(int i = length -1; i >= 0; --i){
//			int tmp = heap[0];
//			heap[0] = heap[i];
//			heap[i] = tmp;
//			heapAdjust(heap, 0, i -1);
//			
//		}
//	}
	
	
	
	public static void CreateHeap(int[] heap,int length){
		for(int i = length / 2 -1 ; i >= 0; i--){
			heapAdjust(heap, i, length -1);
		}
	}


	public static void heapAdjust(int[] heap, int s ,int m){
		int tmp = heap[s];
		for(int j = 2 * s + 1; j <= m; j = 2 * j + 1){
			if( j < m  && heap[j+1] < heap[j] ) ++j;
			if(tmp <= heap[j]) break;
			heap[s] = heap[j];
			s = j;		
		}		
		heap[s] = tmp;
	}


	public static void heapSort(int heap[], int length){
		CreateHeap(heap, length);
		for(int i = length -1; i >= 0; --i){
			int tmp = heap[0];
			heap[0] = heap[i];
			heap[i] = tmp;
			heapAdjust(heap, 0, i -1);			
		}
	}	
	
}





 class StringDoublePair implements Comparable<StringDoublePair> {
	private String first;
	private double second;
	private String fieldDelimiter = "|";
	
	public StringDoublePair(){
		
	}	
	
	public StringDoublePair(StringDoublePair rhs){
		set(rhs.first, rhs.second, rhs.fieldDelimiter);
	}
	
	
	public StringDoublePair(String first, double second) {
		set(first, second );
	}
	
	public StringDoublePair(String first, double second, String fieldDelimiter) {
		set(first, second, fieldDelimiter);
	}
	
	public void set(String first, double second) { 
		this.first = first;
		this.second = second;	    	
	 }
	  
    public void set(String first, double second, String fieldDelimiter) {    	
    	this.first = first;
    	this.second = second;
    	this.fieldDelimiter = fieldDelimiter;
    }
  
    public String getFirst() {
    	return first;
    }

    public double getSecond() {    	
    	return second;
    }
    
    public String getFieldDelimiter() {
    	return fieldDelimiter;
    }

//    @Override
//    public void write(DataOutput out) throws IOException {
//    	out.writeUTF(first);
//    	out.writeDouble(second);
//    }
//
//    @Override
//    public void readFields(DataInput in) throws IOException {
//    	this.first = in.readUTF();
//    	this.second = in.readDouble();
//    }
//  
    @Override
    public int hashCode() {
    	long temp = Double.doubleToLongBits(second);    	
    	return first.hashCode() + (int) (temp ^ (temp >>> 32));
    }
  
    @Override
    public boolean equals(Object o) {
    	if (o instanceof StringDoublePair) {    	
    		StringDoublePair rhs = (StringDoublePair) o;
    		return first.equals(rhs.first) && second == rhs.second;
    	}
    	return false;
    }  
  
    @Override
    public String toString() {
    	return first + fieldDelimiter + second;
    }  
  
	@Override
	public int compareTo(StringDoublePair o) {	
		if(this.second > o.second){
			return 1;
		}else if(this.second < o.second){
			return -1;
		}else{
			return this.first.compareTo(o.first);
		}
	}
}
	

  
 

