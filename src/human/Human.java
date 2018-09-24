package human;

import human.jacket.CalvinKleinJacket;
import human.jacket.GucciJacket;
import human.jacket.IJacket;
import human.pants.GuccuPants;
import human.pants.IPants;
import human.pants.JeansPants;
import human.pants.NikePants;
import human.shoes.*;

public class Human implements IHuman {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Human(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putOn() {
        System.out.println(name);
        jacket.upJacket();
        pants.upPants();
        shoes.upShoes();
        System.out.println(name + " одет(а)");
    }

    @Override
    public void takeOff() {
        System.out.println(name);
        jacket.downJacket();
        pants.downPants();
        shoes.downShoes();
        System.out.println(name + " раздет(а)");
    }

    public static class Run {
        public static void main(String[] args) {

            CalvinKleinJacket calvinKleinJacket = new CalvinKleinJacket();
            GucciJacket gucciJacket  = new GucciJacket();

            NikePants nikePants = new NikePants();
            GuccuPants guccuPants = new GuccuPants();
            JeansPants jeansPants = new JeansPants();

            AdidasShoes adidasShoes = new AdidasShoes();
            BelwestShoes belwestShoes = new BelwestShoes();
            NikeShoes nikeShoes = new NikeShoes();
            PumaShoes pumaShoes = new PumaShoes();

        }
    }
}
