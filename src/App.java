import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));
        Scanner wordScan = new Scanner(System.in);
        System.out.println("What word do you want to test for? (-1 to exit)");
        String word = wordScan.nextLine();
        String line = null;
        while(!word.equals("-1")){
        line = input.readLine();
        int count = 0;
        while(!line.equals(null)){
            if(line.contains(word)){
                count++;
                line = input.readLine();
            }else{
                line = input.readLine();
            }
        }
        String outWrite = word + " " + count;
        output.write(outWrite);
        output.newLine();
        System.out.println("What word do you want to test for? (-1 to exit)");
        word = wordScan.nextLine();
    }
        
        wordScan.close();
        input.close();
        output.close();
    }
}
