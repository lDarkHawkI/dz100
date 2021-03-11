package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }


    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {3, 10, 9, 2, 11, 4, 8, 1, 7, 5, 6};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }
}

