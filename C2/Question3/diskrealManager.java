package Question3;

public class diskrealManager implements DataManager{
    @Override
    public void read() {
        System.out.println("reading diskrealManager");
    }

    @Override
    public void write() {
        System.out.println("saving into diskrealManager");
    }
}
