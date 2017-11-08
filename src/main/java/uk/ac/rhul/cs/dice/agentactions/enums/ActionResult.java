package uk.ac.rhul.cs.dice.agentactions.enums;

import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * <code>IMPOSSIBLE</code> means that the {@link Action} preconditions are not met. <br/>
 * <code>SUCCESS</code> means that both the {@link Action} preconditions and postconditions are met. <br/>
 * <code>FAILURE</code> means that the {@link Action} preconditions are met but the postconditions are not met.
 * 
 * @author kostas
 *
 */
public enum ActionResult {
    IMPOSSIBLE, SUCCESS, FAILURE;
}