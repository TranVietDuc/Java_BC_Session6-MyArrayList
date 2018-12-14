import java.util.Objects;
public class MyListTest {
    public static void main(String[] args) {
        ArrayList myArray = new ArrayList<>();
        myArray.add(0,"hello");
        myArray.add(1, "kiki");
        myArray.add(2, 100);
        myArray.printOut();
        myArray.add(2, "kimochi");
        myArray.printOut();
        myArray.add(0, "haha");
        myArray.printOut();
        System.out.println(myArray.indexOf(100));
        myArray.remove(1);
        myArray.printOut();
        String array[] = {"Chau", "Chao", "bac", "a"};
        myArray = new ArrayList(array);
        myArray.printOut();
        myArray.add(3, "Duc");
        myArray.printOut();
        myArray.remove(2);
        myArray.add(2,"cu");
        myArray.printOut();
        myArray.add(7, "a");
        System.out.println(myArray.contain("Duc"));
        System.out.println(myArray.get(3));
        System.out.println(myArray.indexOf("a"));

    }


}
