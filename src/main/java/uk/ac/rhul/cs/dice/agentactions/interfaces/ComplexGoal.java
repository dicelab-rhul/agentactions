package uk.ac.rhul.cs.dice.agentactions.interfaces;

import java.util.Collection;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * Interface for a {@link Goal} with (possibly) sub-goals and with (possibly) multiple {@link Plan}s for this {@link Goal}.<br/><br/>
 * Extends {@link Goal}.<br/><br/>
 * Known implementations: none.
 * 
 * @author cloudstrife9999
 *
 * @param <T> a subclass of {@link Action}, characterizing the {@link Action}s of the {@link Plan}s.
 * 
 */
public interface ComplexGoal<T extends Action<?>> extends Goal {

    /**
     * 
     * Returns the {@link Collection} of {@link Plan}s for this {@link ComplexGoal}.
     * 
     * @return the {@link Collection} of {@link Plan}s for this {@link ComplexGoal}.
     * 
     */
    public abstract Collection<Plan<T>> getPlansForThisGoal();
    
    /**
     * 
     * Returns the {@link Collection} of sub-goals for this {@link ComplexGoal}.
     * 
     * @return the {@link Collection} of sub-goals for this {@link ComplexGoal}.
     * 
     */
    public abstract Collection<Goal> getSubGoals();
}