package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentactions.abstractimpl.AbstractActionResult;
import uk.ac.rhul.cs.dice.agentactions.enums.ActionResult;

/**
 * 
 * Interface for action results.<br /><br />
 * Known implementations: {@link AbstractActionResult}.
 * 
 * @author cloudstrife9999
 *
 */
public interface Result {
    
    /**
     * 
     * Returns the {@link ActionResult} linked to this {@link Result}.
     * 
     * @return the {@link ActionResult} linked to this {@link Result}.
     * 
     */
    public abstract ActionResult getActionResultType();
    
    /**
     * 
     * Updates the {@link ActionResult} with a new one.
     * 
     * @param updatedActionResult the new {@link ActionResult}.
     * 
     */
    public abstract void editResultType(ActionResult updatedActionResult);
}