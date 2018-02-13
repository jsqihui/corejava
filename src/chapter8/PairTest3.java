package chapter8;

import chapter5.Employee2;
import chapter5.Manager1;
import chapter8.ArrayAlg.Pair;

public class PairTest3 {

	public static void main(String[] args) {
		Manager1 ceo = new Manager1("Gus Greedy", 800000, 2003, 12, 15);
		Manager1 cfo = new Manager1("Sid Sneaky", 600000, 2003, 12, 15);
		Pair<Manager1> buddies = new Pair<>(ceo, cfo);
		printBuddies(buddies);
		
		ceo.setBonus(1000000);
		cfo.setBonus(500000);
		Manager1[] managers = {ceo, cfo};
		
		Pair<Employee2> result = new Pair<Employee2>();
		minmaxBonus(managers, result);
		System.out.println("first: " + result.getFirst().getName() + ", second: " + result.getSecond().getName());
		
		maxminBonus(managers, result);
		System.out.println("first: " + result.getFirst().getName() + ", second: " + result.getSecond().getName());
	}
	
	public static void printBuddies(Pair<? extends Employee2> p){
		Employee2 first = p.getFirst();
		Employee2 second = p.getSecond();
		System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
	}
	
	public static void minmaxBonus(Manager1[] a, Pair<? super Manager1> result) {
		if(a.length == 0) return;
		Manager1 min = a[0];
		Manager1 max = a[0];
		
		for(int i= 1; i < a.length; i++) {
			if(min.getBonus() < a[i].getBonus()) min = a[i];
			if(max.getBonus() > a[i].getBonus()) max = a[i];
		}
		result.setFirst(min);
		result.setScond(max);
	}
	
	public static void maxminBonus(Manager1[] a, Pair<? super Manager1> result) {
		minmaxBonus(a, result);
		PairAlg.swapHelper(result);
	}
}

class PairAlg{
	public static boolean hasNulls(Pair<?> p) {
		return p.getFirst() == null || p.getSecond() == null;
	}
	
	public static void swap(Pair<?> p) {
		swapHelper(p);
	}
	
	public static <T> void swapHelper(Pair<T> p) {
		T t = p.getFirst();
		p.setFirst(p.getSecond());
		p.setScond(t);
	}
	
}