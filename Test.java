package PA5;

import java.io.IOException;

public class Test {
	
	private static final void testSelectionSorting() throws IOException { // complete this method
		String[] stringArray = FileHandler.readStringsFromFile("src/PA5/Strings.txt");
		StringHandler.selectionSortIgnoreCase(stringArray);
		FileHandler.writeArrayOfStringsToFile(stringArray, "src/PA5/SelectionSort.txt");
	}

	private static final void testInsertionSorting() throws IOException { // complete this method
		String[] stringArray = FileHandler.readStringsFromFile("src/PA5/Strings.txt");
		StringHandler.insertionSortIgnoreCase(stringArray);
		FileHandler.writeArrayOfStringsToFile(stringArray, "src/PA5/InsertionSort.txt");
	}
	
	private static final void testRemoveDuplicates() throws IOException { // complete this method
		String[] stringArray = FileHandler.readArrayOfStringsFromFile("src/PA5/ArrayOfStrings.txt");
		StringHandler.removeDuplicatesIgnoreCase(stringArray);
		FileHandler.writeStringToFile(stringArray.toString(), "src/PA5/DuplicatesRemoved.txt");
	}

	public static void main(String[] args) throws IOException {
		//testSelectionSorting();
		//testInsertionSorting();
		testRemoveDuplicates();
	}
}