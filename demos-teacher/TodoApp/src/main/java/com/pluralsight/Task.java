package com.pluralsight;
import java.time.LocalDate;

public class Task {

    // Instance variable
    // a variable linked to a CLass / Object
    private String title;
    private LocalDate dueDate;
    private boolean complete;
    private boolean reminder;
    private String urgency; // (A list of default values => ENUM)
    private String notificationMessage;

    // String title
    // LocalDate due date
    // boolean complete or incomplete
    // urgency
    // reminder yes or no (boolean)
    // String Notifications message
    //

    public Task(String _title) {
        this.title = _title;
    }

    // Mark the task as completed with this method or not completed.
    public void markCompleted() {
        this.complete = true;
    }

    // Override String method so that a new message displays when using object from task class
    @Override
    public String toString() {
        if (this.complete) {
            return "[✓] " + this.title;
        } else {
            return "[]" + this.title;
        }
    }
}
