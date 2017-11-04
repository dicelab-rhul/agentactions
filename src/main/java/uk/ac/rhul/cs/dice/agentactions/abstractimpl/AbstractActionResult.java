package uk.ac.rhul.cs.dice.agentactions.abstractimpl;

import uk.ac.rhul.cs.dice.agentactions.enums.ActionResult;
import uk.ac.rhul.cs.dice.agentactions.interfaces.Result;

public class AbstractActionResult implements Result {
    private ActionResult type;
    
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