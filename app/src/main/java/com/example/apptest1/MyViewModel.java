package com.example.apptest1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> teamA;
    private MutableLiveData<Integer> teamB;
    private int backA, backB;

    public MutableLiveData<Integer> getTeamA() {
        if(teamA == null){
            teamA = new MutableLiveData<>();
            teamA.setValue(0);
        }
        return teamA;
    }

    public MutableLiveData<Integer> getTeamB() {
        if(teamB == null){
            teamB = new MutableLiveData<>();
            teamB.setValue(0);
        }
        return teamB;
    }

    public void addA(int n){
        backA = teamA.getValue();
        backB = teamB.getValue();
        teamA.setValue(teamA.getValue() + n);
    }

    public void addB(int n){
        backA = teamA.getValue();
        backB = teamB.getValue();
        teamB.setValue(teamB.getValue() + n);
    }

    public void undo(){
        teamA.setValue(backA);
        teamB.setValue(backB);
    }

    public void reset(){
        backA = teamA.getValue();
        backB = teamB.getValue();
        teamA.setValue(0);
        teamB.setValue(0);
    }
}
