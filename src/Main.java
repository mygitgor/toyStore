public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "toysmal", 5.99, 200.0);
        Toy toy2 = new Toy(2, "toysimply", 10.99, 320.0);
        Toy toy3 = new Toy(3, "toyBig", 15.55, 450.0);

        toyStore.addToy(toy3);
        toyStore.addToy(toy2);
        toyStore.addToy(toy1);
        toyStore.addToy(new Toy(4, "robot", 60, 200));
        toyStore.addToy(new Toy(5, "robotbig", 70, 250));
        toyStore.saveToysToFile("toys.data");

        int remove = 2;
        toyStore.removeToy(remove);

        int searcheById = 1;
        System.out.println(toyStore.findToyById(searcheById));
        
        String byName = "toyBig";
        System.out.println(toyStore.findToysByName(byName));

        double byPriceMin = 0.00;
        double byPriceMax = 20.00;
        System.out.println(toyStore.findToysByPrice(byPriceMin,byPriceMax));
        System.out.println("-------------------------------");
        
        System.out.println(toyStore.getRandomToy());

    }
}
