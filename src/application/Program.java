package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		System.out.println("HashSet: Mais rapido, mas nao gararante ordenacao.");
		Set<String> hSet = new HashSet<>();
		hSet.add("TV");
		hSet.add("Tablet");
		hSet.add("Notebook");
		
		System.out.println(hSet.contains("Notebook"));
		for (String p : hSet) {
			System.out.println(p);
		}
		
		System.out.println();
		
		System.out.println("TreeSet: Pouco mais lento , mas garante a ordencao.");
		Set<String> tSet = new TreeSet<>();
		tSet.add("Tv");
		tSet.add("Tablet");
		tSet.add("Notebook");
		
		System.out.println(tSet.contains("Notebook"));
		for (String p : tSet) {
			System.out.println(p);
		}
	}

}
