package com.e.pkugrouper.Models;

public interface IEvaluation extends ISerializable{
    int getEvaluatorID();
    int getEvaluateeID();
    int getMissionID();
    double getScore();
    void setEvaluationID(int _evaluationID);
    void setEvaluateeID(int _evaluateeID);
    void setMissionID(int _missionID);
    void setScore(double _score);
    String getTimeStamp();
    void setTimeStamp(Stirng _timeStamp);
}
