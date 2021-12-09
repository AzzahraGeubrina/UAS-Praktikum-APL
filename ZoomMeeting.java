public class ZoomMeeting extends Observable {

    //method untuk memberitahukan kepada setiap observer bahwa ada notifikasi yang dikirim melalui method update
    public void notif() {
        for (Observer zoomMeeting : observers) {
            zoomMeeting.update();
        }
    }
}