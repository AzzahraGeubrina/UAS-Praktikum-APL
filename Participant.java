public class Participant implements Observer {
    private ZoomMeeting zoomMeeting;

    public Participant(ZoomMeeting zoomMeeting) {
        this.zoomMeeting = zoomMeeting;
    }

    //meng-overrride method update dengan notifikasi yang sesuai untuk participant
    @Override
    public void update() {
        System.out.println("Participant, there's a new notification : " + zoomMeeting.getNotifikasi());
    }
}