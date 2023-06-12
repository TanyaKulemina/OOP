package Lesson_5.presenters;

import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, Model tableModel) {
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);
    }

    public void showTables() {
        bookingView.updateTablesView(tableModel.loadTables());
    }

    private void showReservationTableResult(int tableNo, int reservationNo) {
        bookingView.updateReservationTableResult(tableNo, reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo, name);
        showReservationTableResult(tableNo, reservationNo);
    }

    @Override
    public void ChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        int NewReservationNo = tableModel.ChangeReservationTable(oldReservation, orderDate, tableNo, name);
        newUpdateReservation();
        showReservationTableResult(tableNo, NewReservationNo);
    }

    private void newUpdateReservation() {
        bookingView.newUpdateReservation();
    }
}
