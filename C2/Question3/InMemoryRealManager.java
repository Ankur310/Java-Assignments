package Question3;

public class InMemoryRealManager implements DataManager{
    @Override
    public void read() {
        System.out.println("reading InMemoryRealManager");
    }

    @Override
    public void write() {
        System.out.println("fatalErrorr");
    }
}
