public class Participant implements Observer {
    private ZoomMeeting zoomMeeting;

    public Participant(ZoomMeeting zoomMeeting) {
        this.zoomMeeting = zoomMeeting;
    }

    @Override
    public void update() {
        System.out.println("Participant, there's a new notification : " + zoomMeeting.getNotifikasi());
    }
}