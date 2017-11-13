package uk.ac.rhul.cs.dice.agentactions.enums;

import uk.ac.rhul.cs.dice.agentactions.interfaces.CommunicativeAction;
import uk.ac.rhul.cs.dice.agentactions.interfaces.EnvironmentalAction;
import uk.ac.rhul.cs.dice.agentactions.interfaces.PhysicalAction;
import uk.ac.rhul.cs.dice.agentactions.interfaces.SensingAction;

/**
 * 
 * An enumeration for {@link EnvironmentalAction}s.<br /><br />
 * 
 * <code>PHYSICAL</code> for {@link PhysicalAction}s.<br />
 * <code>SENSING</code> for {@link SensingAction}s.<br />
 * <code>COMMUNICATIVE</code> for {@link CommunicativeAction}s.<br />
 * 
 * @author cloudstrife9999
 *
 */
public enum EnvironmentalActionType {
    PHYSICAL, SENSING, COMMUNICATIVE;
}