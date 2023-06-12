package Lesson_5.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNo, String name);

    void ChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);
}
