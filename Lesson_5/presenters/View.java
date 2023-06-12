package Lesson_5.presenters;

import Lesson_5.models.*;

import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int tableNo, int reservationNo);

    void newUpdateReservation();

}
