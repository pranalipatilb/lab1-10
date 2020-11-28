package com.capgemini.lab6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//import com.cg.training.service.Employee;

public class Lab61 {

	public static void main(String[] args) {
		Map<Integer,Integer> Sample=new HashMap();
		Sample.put(1, 20);
		Sample.put(2, 03);
		Sample.put(4, 99);
		Sample.put(3, 45);
		List <Integer>Values=getValues(Sample);
		Iterator<Integer> iterator=Values.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	private static List getValues(Map<Integer, Integer> sample) {
		// TODO Auto-generated method stub
		//convert hashmap into list
		List<Entry<Integer,Integer>> list=new LinkedList<Entry<Integer,Integer>>(sample.entrySet());
		//sort using Comparator interface
		Collections.sort(list,
				new Comparator<Entry<Integer,Integer>>()
				{
			
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
				}
				);
		return list;
	}

}
