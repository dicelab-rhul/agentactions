package uk.ac.rhul.cs.dice.agentactions.interfaces;

public interface Goal {

    public abstract boolean isCompleted(Object... params);
    
    public abstract boolean hasAtLeastOnePlan();
}