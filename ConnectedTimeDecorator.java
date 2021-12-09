public class ConnectedTimeDecorator extends MeetingDecorator{
    public ConnectedTimeDecorator(Meeting decoratedMeeting){
        super(decoratedMeeting);
    }

    //mengoverride method dengan tampilkan decorate-nya
    @Override
    public void showMeeting() {
        decoratedMeeting.showMeeting();
        showTimeConnected(decoratedMeeting);
    }

    //method untuk menampilkan decorate connected time-nya
    private void showTimeConnected(Meeting decoratedMeeting) {
        System.out.println("Connected time for this meeting has been displayed!");
    }
}
