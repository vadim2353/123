import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class StringUtils {
    StringBuffer sb = new StringBuffer("строка тут была бы если это возможно");
    static String s1 = "строка тут была бы если это возможно";

    public void del() {
        int q = sb.indexOf("о");
        int w = sb.indexOf("б") + 1;
        System.out.print(sb.delete(q, w));
    }

    public void replacement() {
        char a = 0;
        char b = 0;
        char[] chArray = s1.toCharArray();
        a = chArray[0];
        b = chArray[3];
        chArray[3] = a;
        chArray[0] = b;
        System.out.print(chArray);
    }

    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("One1.txt");
        Scanner in = new Scanner(new File("C:\\Users\\вадим\\Desktop\\Work9\\One.txt"));
        String s;
        while (in.hasNext()) {
            s = in.next();
            if (isPalindrome(s)) {
                fr.write(" " + s);
            }
        }
        fr.close();
    }

    private static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}