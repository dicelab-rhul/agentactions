package uk.ac.rhul.cs.dice.agentactions.interfaces;

import uk.ac.rhul.cs.dice.agentactions.enums.EnvironmentalActionType;
import uk.ac.rhul.cs.dice.agentcommon.interfaces.Action;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Environment;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Physics;

/**
 * 
 * This interface is for {@link Action}s which can be executed in an {@link Environment}. It extends {@link Action}, fixing its enumeration to {@link EnvironmentalActionType}.
 * It requires a further enumeration as parameter, to further specify the kind of environmental action.<br /><br />
 * 
 * Known sub-interfaces: {@link PhysicalAction}, {@link SensingAction}, {@link CommunicativeAction}.
 * 
 * @author cloudstrife9999
 *
 * @param <T> an enumeration.
 * 
 */
public interface EnvironmentalAction<T extends Enum<?>> extends Action<EnvironmentalActionType> {
    
    /**
     * 
     * Returns the instance of the parameter <code>T</code> this {@link EnvironmentalAction} has been built with.
     * 
     * @return the instance of the parameter <code>T</code> this {@link EnvironmentalAction} has been built with.
     * 
     */
    public abstract T getType();
    
    /**
     * 
     * Returns whether the parameter T is consistent.
     * 
     * @return whether or not the parameter T is consistent.
     * 
     */
    public abstract boolean isTypeConsistent();
    
    /**
     * 
     * Returns whether this {@link EnvironmentalAction} can be attempted in <code>context</code> with the rules specified in <code>physics</code> (i.e., the pre-conditions are met).
     * 
     * @param context the {@link Environment} where this method wants to check whether this {@link EnvironmentalAction} can be attempted.
     * @param physics the {@link Physics} of the {@link Environment} where this method wants to check whether this {@link EnvironmentalAction} can be attempted.
     * 
     * @return whether or not this {@link EnvironmentalAction} can be attempted in <code>context</code> with the rules specified in <code>physics</code> (i.e., the pre-conditions are met).
     * 
     */
    public abstract boolean isPossible(Environment context, Physics physics);
    
    /**
     * 
     * Attempts this {@link EnvironmentalAction} in <code>context</code> with the rules specified in <code>physics</code>.
     * 
     * @param context the {@link Environment} where this {@link EnvironmentalAction} is to be attempted.
     * @param physics the {@link Physics} of the {@link Environment} where this {@link EnvironmentalAction} is to be attempted.
     * 
     * @return the {@link Result} of the attempt.
     * 
     */
    public abstract Result attempt(Environment context, Physics physics);
    
    /**
     * 
     * Performs this {@link EnvironmentalAction} in <code>context</code> with the rules specified in <code>physics</code>.
     * 
     * @param context the {@link Environment} where this {@link EnvironmentalAction} is to be performed.
     * @param physics the {@link Physics} of the {@link Environment} where this {@link EnvironmentalAction} is to be performed.
     * 
     * @return the {@link Result} of the performing.
     * 
     */
    public abstract Result perform(Environment context, Physics physics);
    
    /**
     * 
     * Returns whether the attempt of this {@link EnvironmentalAction} in <code>context</code> with the rules specified in <code>physics</code> succeeded (i.e., the post-conditions are met).
     * 
     * @param context the {@link Environment} where this {@link EnvironmentalAction} has been attempted.
     * @param physics the {@link Physics} of the {@link Environment} where this {@link EnvironmentalAction} has been attempted.
     * 
     * @return whether or not the attempt of this {@link EnvironmentalAction} in <code>context</code> with the rules specified in <code>physics</code> succeeded (i.e., the post-conditions are met).
     * 
     */
    public abstract boolean succeeded(Environment context, Physics physics);
}