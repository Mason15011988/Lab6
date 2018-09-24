package human.pants;

public class NikePants implements IPants {
    public NikePants() {
    }

    @Override
    public void upPants() {
        System.out.println("Надевает штаны Nike");
    }

    @Override
    public void downPants() {
        System.out.println("Снимает штаны Nike");
    }
}
