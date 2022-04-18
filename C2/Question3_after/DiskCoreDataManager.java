package Question3_after;

public class DiskCoreDataManager implements Read,Write{
    @Override
    public void Read() {
        System.out.println("reading DiskCoreDataManager");
    }

    @Override
    public void Write() {
        System.out.println("saving into DiskCoreDataManager");
    }
}
