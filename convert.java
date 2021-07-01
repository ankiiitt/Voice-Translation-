package com.company;
import java.util.Scanner;
import java.util.HashMap;
public class convert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<String,Integer> hmap =new HashMap<>();
		hmap.put("zero",0);
		hmap.put("one",1);
		hmap.put("two",2);
		hmap.put("three",3);
		hmap.put("four",4);
		hmap.put("five",5);
		hmap.put("six",6);
		hmap.put("seven",7);
		hmap.put("eight",8);
		hmap.put("nine",9);
		hmap.put("zero",10);
		String ch[] = str.split(" ");
		String initial="";
		if(ch.length>2) {
			str = str.replaceAll("\\s", "");
			System.out.println(str);
			return;
		}
		if(ch[1].equals("dollar")) {
			initial+='$';
		}
		if(hmap.containsKey(ch[0])) {
			initial+=String.valueOf(hmap.get(ch[0]));
		}
		System.out.println(initial);
	}

}
