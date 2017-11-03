package uk.ac.rhul.cs.dice.agentactions.interfaces;

import java.util.Collection;
import java.util.Collections;

import uk.ac.rhul.cs.dice.agentactions.enums.EnvironmentalActionType;

public interface CommunicativeAction<T extends Enum<?>> extends EnvironmentalAction<T> {
    
    @Override
    public default boolean isGenericTypeConsistent() {
	return EnvironmentalActionType.COMMUNICATIVE.equals(getGenericType());
    }
    
    public default Collection<String> getRecipientsIds() {
	return Collections.emptySet();
    }
}