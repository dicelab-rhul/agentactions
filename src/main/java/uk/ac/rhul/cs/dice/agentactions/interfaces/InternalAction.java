package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agent.interfaces.Mind;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * Interface for internal {@link Action}s. It extends {@link Action}.
 * 
 * @author cloudstrife9999
 * @author kostas
 *
 * @param <T> an enumeration.
 * 
 */
public interface InternalAction<T extends Enum<?>> extends Action<T> {
    
    /**
     * 
     * Attempts this action in a {@link Mind}. It indicates that this {@link InternalAction} might raise an {@link Exception}.
     * 
     * @param mind a {@link Mind}.
     * 
     * @return the {@link Result} of the attempt.
     * 
     */
    public abstract Result attempt(Mind mind);
}