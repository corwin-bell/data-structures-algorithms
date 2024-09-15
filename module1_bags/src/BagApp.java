public class BagApp {
    public static void main(String[] args) throws Exception {
        Bag newBag = new Bag();
        newBag.add("Apples");
        System.out.println(newBag.contains("Apples"));
        System.out.println(newBag.contains("Oranges"));
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
