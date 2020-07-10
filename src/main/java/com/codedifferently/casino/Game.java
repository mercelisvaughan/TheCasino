package com.codedifferently.casino;

public abstract class Game {

    private Integer turn, score, numOfPlayers;
    private String decision, rules, move;

    public abstract Integer getTurn();
    public abstract String getDecision();
    public abstract String getRules();
    public abstract String getMove();
    public abstract Integer getNumOfPlayers();
    public abstract void setTurn();
    public abstract void setDecision();
    public abstract void setRules(String s);
    public abstract void setScore(Integer i);
    public abstract void setMove(String s);
    public abstract void setNumOfPlayers(Integer i);
    public abstract void takeTurn();
    public abstract void makeDecision();
    public abstract String displayRules();
    public abstract void keepScore();
    public abstract void makeAMove();
    public abstract Boolean outcome();


}
