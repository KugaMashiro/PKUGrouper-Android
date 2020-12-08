package com.e.pkugrouper.Models;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;

public class Evaluation implements IEvaluation{
    private int evaluationID;
    private int evaluateeID;
    private int missionID;
    private int evaluatorID;
    private double score;
    private String timeStamp;

    @Override
    public int getEvaluatorID() {
        return evaluatorID;
    }

    @Override
    public int getEvaluateeID() {
        return evaluateeID;
    }

    @Override
    public int getMissionID() {
        return missionID;
    }

    @Override
    public double getScore() {
        return score;
    }

    @Override
    public void setEvaluationID(int _evaluationID) {
        evaluationID=_evaluationID;
    }

    @Override
    public void setEvaluateeID(int _evaluateeID) {
        evaluateeID=_evaluateeID;
    }

    @Override
    public void setMissionID(int _missionID) {
        missionID=_missionID;
    }

    @Override
    public void setScore(double _score) {
        score=_score;
    }

    @Override
    public String getTimeStamp(){return timeStamp;}

    @Override
    public void setTimeStamp(Stirng _timeStamp){ timeStamp=_timeStamp;}


    @Override
    public String toJSON() {
        JSONObject object=new JSONObject();

        object.put("timeStamp",timeStamp);
        object.put("evaluaterID",evaluatorID);
        object.put("missionID",missionID);
        object.put("evaluationScore",score);

        String objStr=JSON.tpJSONString(object);
        return objStr;
    }

    @Override
    public void loadFromJSON(String JSONString) {
        JSONObject object=JSON.parsePbject(JSONString);

        timeStamp=object.getString("timeStamp");
        evaluatorID=object.getIntValue("evaluatorID");
        evaluateeID=object.getIntValue("evaluateeID");
        score=object.getDoubleValue("evaluationScore");
    }
}
