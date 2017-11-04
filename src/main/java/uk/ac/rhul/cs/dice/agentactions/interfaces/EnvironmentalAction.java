package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentactions.enums.EnvironmentalActionType;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Environment;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Physics;

public interface EnvironmentalAction<T extends Enum<?>> extends Action<EnvironmentalActionType> {
    public abstract T getType();
    public abstract boolean isTypeConsistent();
    public abstract boolean isPossible(Environment context, Physics physics);
    public abstract Result attempt(Environment context, Physics physics);
    public abstract Result perform(Environment context, Physics physics);
    public abstract boolean succeeded(Environment context, Physics physics);
}