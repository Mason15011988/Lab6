package human.shoes;

public class NikeShoes implements IShoes {
    public NikeShoes() {
    }

    @Override
    public void upShoes() {
        System.out.println("Надевает обувь Nike ");
    }

    @Override
    public void downShoes() {
        System.out.println("Снимает обувь Nike ");
    }
}
