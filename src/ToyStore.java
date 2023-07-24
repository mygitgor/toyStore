import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;

    public ToyStore(){
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public void removeToy(int id){
        toys.removeIf(toy -> toy.getId() == id);
    }

    public Toy findToyById(int id){
        for(Toy toy : toys){
            if(toy.getId() == id){return toy;}
        }return null;
    }

    public List<Toy> getToys(){
        return toys;
    }

    public List<Toy> findToysByName(String name){
        List<Toy> suitabletoys = new ArrayList<>();
        for(Toy toy : toys){
            if(toy.getName().equalsIgnoreCase(name)){
                suitabletoys.add(toy);
            }
        }return suitabletoys;
    }

    public List<Toy> findToysByPrice(double minPrice, double maxPrice){
        List<Toy> suitabletoys = new ArrayList<>();
        for(Toy toy : toys){
            if(toy.getPrice() >= minPrice && toy.getPrice() <= maxPrice){
                suitabletoys.add(toy);
            }
        }return suitabletoys;
    }

    public Toy getRandomLotoreyToy(){
        double randomValue = Math.random();
        double simulWeight = 0;
        for(Toy toy : toys){
            simulWeight += toy.getWeight();
            if(randomValue <= simulWeight){return toy;}
        }return null;
    }
}
