package secondWeek;

public class User {

    public static void main (String[] args) throws Exception{

        sistemaSmartTv smartTv = new sistemaSmartTv();

        smartTv.lowerVolume();
        smartTv.lowerVolume();
        smartTv.lowerVolume();
        smartTv.turnUpVolume();

        System.out.println("O Canal em que você está é: " + smartTv.channels);

        smartTv.changeChannel(22);

        System.out.println("O canal em que você está agora é: " + smartTv.channels);


        System.out.println("O volume está em: " + smartTv.volume) ;

        System.out.println("A televisão está ligada? " + smartTv.on);
        System.out.println("Em qual canal a sua televisão está? " + smartTv.channels);
        System.out.println("Em qual volume está a sua televisão ?" + smartTv.volume);


        smartTv.turnOn();
        System.out.println("Agora a televisão está ligada? " + smartTv.on);

        smartTv.turnOff();
        System.out.println("Agora a televisão está desligada? " + smartTv.off);
    }
}
