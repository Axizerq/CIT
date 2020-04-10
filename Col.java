public class Col {
 
	public static void main(String[] args) {
		
		Map();
		Tree();
		List();
		Set();
	}

	
	public static void Map() {
		
		Map iMap = new HashMap();
		iMap.put("Russia", "1");
		iMap.put("Ukraine", "2");
		iMap.put("France", "3");
		iMap.put("Spain", "4");
		iMap.put("Swiden", "5");
		iMap.put("Norway", "6");
		iMap.put("Spain", "4");
		System.out.println("The largest countries in Europe (HashMap)");
		System.out.println("\t" + iMap);
	
		iMap.remove("Norway");
		System.out.println("\t" + iMap);
		
		iMap.put("Germany", "7");
		System.out.println("\t" + iMap);
	}

	
	public static void Tree() {
		TreeSet iTree = new TreeSet();
		iTree.add("Black Ash");
		iTree.add("Basswood");
		iTree.add("Paper Birch");
		iTree.add("Red Pine");
		System.out.println();
		System.out.println("Few types of trees");
		System.out.println("\t" + iTree);
	}
	

	public static void List() {
		List iList = new ArrayList<>();
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
	}
	

	public static void Set() {
		Set iSet = new LinkedHashSet();
		iSet.add("Denver Broncose");
		iSet.add("Baltimore Ravens");
		iSet.add("New England Patriots");
		iSet.add("Philadelphia Eagles");
		iSet.add("San Diego Chargers");
		System.out.println();
		System.out.println("NFL teams");
		System.out.println("\t" + iSet);
		
		System.out.println("Removed San Diego Chargers");
		iSet.remove("Goblet of Fire");
		System.out.println("\t" + iSet);
		
		System.out.println("Added Los Angeles Chargers");
		iSet.add("Los Angeles Chargers");
		System.out.println("\t" + iSet);
		
		// Sets do not accept duplicate items:
                iSet.add("Baltimore Ravens");
                iSet.add("Philadelphia Eagles");
                System.out.println("You can't add the same value to the list" + iSet);
		
		Iterator iterator = iSet.iterator();
		while(iterator.hasNext()) {
			String iString = (String) iterator.next();
			System.out.println(iString);
		}
	}
}
