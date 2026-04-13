/*
49. group anagrams
*/
import java.util.*;
public class GroupAnagrams{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array of String");
		String []strs = new String[5];
		
		for(int i =0; i<strs.length; i++){
			strs[i] = sc.next();
		}
		System.out.println(groupAnagrams(strs));
	}
	
	public static List<List<String>> groupAnagrams(String[] strs){
		HashMap<String, ArrayList<String>> map = new HashMap<>();// creating hashmap
		
		for(String str : strs){
			char ch[] = str.toCharArray();
			Arrays.sort(ch);
			String sorted = Arrays.toString(ch);
			
			if(!map.containsKey(sorted)){
				map.put(sorted, new ArrayList<String>());
			}
			map.get(sorted).add(str);
		}
		
		List<List<String>> list = new ArrayList<>();
		for(String key : map.keySet()){
			List<String> innerList = new ArrayList<>();
			innerList.addAll(map.get(key));
			list.add(innerList);
		}
		return list;
	}
}