package Bridge;

public class ControlRemotoAvanzado extends ControlRemoto {
    public ControlRemotoAvanzado(Dispositivo dispositivo) { super(dispositivo); }
   
    @Override
    public void togglePower() {
        System.out.println("Control Avanzado: Power inteligente");
        if (dispositivo.isEnabled()) dispositivo.disable();
        else dispositivo.enable();
    }

    @Override
    public void volumeDown() {
         System.out.println("Control Avanzado: Bajar volumen");
        dispositivo.setVolume(dispositivo.getVolume() - 10);
    }

    @Override
    public void volumeUp(){
        System.out.println("Control Avanzado: Subir volumen");
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Control Avanzado: Canal anterior");
        dispositivo.setChannel(dispositivo.getChannel() - 1);
    }

     @Override
    public void channelUp() {
        System.out.println("Control Avanzado: Canal siguiente");
        dispositivo.setChannel(dispositivo.getChannel() + 1);
    }
    // ... Implementa los métodos básicos ...
    public void mute() { dispositivo.setVolume(0); } // Funcionalidad extra

    public void record() {
        System.out.println("Control avanzado: Grabando programa");
     }

}