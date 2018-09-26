package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * Interface for plans.
 * 
 * @author cloudstrife9999
 *
 * @param <T> a subclass of {@link Action}, characterizing the {@link Action}s of this {@link Plan}.
 */
public interface Plan<T extends Action<?>> {
    
    /**
     * 
     * Returns whether this {@link Plan} is empty.
     * 
     * @return whether or not this {@link Plan} is empty.
     * 
     */
    public abstract boolean isEmpty();
    
    /**
     * 
     * Returns the number of {@link Action}s in this {@link Plan}.
     * 
     * @return the number of {@link Action}s in this {@link Plan}.
     * 
     */
    public abstract int getSize();
    
    /**
     * 
     * Returns the first {@link Action} in this {@link Plan} without removing it.
     * 
     * @return the first {@link Action} in this {@link Plan} without removing it.
     * 
     */
    public abstract T peek();
    
    /**
     * 
     * Enqueues an {@link Action} to this {@link Plan}.
     * 
     * @param action the {@link Action} to enqueue.
     * 
     */
    public abstract void enqueueAction(T action);
    
    /**
     * 
     * Pushes an {@link Action} at the very beginning of this {@link Plan}.
     * 
     * @param action the {@link Action} to be pushed at the beginning of this {@link Plan}.
     * 
     */
    public abstract void pushActionAtTheBeginning(T action);
    
    /**
     * 
     * Returns the first {@link Action} in this {@link Plan} after removing it.
     * 
     * @return the first {@link Action} in this {@link Plan} after removing it.
     * 
     */
    public abstract T pop();
    
    /**
     * 
     * Deletes the last enqueued {@link Action} from this {@link Plan}.
     * 
     */
    public abstract void deleteLast();
    
    /**
     * 
     * Deletes all the {@link Action}s from this {@link Plan}.
     * 
     */
    public abstract void clear();
}