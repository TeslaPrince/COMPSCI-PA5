package PA5;

public class StringHandler {
	public static void selectionSortIgnoreCase(String[] stringArray){
		for(int i = 0; i <= stringArray.length; i++) {
			int min = i;
			for(int j = i + 1; j <= stringArray[i].length(); j++) {
				if(stringArray[j].compareToIgnoreCase(stringArray[min]) < 0) {
					min = j;
				}
			}
			String temp = stringArray[i];
			stringArray[i] = stringArray[min];
			stringArray[min] = temp;
		}
	}
	
	public static void insertionSortIgnoreCase(String[] stringArray){
		for(int i = 0; i < stringArray.length; i++) {
			String k = stringArray[i];
			int j = i - 1;
			while(j >= 0) {
				if(k.compareToIgnoreCase(stringArray[j]) < 0) {
					break;
				}
				stringArray[j + 1] = stringArray[j];
				j--;
			}
			stringArray[j + 1] = k;
		}
	}
	
	public static void removeDuplicatesIgnoreCase(String[] stringArray){
		selectionSortIgnoreCase(stringArray);
		StringBuilder output = new StringBuilder();
		output.append("[" + stringArray[0]);
		for(int i = 1; i <= stringArray.length; i++) {
			if(!stringArray[i].equalsIgnoreCase(stringArray[i-1])){
				output.append("," + stringArray[i]);
			}
		}
	}
}