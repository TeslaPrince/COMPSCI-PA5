package PA5; 

import java.io.*;

public class FileHandler{
    public static final String[] readStringsFromFile(String filename) throws IOException{
        FileReader reader = new FileReader(filename);
        BufferedReader buffr = new BufferedReader(reader);
        String array_length = buffr.readLine();
        int x = Integer.parseInt(array_length);
        String[] arrayOfStrings = new String[x];
        for(int i = 0; i != x-1; i++) {
            String var = buffr.readLine();
            arrayOfStrings[i] = var;
        }
        buffr.close();
        return arrayOfStrings;
    }
    
    public static final void writeArrayOfStringsToFile(final String[] arrayOfStrings ,String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        BufferedWriter buffw = new BufferedWriter(writer);
        buffw.write(arrayOfStrings.length);
        for (int i = 0; i != arrayOfStrings.length; i++) {
            buffw.newLine();
            buffw.write(arrayOfStrings[i]);
        }
     buffw.close();
    }
    
    public static final String[] readArrayOfStringsFromFile(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        BufferedReader buffr = new BufferedReader(reader);
        String line = buffr.readLine();
        line.replaceAll("[] ", "");
        String[] arrayOfStrings = line.split(",");
        buffr.close();
        return arrayOfStrings;
    }
    
    public static final void writeStringToFile(String text, String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        BufferedWriter buffw = new BufferedWriter(writer);
        buffw.write(text);
        buffw.close();
    }
}