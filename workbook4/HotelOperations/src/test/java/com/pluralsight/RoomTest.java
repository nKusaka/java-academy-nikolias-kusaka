package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void checkIn_OccupiedIs_True_and_DirtyIs_True() {
        //arrange
        Room room1 = new Room();
        boolean isOccupied = true;

        //act
        room1.checkIn();

        //assert
        assertEquals(isOccupied, room1.isOccupied());
        assertTrue(room1.isDirty());
        assertFalse(room1.isAvailable());
    }

    @Test
    void checkOut_OccupiedIs_False_DirtyIs_False_and_AvailableIs_True() {
        //arrange
        Room room = new Room();

        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }

    @Test
    void cleanRoom_DirtyIs_False() {
        //arrange
        Room room = new Room();

        //act
        room.cleanroom();

        //assert
        assertFalse(room.isDirty());
    }

}