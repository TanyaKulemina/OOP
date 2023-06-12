package Lesson_5.presenters;

import Lesson_5.models.*;

import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Получение списка всех столиков
     * 
     * @return
     */
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * 
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     * @return Номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    int ChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);

}
