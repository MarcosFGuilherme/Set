package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		demoHashSet();

		System.out.println();
		demoTreeSet();

		System.out.println();
		demoLinkedHashSet();

		System.out.println();
		demo2();

		System.out.println();
		product();
		
		System.out.println();
		demoProduct();

	}

	public static void demoHashSet() {
		System.out.println("HashSet: Mais rapido, mas nao gararante ordenacao.");
		Set<String> hSet = new HashSet<>();
		hSet.add("Notebook");
		hSet.add("TV");
		hSet.add("Tablet");

		System.out.println(hSet.contains("Notebook"));
		for (String p : hSet) {
			System.out.println(p);
		}
	}

	public static void demoTreeSet() {
		System.out.println("TreeSet: Pouco mais lento , mas garante a ordencao.");
		Set<String> tSet = new TreeSet<>();
		tSet.add("Tv");
		tSet.add("Notebook");
		tSet.add("Tablet");

		System.out.println(tSet.contains("Notebook"));
		for (String p : tSet) {
			System.out.println(p);
		}
	}

	public static void demoLinkedHashSet() {
		System.out.println("LinkedHashSet: Pouco mais lento , mas mantem a ordencao de insercao.");
		Set<String> lSet = new LinkedHashSet<>();
		lSet.add("Tv");
		lSet.add("Notebook");
		lSet.add("Tablet");

		System.out.println("Tem o item [Nootebook] ? " + lSet.contains("Notebook"));
		System.out.println();
		System.out.println("Mostrando o conteudo do SET.");
		for (String p : lSet) {
			System.out.println(p);
		}
		System.out.println();
		System.out.println("Removendo o [Tablet] e mostrando novamente.");
		lSet.remove("Tablet");
		for (String p : lSet) {
			System.out.println(p);
		}

		lSet.add("Tablet");

		System.out.println();
		System.out.println("Removendo os itens que contem pelo menos 3 letras e mostrando novamente.");
		lSet.removeIf(x -> x.length() >= 3);
		for (String p : lSet) {
			System.out.println(p);
		}

		lSet.add("Notebook");
		lSet.add("Tablet");

		System.out.println();
		System.out.println("Removendo os itens que comecem com [T]  e mostrando novamente.");
		lSet.removeIf(x -> x.charAt(0) == 'T');
		for (String p : lSet) {
			System.out.println(p);
		}
		lSet.add("Tv");
		lSet.add("Tablet");
	}

	public static void demo2() {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		System.out.println("Conjunto [a] :" + a);
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		System.out.println("Conjunto [b] :" + b);
		System.out.println();
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("union :" + c);
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("intersection : " + d);
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("difference : " + e);
	}

	public static void product() {
		Set<Product> set = new HashSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod));
	}

	public static void demoProduct() {
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
		}
	}
}
