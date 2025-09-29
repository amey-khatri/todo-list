package csc207.todo_list;

import java.util.Date;

public class Task {
    public String task;
    public boolean isDone = false;
    public String title;
    public String description;
    public Date dueDate;
    public int priority;

    public void ToggleIsDone() {
        isDone = !this.isDone;
    }
}
