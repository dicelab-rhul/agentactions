package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentactions.enums.EnvironmentalActionType;

public interface PhysicalAction<T extends Enum<?>> extends EnvironmentalAction<T> {
    
    @Override
    public default boolean isGenericTypeConsistent() {
	return EnvironmentalActionType.PHYSICAL.equals(getGenericType());
    }
    
    @Override
    public default EnvironmentalActionType getGenericType() {
	return EnvironmentalActionType.PHYSICAL;
    }
}