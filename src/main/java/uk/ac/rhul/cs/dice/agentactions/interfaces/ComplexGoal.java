package uk.ac.rhul.cs.dice.agentactions.interfaces;

import java.util.Collection;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

public interface ComplexGoal<T extends Action<?>> {

    public abstract Collection<Plan<T>> getPlansForThisGoal();
    
    public abstract Collection<Goal> getSubGoals();
}