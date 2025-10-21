package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void checkIn_OccupiedIs_True_and_DirtyIs_True() {
        //arrange
        Room room1 = new Room();
        boolean isOccupied = true;
        boolean isDirty = true;
        boolean isAvailable = false;

        //act
        room1.checkIn();

        //assert
        assertEquals(isOccupied, room1.isOccupied());
        assertTrue(room1.isDirty());
        assertFalse(room1.isAvailable());
    }

}