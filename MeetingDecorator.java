public abstract class MeetingDecorator implements Meeting{
    protected Meeting decoratedMeeting;

    public MeetingDecorator(Meeting decoratedMeeting) {
        this.decoratedMeeting = decoratedMeeting;
    }

    @Override
    public void showMeeting() {
        decoratedMeeting.showMeeting();
    }
}
