package human.shoes;

public class PumaShoes implements IShoes {
    public PumaShoes() {
    }

    @Override
    public void upShoes() {
        System.out.println("Надевает обувь Puma ");
    }

    @Override
    public void downShoes() {
        System.out.println("Снимает обувь Puma ");
    }
}
