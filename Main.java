class Main {
    public static void main (String[] args) {

        //bagian observer pattern
        System.out.println("\n--------------------");
        System.out.println("| OBSERVER PATTERN |");
        System.out.println("--------------------");

        //membuat objek untuk setiap meeting dan observer
        ZoomMeeting meeting1 = new ZoomMeeting();
        Observer lala = new Host(meeting1);
        Observer nana = new Participant(meeting1);

        //menambahkan objek observer ke dalam array list observers
        meeting1.addObserver(lala);
        meeting1.addObserver(nana);

        //memasukkan notifikasi yang akan dikirimkan
        meeting1.setNotifikasi("This meeting is being recorded.");

        //bagian decorator pattern
        System.out.println("---------------------");
        System.out.println("| DECORATOR PATTERN |");
        System.out.println("---------------------");

        //membuat objek untuk setiap meeting dan meeting yang di-decorate
        Meeting rMeeting = new RecurringMeeting();
        Meeting iMeeting = new InstantMeeting();
        Meeting rMeetingCT = new ConnectedTimeDecorator(new RecurringMeeting());
        Meeting iMeetingCT = new ConnectedTimeDecorator(new InstantMeeting());

        //menampilkan pesan keterangan dan memanggilmethod showMeeting untuk semua objek yang telah dibuat
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