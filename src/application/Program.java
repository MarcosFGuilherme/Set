package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		System.out.println("HashSet: Mais rapido, mas nao gararante ordenacao.");
		Set<String> hSet = new HashSet<>();
		hSet.add("Notebook");
		hSet.add("TV");
		hSet.add("Tablet");
		
		
		System.out.println(hSet.contains("Notebook"));
		for (String p : hSet) {
			System.out.println(p);
		}
		
		System.out.println();
		
		System.out.println("TreeSet: Pouco mais lento , mas garante a ordencao.");
		Set<String> tSet = new TreeSet<>();
		tSet.add("Tv");
		tSet.add("Notebook");
		tSet.add("Tablet");
		
		
		System.out.println(tSet.contains("Notebook"));
		for (String p : tSet) {
			System.out.println(p);
		}
		
		System.out.println();
		
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
		lSet.removeIf(x -> x.length() >=3);
		for (String p : lSet) {
			System.out.println(p);
		}
		
		lSet.add("Notebook");
		lSet.add("Tablet");
		
		System.out.println();
		System.out.println("Removendo os itens que comecem com [T]  e mostrando novamente.");
		lSet.removeIf(x -> x.charAt(0)== 'T');
		for (String p : lSet) {
			System.out.println(p);
		}
		lSet.add("Tv");
		lSet.add("Tablet");
		
		
	}

}
