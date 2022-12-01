public class VarArgs {

    public static void main(String[] args) {
        print("one", "two");
        System.out.println();
        print();
        System.out.println();
        String[] strings = {"one", "two", "three"};
        print(strings);
    }

    static void print(String... phrases) {

        for (String s : phrases) {
            System.out.println(s);
        }
    }
}
