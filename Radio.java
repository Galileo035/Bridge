package Bridge;

public class Radio implements Dispositivo {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override 
    public boolean isEnabled() { return on; }

    @Override 
    public void enable() {
        on = true;
        System.out.println("La radio esta encendida");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("La radio esta apagada");
    }

    @Override
    public int getVolume() { return volume; }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) volume = 100;
        else if (percent < 0) volume = 0;
        else volume = percent;
    }

    @Override
    public int getChannel() { return channel; }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("Radio -> Encendida: " + on + ", Volumen: " + volume + ", Canal: " + channel);
    }
}