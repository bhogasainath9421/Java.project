import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class WordCount 
{
    public static void main(String[] args)
       {
        String filePath = "example.txt"; // Enter your text file name

        try
	   {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int wordCount = 0;
            int characterCount = 0;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                characterCount += line.length();

                // Split the line into words based on whitespace
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            reader.close();

            System.out.println("Word Count: " + wordCount);
            System.out.println("Character Count: " + characterCount);
            System.out.println("Line Count: " + lineCount);
           } 
           catch (IOException e) 
           {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
           }
    }
}
