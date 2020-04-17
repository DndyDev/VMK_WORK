package pancakesAndDiners;

public class Main {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeMenu,dinerMenu);

        waitress.printMenu();
    }
}
