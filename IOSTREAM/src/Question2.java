import java.util.*;
import java.io.*;

public class Question2 {
    public static void main(String[] args) {
       
        if (args.length < 2) {
            System.out.println("Usage: java Question2 inputfile.txt outputfile.txt");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        Map<String, Integer> wordCountMap = new TreeMap<>();

       
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", ""); // Remove punctuation
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
            return;
        } catch (IOException e) {
            System.out.println("Error reading input file.");
            return;
        }

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
            System.out.println("✅ Word counts written successfully to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to output file.");
        }
    }
}
