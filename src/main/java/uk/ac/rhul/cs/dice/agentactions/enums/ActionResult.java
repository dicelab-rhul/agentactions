package uk.ac.rhul.cs.dice.agentactions.enums;

import uk.ac.rhul.cs.dice.agentactions.abstractimpl.AbstractActionResult;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

/**
 * 
 * An enumeration for {@link AbstractActionResult}s.
 * 
 * <code>IMPOSSIBLE</code> means that the {@link Action} preconditions are not met. <br/>
 * <code>SUCCESS</code> means that both the {@link Action} preconditions and postconditions are met. <br/>
 * <code>FAILURE</code> means that the {@link Action} preconditions are met but the postconditions are not met.
 * 
 * @author cloudstrife9999
 * @author kostas
 *
 */
public enum ActionResult {
    IMPOSSIBLE, SUCCESS, FAILURE;
}