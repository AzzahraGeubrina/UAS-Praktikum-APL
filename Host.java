public class Host implements Observer {
    private ZoomMeeting zoomMeeting;

    public Host(ZoomMeeting zoomMeeting) {
        this.zoomMeeting = zoomMeeting;
    }

    @Override
    public void update() {
        System.out.println("Host, there's a new notification : " + zoomMeeting.getNotifikasi());
    }
}