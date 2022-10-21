import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(Integer.parseInt(s));
        }
        reader.close();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                sum++;
            }
        }

        System.out.println("количество положительных чисел = " + sum);

    }
}
