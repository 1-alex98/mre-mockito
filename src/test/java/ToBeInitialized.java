public class ToBeInitialized {
    public ToBeMocked toBeMocked;

    public ToBeInitialized(ToBeMocked toBeMocked) {
        this.toBeMocked = null;
    }

    public void setToBeMocked(ToBeMocked toBeMocked) {
        this.toBeMocked = toBeMocked;
    }
}
