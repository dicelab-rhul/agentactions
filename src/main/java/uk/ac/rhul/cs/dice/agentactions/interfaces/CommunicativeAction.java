package uk.ac.rhul.cs.dice.agentactions.interfaces;

import java.util.Collections;
import java.util.Set;

import uk.ac.rhul.cs.dice.agentactions.enums.EnvironmentalActionType;

public interface CommunicativeAction<T extends Enum<?>> extends EnvironmentalAction<T> {
    
    @Override
    public default boolean isGenericTypeConsistent() {
	return EnvironmentalActionType.COMMUNICATIVE.equals(getGenericType());
    }
    
    @Override
    public default EnvironmentalActionType getGenericType() {
        return EnvironmentalActionType.COMMUNICATIVE;
    }
    
    public default Set<String> getRecipientsIds() {
	return Collections.emptySet();
    }
}