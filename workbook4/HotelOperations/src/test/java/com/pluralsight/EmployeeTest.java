package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void PunchIn_PunchOut_Hours_Calculated_Correctly() {
        //arrange
        Employee employee = new Employee();

        //act
        employee.punchIn(0);
        employee.punchOut(8);

        //assert
        assertEquals(8, employee.getHoursWorked());
    }

}