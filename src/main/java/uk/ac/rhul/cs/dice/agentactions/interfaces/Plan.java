package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

public interface Plan<T extends Action<?>> {
    
    public abstract boolean isEmpty();
    
    public abstract int getSize();
    
    public abstract T peek();
    
    public abstract void enqueueAction(T action);
    
    public abstract void pushActionAtTheBeginning(T action);
    
    public abstract T pop();
    
    public abstract void deleteLast();
    
    public abstract void clear();
}