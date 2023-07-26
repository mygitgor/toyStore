import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toy> toys;

    public ToyStore(){
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public Toy getRandomToy(){
        if(toys.isEmpty()){
            return null;
        }

        Random random = new Random();
        int index = random.nextInt(toys.size());
        return toys.get(index);
    }

    public void removeToy(int id){
        toys.removeIf(toy -> toy.getId() == id);
    }

    public void loadToysFromFile(String filename){
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))){
            toys = (List<Toy>) inputStream.readObject();

        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveToysToFile(String filename){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))){
            outputStream.writeObject(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
