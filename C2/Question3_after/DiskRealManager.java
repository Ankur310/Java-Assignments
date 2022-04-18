package Question3_after;

public class DiskRealManager implements Read,Write{
    @Override
    public void Read() {
        System.out.println("reading diskrealManager");
    }

    @Override
    public void Write() {
        System.out.println("saving into diskrealManager");
    }
}
