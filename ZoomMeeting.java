public class ZoomMeeting extends Observable {

    public void notif() {
        for (Observer zoomMeeting : observers) {
            zoomMeeting.update();
        }
    }
}