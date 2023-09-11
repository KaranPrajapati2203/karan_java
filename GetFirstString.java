import java.util.ArrayList;

public class GetFirstString {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Hello");
        al.add("How");
        al.add("are");
        al.add("you?");

        System.out.println(al);
        First(al);
    }

    public static void First(ArrayList<String> s) {
        if (s.isEmpty()) {
            System.out.println("\"\"");
        } else {
            String str = s.get(0);
            System.out.println(str);
        }
    }
}
