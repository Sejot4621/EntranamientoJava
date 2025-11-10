package javacolletion;

import java.util.*;

public class ColeccionesJava 
{

	public static void main(String[] args) 
	{
		//-------------LIST-------------------
		System.out.println("==============LIST============");
		
		//Lista dinámica basada en array
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Uno");
		arrayList.add("Dos");
		arrayList.add("Tres");
		arrayList.remove("Tres");
		arrayList.set(1, "Cuatro");
		
		System.out.println("ArrayList: " + arrayList);
		
		//LinkedList: lista doblemente enlazada
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Uno");
		linkedList.add("Dos");
		linkedList.add("Tres");
		linkedList.remove(1);
		linkedList.remove("Uno");
		
		System.out.println("LinkedList: " + linkedList);
		
		
		//-------------SET-------------------
		System.out.println("==============SET============");
		
		//No mantiene el orden, no permite duplicados, calcula su hashcode, usa ese hascode para determinar en que casilla coloca el elemento
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Manzana");
		hashSet.add("Banano");
		hashSet.add("Pera");
		hashSet.add("Nuez");
		hashSet.add("Manzana");
		
		System.out.println("HashSet: " + hashSet);
		
		
		//TreeSet: mantiene orden natural, arbol binario balanceado, ordena según un comparador
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("Manzana");
		treeSet.add("Mango");
		treeSet.add("Fresa");
		treeSet.add("Naranja");
		treeSet.add("Manzana");
		treeSet.add("Aguacate");
		treeSet.remove("Aguacate");
		
		System.out.println("TreeSet: " + treeSet);
		
		//Mantiene orden de inserción, lista doblemente enlazada
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("Manzana");
		linkedHashSet.add("Banano");
		linkedHashSet.add("Naranja");
		linkedHashSet.add("Limón");
		
		
		System.out.println("LinkedHashSet: " + linkedHashSet);
		
		
		
		//-------------QUEUE-------------------
		System.out.println("==============QUEUE============");
		
		//Orden natural , ordena por elemento mínimo por defecto
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.add(30);
		priorityQueue.add(28);
		priorityQueue.add(1);
		priorityQueue.add(2);
		priorityQueue.add(8);
		priorityQueue.add(7);
		
		System.out.println("PriorityQueue: " + priorityQueue);
		
		
		//
		Deque<String> arrayDeque = new ArrayDeque<>();
		
		arrayDeque.add("Frente");
		arrayDeque.addLast("Final");
		arrayDeque.addFirst("Inicio");
		
		System.out.println("ArrayDeque: " + arrayDeque);
		
		
		//-------------MAP-------------------
		System.out.println("==============MAP============");
		
		//Sin orden garantizado
		Map<Integer, String> hasMap = new HashMap<>();
		
		hasMap.put(3, "Tres");
		hasMap.put(1, "Uno");
		hasMap.put(2, "Dos");
		
		
		System.out.println("HashMap: " + hasMap);
		
		//TreeMap: orden por clave
		Map<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(3, "Tres");
		treeMap.put(1, "Uno");
		treeMap.put(4, "Cuatro");
		treeMap.put(2, "Dos");
		treeMap.put(6, "Seis");
		
		
		System.out.println("TreeMap: " + treeMap);
		
		
		
		//LinkedHashMap: mantiene orden de inserción
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
				
		linkedHashMap.put(3, "Tres");
		linkedHashMap.put(1, "Uno");
		linkedHashMap.put(4, "Cuatro");
		linkedHashMap.put(2, "Dos");
		linkedHashMap.put(6, "Seis");
				
				
		System.out.println("LinkedHashMap: " + linkedHashMap);
		
		
		

	}

}
