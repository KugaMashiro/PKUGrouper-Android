package com.e.pkugrouper.Models;

import java.util.List;

public interface IUser extends ISerializable{

    String getUserName();
    void setUserName(_userName);
    String getMailBox();
    void setMailBox(String _mailBox);
    int getUserID();
    void setUserID(int _userID);
    String getContactInformation();
    void setContactInformation(String _contactInformation);
    double getAverageScore();
    void setAverageScore(double _averageScore);

    List<Integer> getMessageIDs();
    List<Integer> getEvaluationIDs();
    List<Integer> getMissionIDs()
    List<String> getTags();

}
