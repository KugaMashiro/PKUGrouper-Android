package com.e.pkugrouper.Models;

import java.util.List;

public class User implements IUser{
    private String mailBox;
    private String userName;
    private int userID;
    private String password;
    private String contactInformation;
    private double averageScore;


    private List<Integer> missionIDs;
    private List<Integer> messageIDs;
    private List<Integer> violationIDs;//这个暂时不知道是什么
    private List<Integer> evaluationIDs;

    @Override
    public String getUserName() {
        //返回用户名
        return userName;
    }

    @Override
    public void setUserName(String _userName) {
        //修改用户名
        userName=_userName
    }

    @Override
    public String getMailBox() {
        //返回邮箱
        return mailBox;
    }

    @Override
    public void setMailBox(String _mailBox) {
        //设置邮箱
        mailBox=_mailBox
    }

    @Override
    public int getUserID() {
        //返回userID
        return userID;
    }

    @Override
    public void setUserID(int _userID) {
        //设置userID
        userID=_userID
    }

    @Override
    public String getContactInformation() {
        //返回联系方式
        return contactInformation;
    }

    @Override
    public void setContactInformation(String _contactInformation) {
        //设置联系方式
        contactInformation=_contactInformation;
    }

    @Override
    public List<Integer> getMessageIDs() {
        //返回User的Message的ID,类型为integer的List
        return messageIDs;
    }

    @Override
    public List<Integer> getEvaluationIDs() {
        //返回User的评价的ID，类型为integer的List
        return evaluationIDs;
    }

    @Override
    public List<Integer> getViolationIDs() {
        //返回User的violation，类型为integer的List
        //violationIDs不知道是什么
        return  violationIDs;
    }

    @Override
    public List<Integer> getMissionIDs() {
        //返回User相关的任务的ID,类型为integer的List
        return missionIDs;
    }

    @Override
    public double getAverageScore(){
        //返回平均评分
        return averageScore;
    }

    @Override
    public void setAverageScore(_averageScore){
        //修改平均分
        averageScore=_averageScore;
    }



    @Override
    public String toJSON() {
        JSONObject object=new JSONObject();

        object.put("mailbox",mailBox);
        object.put("missionIDs",missionIDs);
        object.put("evaluationIDs",evaluationIDs);
        object.put("violationIDs",violationIDs);
        object.put("averageScore",averageScore);


        String objStr=JSON.tpJSONString(object);
        return objStr;
    }

    @Override
    public void loadFromJSON(String JSONString) {
        JSONObject object=JSON.parsePbject(JSONString);

        mailbox=object.getString("mailbox");
        missionIDs=JSON.parseArray(object.getJSONArray("missionIDs").toJSONString(),Integer.class);
        evaluationIDs=JSON.parseArray(object.getJSONArray("evaluationIDs").toJSONString(),Integer.class);
        violationIDs=JSON.parseArray(object.getJSONArray("violationIDs").toJSONString(),Integer.class);
        averageScore=object.getDoubleValue("averageScore");
    }
}
