public class ConnectedTimeDecorator extends MeetingDecorator{
    public ConnectedTimeDecorator(Meeting decoratedMeeting){
        super(decoratedMeeting);
    }

    @Override
    public void showMeeting() {
        decoratedMeeting.showMeeting();
        showTimeConnected(decoratedMeeting);
    }

    private void showTimeConnected(Meeting decoratedMeeting) {
        System.out.println("Connected time for this meeting has been displayed!");
    }
}
