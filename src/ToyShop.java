import java.util.ArrayList;
import java.util.HashMap;

public class ToyShop {
    private HashMap<Integer,Toy> toyList = new HashMap<>();
    private ArrayList<Toy> toys = new ArrayList<>();

    public ToyShop(){

    }

    public void addToy(Toy toy){
        toyList.put(toy.getId(),toy);
        toys.add(toy);
    }

    public Toy getToy(Integer id){
//       return toyList.get(id);
       return toys.get(id);
    }

    public void changeFreguency(Integer id,Integer freguency){
        getToy(id).setFreuency(freguency);
    }
    public void deleteToy(Integer id){
        toyList.remove(id);
    }

    public HashMap<Integer, Toy> getToyList() {
        return toyList;
    }
    public void setToyList(HashMap<Integer,Toy> toyHashMap){
        toyList = toyHashMap;
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public void setToys(ArrayList<Toy> toys) {
        this.toys = toys;
    }
}
