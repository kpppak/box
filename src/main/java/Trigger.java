public class Trigger {
    Toy toy;
    private boolean trigger;

    public Trigger(Toy toy) {
        this.toy = toy;
    }

    public boolean getTrigger() {
        return trigger;
    }

    public void setTrigger(boolean trigger) {
        this.trigger = trigger;
    }
}
