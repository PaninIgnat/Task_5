import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_5 {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите число:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num = reader.readLine();
        int x = Integer.parseInt(num);

        System.out.println(x + "*1=" + x*1);
        System.out.println(x + "*2=" + x*2);
        System.out.println(x + "*3=" + x*3);
        System.out.println(x + "*4=" + x*4);
        System.out.println(x + "*5=" + x*5);
        System.out.println(x + "*6=" + x*6);
        System.out.println(x + "*7=" + x*7);
        System.out.println(x + "*8=" + x*8);
        System.out.println(x + "*9=" + x*9);
        System.out.println(x + "*10=" + x*10);

    }
}