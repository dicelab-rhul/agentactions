package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agent.interfaces.Mind;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;

public interface InternalAction<T extends Enum<?>> extends Action<T> {
    public abstract Result attempt(Mind mind);
}