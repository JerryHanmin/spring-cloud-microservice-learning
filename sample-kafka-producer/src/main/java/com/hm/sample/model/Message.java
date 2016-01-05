package com.hm.sample.model;

import java.io.Serializable;

/**
 * Created by Jerry on 2015/11/6 0006.
 */
public class Message implements Serializable {
    private String name;
    private String content;
    private long created_time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCreated_time() {
        return created_time;
    }

    public void setCreated_time(long created_time) {
        this.created_time = created_time;
    }
}
