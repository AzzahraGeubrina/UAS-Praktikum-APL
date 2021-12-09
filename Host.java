public class Host implements Observer {
    private ZoomMeeting zoomMeeting;

    public Host(ZoomMeeting zoomMeeting) {
        this.zoomMeeting = zoomMeeting;
    }

    //meng-overrride method update dengan notifikasi yang sesuai untuk host
    @Override
    public void update() {
        System.out.println("Host, there's a new notification : " + zoomMeeting.getNotifikasi());
    }
}