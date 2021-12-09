import java.util.ArrayList;

abstract class Observable {
    //arraylist untuk mengisi semua observernya
    ArrayList<Observer> observers = new ArrayList<>();
    //menyimpan string notifikasi yang diberikan
    String notifikasi;

    //method untuk menambahkan observer ke dalam array list
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    //method untuk mengeluarkan observer dari dalam array list
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //method untuk mengembalikan notifikasi
    public String getNotifikasi() {
        return this.notifikasi;
    }

    //method untuk mengatur isi notifikasi
    public void setNotifikasi(String notifikasi) {
        this.notifikasi = notifikasi;
        this.notif();
    }

    //method yang dipanggil ketika ada notif
    public abstract void notif();
}