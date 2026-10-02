package SOLID.DIP.GOODCode;

public class NotiService {
    private NotiChannel notiChannel;

    NotiService(NotiChannel noti){
        this.notiChannel = noti;
    }

    public void send(String msg){
        notiChannel.send(msg);
    }

}
