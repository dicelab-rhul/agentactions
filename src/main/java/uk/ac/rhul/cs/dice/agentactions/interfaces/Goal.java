package uk.ac.rhul.cs.dice.agentactions.interfaces;

/**
 * 
 * Interface for goals.<br /><br />
 * 
 * Known sub-interfaces: {@link SimpleGoal}, {@link ComplexGoal}.<br/><br/>
 * Known implementations: none.
 * 
 * @author cloudstrife9999
 *
 */
public interface Goal {

    /**
     * 
     * Returns whether this {@link Goal} has been completed or not.
     * 
     * @param params a variable number of {@link Object}s to be used in the check.
     * 
     * @return whether or not this {@link Goal} has been completed.
     * 
     */
    public abstract boolean isCompleted(Object... params);
    
    /**
     * 
     * Returns whether this {@link Goal} has at least one {@link Plan}.
     * 
     * @return whether or not this {@link Goal} has at least one {@link Plan}.
     * 
     */
    public abstract boolean hasAtLeastOnePlan();
}