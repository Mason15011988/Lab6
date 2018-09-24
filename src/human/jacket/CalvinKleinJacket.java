package human.jacket;

public class CalvinKleinJacket implements IJacket {
    private String color;

    public CalvinKleinJacket(String color) {
        this.color = color;
    }

    public CalvinKleinJacket() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void upJacket() {
        System.out.println("Надевает куртку CalvinKlein цвет " + color);
    }

    @Override
    public void downJacket() {
        System.out.println("Снимает куртку CalvinKlein ");
    }
}
