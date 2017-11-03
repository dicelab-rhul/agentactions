package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentactions.enums.EnvironmentalActionType;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Environment;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Physics;

public interface EnvironmentalAction<T extends Enum<?>> extends Action<EnvironmentalActionType> {
    public abstract T getType();
    public abstract boolean isTypeConsistent();
    public abstract Result attempt(Environment context, Physics physics);
}