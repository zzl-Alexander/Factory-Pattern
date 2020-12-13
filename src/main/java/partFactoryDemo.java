public class partFactoryDemo {

    public static void main(String[] args) {
        partFactory partfactory = new partFactory();
        Part_prodection part1=partfactory.getPart("CPU");
        part1.prodection();
    }
}
