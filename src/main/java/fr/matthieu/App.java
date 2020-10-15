package fr.matthieu;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        voiture car1 = new voiture("Ferrari", "jaune");
        System.out.println(car1.getCouleur());;
    }
}
