public class BagApp {
    public static void main(String[] args) throws Exception {
        Bag newBag = new Bag();
        newBag.add("Apples");
        newBag.add("Oranges");
        System.out.println(newBag.toString());
        newBag.add("Apples");
        System.out.println(newBag.toString());
        newBag.remove("Apples");
        System.out.println(newBag.toString());
        newBag.remove("Apples");
        System.out.println(newBag.toString());
        newBag.remove("Apples");
        System.out.println(newBag.toString());
    }
}
