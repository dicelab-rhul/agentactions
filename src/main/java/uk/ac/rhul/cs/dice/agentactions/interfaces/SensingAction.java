package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentactions.enums.EnvironmentalActionType;

/**
 * 
 * Interface for sensing actions. It extends {@link EnvironmentalAction}.
 * 
 * @author cloudstrife9999
 *
 * @param <T> an enumeration.
 * 
 */
public interface SensingAction<T extends Enum<?>> extends EnvironmentalAction<T> {
    
    @Override
    public default boolean isGenericTypeConsistent() {
	return EnvironmentalActionType.SENSING.equals(getGenericType());
    }
    
    @Override
    public default EnvironmentalActionType getGenericType() {
        return EnvironmentalActionType.SENSING;
    }
}