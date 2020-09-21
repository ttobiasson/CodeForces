import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class Test1 {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        String[] s;

        StringCache stringCache = new StringCache();

        while ((line = in.readLine()) != null) {
            s = line.split("\\|");

            if (s[0].equals("Add"))
                System.out.println(stringCache.add(s[1]));
            else if (s[0].equals("Get"))
                System.out.println(stringCache.get(s[1]));
            else if (s[0].equals("Has"))
                System.out.println(stringCache.has(s[1]));
            else if (s[0].equals("Remove"))
                System.out.println(stringCache.remove(s[1]));
            else if (s[0].equals("Reset"))
                System.out.println(stringCache.reset());
            else
                System.out.println("Unsupported operation");

        }
    }
    static class StringCache{
        private HashSet<String> hashSet = new HashSet<String>();



        public String add(String line) {

            if(hashSet.add(line))
                return "True";
            return "False";

        }


        public String get(String line) {

            if(hashSet.contains(line))
                return line;
            return "NULL";

        }


        public String has(String line) {
            if(hashSet.contains(line))
                return "True";
            else
                return "False";
        }


        public String remove(String line) {
            if(hashSet.remove(line))
                return "True";
            else
                return "False";

        }


        public int reset(){
            int size = hashSet.size();
            hashSet = new HashSet<String>();
            return size;
        }

    }
}