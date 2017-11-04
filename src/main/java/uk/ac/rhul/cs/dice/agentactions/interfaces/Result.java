package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentactions.enums.ActionResult;

public interface Result {    
    public abstract ActionResult getActionResultType();
    public abstract void editResultType(ActionResult updatedActionResult);
}