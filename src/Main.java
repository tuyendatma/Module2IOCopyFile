import java.io.*;
public class Main {
    public static void main(String[] args) {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("TextFile1.txt"));
            outStream = new FileOutputStream(new File("TextFile2.txt"));

            int length;
            byte[] buffer = new byte[500];
            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
