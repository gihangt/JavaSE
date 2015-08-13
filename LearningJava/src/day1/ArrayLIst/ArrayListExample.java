package day1.ArrayLIst;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Gihan");
		list.add(22);
		list.add(5.326);
		
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		for(Object a:list){
			System.out.println(a.toString());
		}
		
		

	}

}
