package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

public interface SimpleGoal<T extends Action<?>> extends Goal {
    
    public abstract Plan<T> getPlan();
}