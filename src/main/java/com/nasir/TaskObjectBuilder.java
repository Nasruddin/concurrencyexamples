package com.nasir;

/**
 * Created by nasir on 5/3/17.
 */
public class TaskObjectBuilder {

    private TaskObject taskObject;

    public TaskObjectBuilder() {
    }

    public TaskObjectBuilder(TaskObject taskObject) {
        this.taskObject = taskObject;
    }


    public TaskObjectBuilder isSent(boolean isSent) {
        taskObject.setSent(isSent);
        return this;
    }

    public TaskObjectBuilder data(String data) {
        taskObject.setData(data);
        return this;
    }

    public TaskObject build() {
        return taskObject;
    }
}
