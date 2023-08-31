package secondWeek;

public class sistemaSmartTv {
    boolean on = false;
    boolean off = true;
    int channels = 1;
    int volume = 20;

    public void changeChannel (int newChannel){
        channels = newChannel;
    }
    public void upChannel (){
        channels++;
    }
    public void lowerChannel (){
        channels--;
    }
    public void turnUpVolume (){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void lowerVolume (){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        off = false;
    }
}
