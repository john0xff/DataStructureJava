package com.phoenixjcam.collection.jdk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.Vector;

import com.phoenixjcam.collection.stack.LinkedStack;

public class JDKCollectionExample
{
	public JDKCollectionExample()
	{

	}

	private void collectionExamples()
	{
		// interfaces java.util
		java.util.List<String> list;

		// classes java.util - not synchronized
		// transient Object[] elementData;
		// same as Vector but Vector is synchronized
		java.util.ArrayList<String> arrayList;

		// double ended list - next and prev linked by Nodes as below
		// Node(Node<E> prev, E element, Node<E> next)
		java.util.LinkedList<String> linkedList;

		// element insertion and removal at both ends
		// deque is short for double ended queue
		java.util.Deque<String> deque;

		// FIFO
		// typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner
		java.util.Queue<String> queue;

		// grow able array of objects - synchronized
		// almost the same as the ArrayList difference is the ArrayList isn't synchronized
		// protected Object[] elementData;
		java.util.Vector<String> vector;

		// LIFO - extended Vector - read synchronized structure
		// protected Object[] elementData;
		java.util.Stack<String> stack;

		// AWT collection - a little different VECTOR :) - List in awt based on Vector
		java.awt.List listAWT;

		// This interface takes the place of the Dictionary class
		// An object that maps keys to values.
		java.util.Map<Integer, String> map;
		java.util.HashMap<Integer, String> hashMap;
		java.util.TreeMap<Integer, String> treeMap;
		java.util.LinkedHashMap<Integer, String> linkedHashMap;

		
		// Sets 
		java.util.Set<String> set;
		java.util.TreeSet<String> treeSet;
		java.util.HashSet<String> hashSet;

		// Since:JDK1.0 - synchronized
		// recommended to use HashMap<K, V> or ConcurrentHashMap<K, V>
		java.util.Hashtable<Integer, String> hashtable;

		// Since:JDK1.0 - Abstract class
		// NOTE: This class is obsolete. New implementations should implement the Map interface, rather than extending
		// this class.
		java.util.Dictionary<Integer, String> dictionary;

		// In a priority queue, an element with high priority is served before an element with low priority.
		// just as a list can be implemented with a linked list or an array, a priority queue can be implemented with a
		// heap
		java.util.PriorityQueue<String> priorityQueue;

		Character cha;
		Integer in;
		Double db;
	}

	public static void main(String[] args)
	{
		// arrayListTests();
		// linkedListTests();

		// priorityQueueTest();

		//copyArrayTest();
		
		differentTypeCollectionTest();

	}

	private static void differentTypeCollectionTest()
	{
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add("test");
		ll.add(1);
		ll.add(true);
		ll.add(2.888);
		
		LinkedList<TreeMap<ArrayList<String>, ArrayList<LinkedList<String>>>> monesterTest = new LinkedList<TreeMap<ArrayList<String>,ArrayList<LinkedList<String>>>>();
		
		
		List<Object> al = new ArrayList<Object>();
		al.add("test");
		al.add(1);
		al.add(true);
		al.add(2.888);
		al.add(al);
		al.add(ll);
		
	}

	public static void priorityQueueTest()
	{
		java.util.PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

		for (int j = 0; j < 5; j++)
		{
			priorityQueue.add("test" + j);
		}

		priorityQueue.remove();
	}
	
	

	public static void linkedListTests()
	{
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.addLast("test3");
		linkedList.addLast("test4");
		linkedList.addLast("test5");

		linkedList.addFirst("test2");
		linkedList.addFirst("test1");

		linkedList.addLast("test6");

	}

	public static void arrayListTests()
	{
		// ArrayList<String> arrTest = new ArrayList<String>(20);
		ArrayList<String> arrTest = new ArrayList<String>();

		for (int i = 0; i < 5; i++)
		{
			arrTest.add("test" + i);
		}

		arrTest.remove(1);

		arrTest.add("test" + 6);
	}

	// Test of copyArray method
	public static void copyArrayTest()
	{
		int arrayTest[] =
		{ 0, 1, 2, 3, 4, 5 };

		int arrayTest2[] =
		{ 0, 0, 0, 0, 0, 0 };

		int size = 6;
		int index = 4;
		int length = size - index;

		// native method JNI (should be efficient and fast)
		// make exactly one cell at the index position for adding new element
		System.arraycopy(arrayTest, index, arrayTest2, index, length);

		System.out.print(true);

		// -----------------------------------
		int arr1[] =
		{ 0, 1, 2, 3, 4, 5 };
		int arr2[] =
		{ 0, 0, 0, 0, 0, 0 };

		// copies an array from the specified source array
		System.arraycopy(arr1, 3, arr2, 3, 1);
		// array2 = 0 0 0 3 0 0 
		
		System.out.print("array2 = ");
		System.out.print(arr2[0] + " ");
		System.out.print(arr2[1] + " ");
		System.out.print(arr2[2] + " ");
		System.out.print(arr2[3] + " ");
		System.out.print(arr2[4] + " ");
		System.out.print(arr2[5] + " ");
	}

}
