package human.jacket;

public class GucciJacket implements IJacket {
    private String color;

    public GucciJacket(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public GucciJacket() {
    }

    @Override
    public void upJacket() {
        System.out.println("Надевает куртку Gucci цвет "  + color );

    }

    @Override
    public void downJacket() {
        System.out.println("Снимает куртку Gucci");

    }
}
