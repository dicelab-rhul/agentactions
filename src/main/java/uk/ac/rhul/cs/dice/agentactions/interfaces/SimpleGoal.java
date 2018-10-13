package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * Interface for a {@link Goal} without sub-goals and with a single {@link Plan}.<br/><br/>
 * Extends {@link Goal}.<br/><br/>
 * Known implementations: none.
 * 
 * @author cloudstrife9999
 *
 * @param <T> a subclass of {@link Action}, characterizing the {@link Action}s of the {@link Plan}.
 * 
 */
public interface SimpleGoal<T extends Action<?>> extends Goal {
    
    /**
     * 
     * Returns the {@link Plan} for this {@link SimpleGoal}.
     * 
     * @return the {@link Plan} for this {@link SimpleGoal}.
     * 
     */
    public abstract Plan<T> getPlan();
}