class Main {
    public static void main (String[] args) {

        System.out.println("\n--------------------");
        System.out.println("| OBSERVER PATTERN |");
        System.out.println("--------------------");

        ZoomMeeting meeting1 = new ZoomMeeting();
        Observer lala = new Host(meeting1);
        Observer nana = new Participant(meeting1);

        meeting1.addObserver(lala);
        meeting1.addObserver(nana);

        meeting1.setNotifikasi("This meeting is being recorded.");

        System.out.println("---------------------");
        System.out.println("| DECORATOR PATTERN |");
        System.out.println("---------------------");

        Meeting rMeeting = new RecurringMeeting();
        Meeting iMeeting = new InstantMeeting();

        Meeting rMeetingCT = new ConnectedTimeDecorator(new RecurringMeeting());
        Meeting iMeetingCT = new ConnectedTimeDecorator(new InstantMeeting());

        System.out.println("Normal Recurring meeting :");
        rMeeting.showMeeting();

        System.out.println("\nNormal Instant meeting :");
        iMeeting.showMeeting();

        System.out.println("\nRecurring meeting with connected time display :");
        rMeetingCT.showMeeting();

        System.out.println("\nInstant meeting with connected time display :");
        iMeetingCT.showMeeting();
    }
}