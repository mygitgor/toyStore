public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "toysmal", 5.99);
        Toy toy2 = new Toy(2, "toysimply", 10.99);
        Toy toy3 = new Toy(3, "toyBig", 15.55);

        toyStore.addToy(toy3);
        toyStore.addToy(toy2);
        toyStore.addToy(toy1);

        
        int remove = 2;
        toyStore.removeToy(remove);

        int searcheById = 1;
        System.out.println(toyStore.findToyById(searcheById));
        
        String byName = "toyBig";
        System.out.println(toyStore.findToysByName(byName));

        double byPriceMin = 0.00;
        double byPriceMax = 20.00;
        System.out.println(toyStore.findToysByPrice(byPriceMin,byPriceMax));
        
    }
}
