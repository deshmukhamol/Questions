package org.twister.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class CollectionsQuestions {
	
	static ArrayList<Integer> a = new ArrayList<Integer>();
	static ArrayList<Integer> b = new ArrayList<Integer>();
	
	static{
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
	}
	
	
	public static void main(String[] args){
		System.out.println(CollectionUtils.intersection(a, b));
		System.out.println(CollectionUtils.disjunction(a, b));
		System.out.println(CollectionUtils.union(a, b));
		}

}
