package com.nasir;

/**
 * Created by nasir on 5/3/17.
 */
public class TaskObject {

    private boolean isSent;
    private String data;

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
