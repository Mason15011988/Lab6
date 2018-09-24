package human.pants;

public class GuccuPants implements IPants {
    public GuccuPants() {
    }

    @Override
    public void upPants() {
        System.out.println("Надевает штаны Guccu");
    }

    @Override
    public void downPants() {
        System.out.println("Снимает штаны Guccu");
    }
}
