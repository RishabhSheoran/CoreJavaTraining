import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created by rishabhsheoran on 2/1/17.
 */
public class FileAssesment {
    public void method1() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("My name is Rishi. ").append("Iam 22 years old. ");
        String s = sb.toString();
        File f = new File("/Users/rishabhsheoran/dummyFile.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
            pw.println(s);
            pw.println("hi");
            pw.println("Wassup?!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            pw.flush();
            pw.close();
        }


        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        sb.delete(0, sb.length());
        //System.out.println(s);
        while ((s = br.readLine()) != null) {
            sb.append(s);
            sb.append("\n");
        }
        s = sb.toString();
        System.out.println(s);


        File f1 = new File("/Users/rishabhsheoran/dummy2.txt");
        if (!f1.exists()) {
            f1.createNewFile();
        }


        PrintWriter pw1 = null;
        try {
            pw1 = new PrintWriter(f1);
            pw1.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            pw1.flush();
            pw1.close();
        }

    }


    public void method2() throws IOException {
        File f2 = new File("/Users/rishabhsheoran/dummy3.txt");
        String s1="Hi Iam Rishabh!\nyo";
        byte b[]=s1.getBytes();
      //  System.out.println(b.toString());
        if(!f2.exists()){
            f2.createNewFile();
        }
        OutputStream out = new FileOutputStream(f2);
        out.write(b);
        out.flush();
        out.close();
        File f3 = new File("/Users/rishabhsheoran/dummy4.txt");
        if(!f3.exists()){
            f3.createNewFile();
        }
        InputStream in = new FileInputStream(f2);
        byte[] b1=new byte[(int)f2.length()];
        String s;
        int i=0;
        while(i<f2.length()){
            b1[i]=(byte)in.read();
            i++;
        }
        s = new String(b1);
        System.out.println(s);
        OutputStream out1 = new FileOutputStream(f3);
        out1.write(b1);
        out1.flush();
        out1.close();
    }
    public static void main(String[] args) throws IOException {
        FileAssesment fa = new FileAssesment();
        fa.method1();
        fa.method2();
    }


}
