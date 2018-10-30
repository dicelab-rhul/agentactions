package uk.ac.rhul.cs.dice.agentactions.abstractimpl;

import uk.ac.rhul.cs.dice.agentactions.enums.ActionResult;
import uk.ac.rhul.cs.dice.agentactions.interfaces.Result;

/**
 * 
 * Implementation of {@link Result}. It wraps an {@link ActionResult}.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractActionResult implements Result {
    private ActionResult type;
    
    /**
     * 
     * Constructs an {@link AbstractActionResult} from an {@link ActionResult}.
     * 
     * @param type an {@link ActionResult}.
     * 
     */
    public AbstractActionResult(ActionResult type) {
	this.type = type;
    }
    
    @Override
    public ActionResult getActionResultType() {
	return this.type;
    }
    
    @Override
    public void editResultType(ActionResult updatedActionResult) {
	this.type = updatedActionResult;
    }
}