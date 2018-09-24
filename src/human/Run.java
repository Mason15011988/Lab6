package human;

import human.jacket.CalvinKleinJacket;
import human.jacket.GucciJacket;
import human.pants.GuccuPants;
import human.pants.JeansPants;
import human.pants.NikePants;
import human.shoes.AdidasShoes;
import human.shoes.BelwestShoes;
import human.shoes.NikeShoes;
import human.shoes.PumaShoes;

public class Run {
    public static void main(String[] args) {
        CalvinKleinJacket kleinJacket = new CalvinKleinJacket("зеленый");
        GucciJacket gucciJacket = new GucciJacket("синий");
        GucciJacket gucciJacket1 = new GucciJacket();

        NikePants nikePants = new NikePants();
        GuccuPants guccuPants = new GuccuPants();
        JeansPants jeansPants = new JeansPants();

        AdidasShoes adidasShoes = new AdidasShoes();
        BelwestShoes belwestShoes = new BelwestShoes();
        NikeShoes nikeShoes = new NikeShoes();
        PumaShoes pumaShoes = new PumaShoes();

        Human man1 = new Human ("Алексей", gucciJacket,nikePants,nikeShoes);
        gucciJacket1.setColor("белый");
        Human man2 = new Human ("Вася", gucciJacket1,guccuPants,adidasShoes);
        Human woman1 = new Human ("Света", kleinJacket,jeansPants,belwestShoes);

        man1.putOn();
        System.out.println("================================");
        man2.putOn();
        System.out.println("================================");
        woman1.putOn();
        System.out.println("================================");
        man2.takeOff();
        System.out.println("================================");
        man1.takeOff();
        System.out.println("================================");
        woman1.takeOff();

    }
}
