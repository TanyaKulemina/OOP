package Lesson_5;

import Lesson_5.models.*;
import Lesson_5.presenters.*;
import Lesson_5.views.*;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен заработать!
     * 
     * @param args
     */
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 103, "Станислав");
        bookingView.ChangeReservationTable(9001, new Date(), 105, "Иван");
    }
}