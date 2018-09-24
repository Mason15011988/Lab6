package human.shoes;

public class AdidasShoes implements IShoes {
    public AdidasShoes() {
    }

    @Override
    public void upShoes() {
        System.out.println("Надевает обувь Adidas ");
    }

    @Override
    public void downShoes() {
        System.out.println("Снимает обувь Adidas ");
    }
}
