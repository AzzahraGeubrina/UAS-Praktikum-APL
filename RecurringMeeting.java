public class RecurringMeeting implements Meeting{
    //meng-overrride method showMeeting yang sesuai dengan tampilan untuk instant meeting
    @Override
    public void showMeeting() {
        System.out.println("This is a recurring meeting.");
    }
}
