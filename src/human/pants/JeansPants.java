package human.pants;

public class JeansPants implements IPants {
    public JeansPants() {
    }

    @Override
    public void upPants() {
        System.out.println("Надевает штаны Jeans");
    }

    @Override
    public void downPants() {
        System.out.println("Снимает штаны Jeans");
    }
}
