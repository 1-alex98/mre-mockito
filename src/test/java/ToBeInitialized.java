public class ToBeInitialized {
    private ToBeMocked toBeMocked;
    public boolean initializedByConstructor;

    public ToBeInitialized(ToBeMocked toBeMocked) {
        this.toBeMocked = toBeMocked;
        initializedByConstructor = true;
    }

    public void setToBeMocked(ToBeMocked toBeMocked) {
        this.toBeMocked = toBeMocked;
    }
}
