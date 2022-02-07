public class Main {
    public static void main(String[] args) {
        Toy toy = new Toy();

        Runnable playing = toy::play;
        Runnable reacting = toy::react;

        Thread cat = new Thread(null, reacting,"Кот");
        Thread player = new Thread(null, playing,"PLayer");
        cat.setDaemon(true);
        player.start();
        cat.start();
    }
}
