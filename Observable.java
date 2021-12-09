import java.util.ArrayList;

abstract class Observable {
    ArrayList<Observer> observers = new ArrayList<>();
    String notifikasi;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getNotifikasi() {
        return this.notifikasi;
    }

    public void setNotifikasi(String notifikasi) {
        this.notifikasi = notifikasi;
        this.notif();
    }

    public abstract void notif();
}