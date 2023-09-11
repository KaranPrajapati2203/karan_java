import java.util.*;

public class RevArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(0);

        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);
    }
}
