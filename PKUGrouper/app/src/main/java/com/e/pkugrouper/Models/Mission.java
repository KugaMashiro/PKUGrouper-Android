package com.e.pkugrouper.Models;

import java.util.List;


public class Mission implements IMission{
    private int ID;
    private String content;
    private String title;
    private String state;//任务状态，这里应该有一个枚举类型
    private int publisher;//发布者
    private int size;

    private String publishTime;
    private String applicationEndTime;
    private String executionStartTime;
    private String executionEndTime;

    private List<Integer> applicantIDs;
    private List<Integer> memberIDs;
    private List<String> channels;


    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int _ID) {
        ID=_ID;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String _content) {
        content=_content;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String _title) {
        title=_title;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String _state) {
        state=_state;
    }

    @Override
    public int getPublisher() {
        return publisher;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int _size) {
        size=_size;
    }

    @Override
    public String getPublishTime(){return publishTime;}
    @Override
    public String getApplicationEndTime(){ return applicationEndTime;}
    @Override
    public String getExecutionStartTime(){return executionStartTime;}
    @Override
    public String getExecutionEndTime() {return executionEndTime;}

    @Override
    public List<Integer> getApplicantIDs() {
        return applicantIDs;
    }

    @Override
    public List<Integer> getMemberIDs() {
        return memberIDs;
    }

    @Override
    public List<String> getChannels() {
        return channels;
    }




    @Override
    public String toJSON() {
        JSONObject object=new JSONObject();

        object.put("title",title);
        object.put("content",content);
        object.put("publisherID",publisher);
        object.put("memberIDs",memberIDs);
        object.put("applicantIDs",applicantIDs);
        object.put("state",state);
        object.put("publishTime",publishTime);
        object.put("applicationEndTime",applicationEndTime);
        object.put("executionStartTime",executionStartTime);
        object.put("executionEndTime",executionEndTime);
        object.put("tag",channels);

        String objStr=JSON.tpJSONString(object);
        return objStr;
    }

    @Override
    public void loadFromJSON(String JSONString) {
        JSONObject object=JSON.parsePbject(JSONString);

        title=object.getString("title");
        content=object.getString("content");
        publisher=object.getIntValue("publisherID");
        memberIDs=JSON.parseArray(object.getJSONArray("memberIDs").toJSONString(),Integer.class);
        applicantIDs=JSON.parseArray(object.getJSONArray("applicantIDs").toJSONString(),Integer.class);
        state=object.getString("state");
        publishTime=object.getString("publishTime");
        applicationEndTime=object.getString("applicationEndTime");
        executionStartTime=object.getString("executionStartTime");
        executionEndTime=object.getString("executionEndTime");
        channels=JSON.parseArray(object.getJSONArray("tag").toJSONString(),Integer.class);
    }
}
