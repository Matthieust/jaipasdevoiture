import java.util.ArrayList;

public class agence {
    String  ville;
    List<voiture> stock =  new ArrayList<>();

    public String getVille(){
        return this.ville;
    }

    public List<voiture> getStock(){
       return this.stock;
    }

    public void addCar(voiture voiture) {
        this.stock.add(voiture);
    }
}
