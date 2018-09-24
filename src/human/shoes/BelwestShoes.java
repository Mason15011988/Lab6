package human.shoes;

public class BelwestShoes implements IShoes {
    public BelwestShoes() {
    }

    @Override
    public void upShoes() {
        System.out.println("Надевает обувь Belwest ");
    }

    @Override
    public void downShoes() {
        System.out.println("Снимает обувь Belwest ");
    }
}
