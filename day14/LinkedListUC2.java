package com.assignments.day14;

import java.util.LinkedList;
public class LinkedListUC2 {

	public static void main(String[] args) {
		LinkedList<Integer> lists = new LinkedList<>();
        lists.add(56);
        lists.add(30);
        lists.add(70);
        System.out.println(lists);
        LinkedList<Integer> lists1 = new LinkedList<>();
        lists1.add(70);
        lists1.addFirst(30);
        lists1.addFirst(56);
        System.out.println(lists1);
    
	}

}