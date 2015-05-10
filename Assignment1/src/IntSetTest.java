
public class IntSetTest {

	public static void main(String[] args) {
		//TEST CASE 1 where they are equal but distinct
		IntSet t1 = new IntSet();
		t1.addElement(3);
		t1.addElement(2);
		t1.addElement(1);
		t1.addElement(4);
		t1.addElement(5);
		IntSet t2=new IntSet();
		t2.addElement(2);
		t2.addElement(1);
		t2.addElement(3);
		t2.addElement(5);
		t2.addElement(4);

		System.out.println(t1.subsetOf(t2));
		System.out.println(t1.isEqual(t2));
		System.out.println(t1.union(t2));
		System.out.println(t1.intersection(t2));
		System.out.println(t1.complement(t2));
		System.out.println();
		//TEST CASE 2 where they are different sizes but one is the subset of the other
		t1 = new IntSet();
		t1.addElement(1);
		t1.addElement(2);
		t2=new IntSet();
		t2.addElement(2);
		t2.addElement(1);
		t2.addElement(3);

		System.out.println(t1.subsetOf(t2));
		System.out.println(t1.isEqual(t2));
		System.out.println(t1.union(t2));
		System.out.println(t1.intersection(t2));
		System.out.println(t1.complement(t2));
		System.out.println();
		//TEST CASE 3 where they are different in size but have some common elements
		t1=new IntSet();
		t1.addElement(1);
		t1.addElement(2);
		t1.addElement(3);
		t2=new IntSet();
		t2.addElement(2);
		t2.addElement(4);
		t2.addElement(3);
		t2.addElement(5);

		System.out.println(t1.subsetOf(t2));
		System.out.println(t1.isEqual(t2));
		System.out.println(t1.union(t2));
		System.out.println(t1.intersection(t2));
		System.out.println(t1.complement(t2));
		System.out.println();
		//TEST CASE 4 where they have nothing in common, including size
		t1 = new IntSet();
		t1.addElement(1);
		t1.addElement(2);
		t2=new IntSet();
		t2.addElement(4);
		t2.addElement(5);
		t2.addElement(3);

		System.out.println(t1.subsetOf(t2));
		System.out.println(t1.isEqual(t2));
		System.out.println(t1.union(t2));
		System.out.println(t1.intersection(t2));
		System.out.println(t1.complement(t2));
		System.out.println();
		//TEST CASE 5 where they have nothing in common except for the number of elements they have
		t1 = new IntSet();
		t1.addElement(1);
		t1.addElement(2);
		t1.addElement(6);
		t2=new IntSet();
		t2.addElement(4);
		t2.addElement(5);
		t2.addElement(3);

		System.out.println(t1.subsetOf(t2));
		System.out.println(t1.isEqual(t2));
		System.out.println(t1.union(t2));
		System.out.println(t1.intersection(t2));
		System.out.println(t1.complement(t2));
		System.out.println();
		//TEST CASE 6 where one is an empty set
		t1=new IntSet();
		t2=new IntSet();
		t2.addElement(2);
		t2.addElement(1);
		t2.addElement(3);

		System.out.println(t1.subsetOf(t2));
		System.out.println(t1.isEqual(t2));
		System.out.println(t1.union(t2));
		System.out.println(t1.intersection(t2));
		System.out.println(t1.complement(t2));
		System.out.println();

		//TEST CASE 7 where both are empty sets
		t1=new IntSet();
		t2=new IntSet();

		System.out.println(t1.subsetOf(t2));
		System.out.println(t1.isEqual(t2));
		System.out.println(t1.union(t2));
		System.out.println(t1.intersection(t2));
		System.out.println(t1.complement(t2));
		System.out.println();
		// Testing the add/remove methods
		t2.addElement(2);
		t2.addElement(3);
		t2.addElement(1);
		t2.addElement(3);
		t2.addElement(1);
		t2.addElement(2);
		System.out.println(t2);
		t2.remove(3);
		t2.remove(2);
		System.out.println(t2);
	}

}
