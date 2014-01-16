//: Set2.java
// Putting your own type in a Set
package c08.newcollections;

import java.util.*;

class MyType {
	private int i;

	public MyType(int n) {
		i = n;
	}

	public boolean equals(Object o) {
		if ((o != null) && (o instanceof MyType))
			return i == ((MyType) o).i;
		else
			return false;
	}

	// Required for HashSet, not for ArraySet:
	public int hashCode() {
		return i;
	}

	public String toString() {
		return i + " ";
	}
}

public class Set2 {
	public static Set fill(Set a, int size) {
		for (int i = 0; i < size; i++)
			a.add(new MyType(i));
		return a;
	}

	public static Set fill(Set a) {
		return fill(a, 10);
	}

	public static void test(Set a) {
		fill(a);
		fill(a); // Try to add duplicates
		fill(a);
//		a.addAll(fill(new ArraySet()));
		Collection1.print(a);
	}

	public static void main(String[] args) {
		test(new HashSet());
//		test(new ArraySet());
	}
} // /:~