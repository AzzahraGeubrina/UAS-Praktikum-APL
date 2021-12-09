public abstract class MeetingDecorator implements Meeting{
    protected Meeting decoratedMeeting;

    public MeetingDecorator(Meeting decoratedMeeting) {
        this.decoratedMeeting = decoratedMeeting;
    }

    //meng-overrride method showMeeting yang akan disesuaikan dengan decoratornya
    @Override
    public void showMeeting() {
        decoratedMeeting.showMeeting();
    }
}
