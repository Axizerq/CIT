import java.util.*;

public class Col {

	public static void main(String[] args) {


		Map<Integer, String> iMap = new HashMap<Integer, String>();
		iMap.put(1, "Russia");
		iMap.put(2, "Ukraine");
		iMap.put(3, "France");
		iMap.put(4, "Spain");
		iMap.put(5, "Swiden");
		iMap.put(6, "Norway");
		System.out.println("The largest countries in Europe");
		System.out.println("\t" + iMap);

		iMap.remove(6, "Norway");
		System.out.println("\t" + iMap);

		iMap.put(6, "Germany");
		System.out.println("\t" + iMap);

		Collection<String> values = iMap.values();


		TreeSet<String> iTree = new TreeSet<String>();
		iTree.add("Black Ash");
		iTree.add("Basswood");
		iTree.add("Paper Birch");
		iTree.add("Red Pine");
		System.out.println();
		System.out.println("Few types of trees");
		System.out.println("\t" + iTree);

		System.out.printf("TreeSet contains %d elements \n", iTree.size());



		List iList = new ArrayList();
		iList.add("Andromeda");
		iList.add("Black Eye Galaxy");
		iList.add("Bode's Galaxy");
		iList.add("Cartwheel Galaxy");
		iList.add("Cigar Galaxy");
		iList.add("Solar System");
		System.out.println();
		System.out.println("There is a few galaxies names:");
		System.out.println("\t" + iList);

		iList.remove("Solar System");
		System.out.println("Remove the Solar System - it's not a galaxy!");
		System.out.println("\t" + iList);

		iList.add("Milky Way");
		System.out.println("Added the Milky Way - that's correct.");
		System.out.println("\t" + iList);

		Iterator iterator = iList.iterator();
		while(iterator.hasNext()) {
			String iString = (String) iterator.next();
			System.out.println(iString);
		}


		HashSet<String> iSet = new HashSet<>();
		iSet.add("Denver Broncos");
		iSet.add("Baltimore Ravens");
		iSet.add("New England Patriots");
		iSet.add("Philadelphia Eagles");
		iSet.add("San Diego Chargers");
		System.out.println();
		System.out.println("NFL teams");
		System.out.println("\t" + iSet);

		System.out.println("Removed San Diego Chargers");
		iSet.remove("San Diego Chargers");
		System.out.println("\t" + iSet);

		System.out.println("Added Los Angeles Chargers");
		iSet.add("Los Angeles Chargers");
		System.out.println("\t" + iSet);

		// Sets do not accept duplicate items:
		iSet.add("Baltimore Ravens");
		iSet.add("Philadelphia Eagles");
		System.out.println("You can't add the same value to the list " + iSet);



		PriorityQueue<Integer> iQueue = new PriorityQueue<Integer>();

		iQueue.add(1);
		iQueue.add(2);
		iQueue.add(3);

		for(int i: iQueue) {
			System.out.println(i);
		}
		System.out.println();

		iQueue.remove(2);
		System.out.println("After removing:");
		for(int i: iQueue) {
			System.out.println(i);
		}
		System.out.println();

		System.out.println("After being added to the queue:");
		iQueue.offer(4);
		for(int i: iQueue) {
			System.out.println(i);
		}
	}

}
