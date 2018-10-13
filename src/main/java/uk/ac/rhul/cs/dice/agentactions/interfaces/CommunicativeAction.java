package uk.ac.rhul.cs.dice.agentactions.interfaces;

import java.util.Collections;
import java.util.Set;

import uk.ac.rhul.cs.dice.agentactions.enums.EnvironmentalActionType;

/**
 * 
 * Interface for communicative actions.<br/><br/>
 * Extends {@link EnvironmentalAction}.<br/><br/>
 * Known implementations: none.
 * 
 * @author cloudstrife9999
 *
 * @param <T> an enumeration.
 * 
 */
public interface CommunicativeAction<T extends Enum<?>> extends EnvironmentalAction<T> {
    
    @Override
    public default boolean isGenericTypeConsistent() {
	return EnvironmentalActionType.COMMUNICATIVE.equals(getGenericType());
    }
    
    @Override
    public default EnvironmentalActionType getGenericType() {
        return EnvironmentalActionType.COMMUNICATIVE;
    }
    
    /**
     * 
     * Returns a {@link Set} of IDs, each one being the {@link String} ID of each of the recipients of the communication.
     * 
     * @return a {@link Set} of {@link String} IDs.
     * 
     */
    public default Set<String> getRecipientsIds() {
	return Collections.emptySet();
    }
}