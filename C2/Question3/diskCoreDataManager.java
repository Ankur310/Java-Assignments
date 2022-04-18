package Question3;

public class diskCoreDataManager implements DataManager{
    @Override
    public void read() {
        System.out.println("reading diskCoreDataManager");
    }

    @Override
    public void write() {
        System.out.println("saving diskCoreDataManager");
    }
}
