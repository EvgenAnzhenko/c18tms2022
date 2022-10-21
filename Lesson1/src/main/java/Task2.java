import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int a=0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> l = new ArrayList<>();

        while (true)
        {
            String s = r.readLine();
            if (s.isEmpty()) break;
            l.add(Integer.parseInt(s));
        }

        for (int i=0; i<l.size(); i++)
        {
            if (l.get(i) > 0) a++;
        }

        System.out.println("количество положительных чисел = "+a);

    }
}
