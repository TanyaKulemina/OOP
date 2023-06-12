package Lesson_5.views;

import Lesson_5.models.*;
import Lesson_5.presenters.*;
import Lesson_5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void updateTablesView(Collection<Table> tables) {
    }

    @Override
    public void updateReservationTableResult(int tableNo, int reservationNo) {
        System.out.printf("Столик %d успешно забронирован. Номер вашей брони: #%d\n\n", tableNo, reservationNo);
    }

    public void newUpdateReservation() {
        System.out.print("Бронь была изменена. ");
    }

    public void reservationTableEvent(Date reservationDate, int tableNo, String name) {
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    public void ChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        observer.ChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}