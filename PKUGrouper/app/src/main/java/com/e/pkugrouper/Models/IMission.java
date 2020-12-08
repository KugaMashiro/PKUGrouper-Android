package com.e.pkugrouper.Models;

import java.util.List;

public interface IMission extends ISerializable{
    int getID();
    void setID(int _ID);
    String getContent();
    void setContent(String _content);
    String getTitle();
    void setTitle(String _title);

    String getState();
    void setState(String _state);

    int getPublisher();

    int getSize();
    void setSize(int _size);

    public String getPublishTime();
    public String getApplicationEndTime();
    public String getExecutionStartTime();
    public String getExecutionEndTime();

    List<Integer> getApplicantIDs();
    List<Integer> getMemberIDs();
    List<String> getchannels();

}
