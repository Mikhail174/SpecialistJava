package workfileio;

import java.io.*;

public class WorkFileIO {
    public static void main(String[] args) {

        writeHelloToFile("hello.txt");
        try {
            String str = readFromFile("string.txt");
            System.out.println(str);
        } catch (IOException e) {
            e.getMessage();
        }

    }


        private static String readFromFile(String stringtxt) throws IOException {

            //FileReader reader = new FileReader(stringtxt);
            //reader.read(); умеет читать посимвольно, поэтому используем BufferedReader


            //если сразу в норм кодировке, то :
            BufferedReader reader = new BufferedReader(new FileReader(stringtxt));
            //если в unicode, то надо читать, как бинарник:
            //BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(stringtxt),"utf8"));

            String str = reader.readLine();
            return str;
       }


        private static void writeHelloToFile (String hellotxt) {

            try (FileWriter writer = new FileWriter(hellotxt)) {
                writer.write("Привет из Java!");

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }


