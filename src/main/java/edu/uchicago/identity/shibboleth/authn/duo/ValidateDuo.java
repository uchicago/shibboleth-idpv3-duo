/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uchicago.identity.shibboleth.authn.duo;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.security.auth.Subject;
import net.shibboleth.idp.authn.AbstractValidationAction;
import net.shibboleth.idp.authn.AuthnEventIds;
import net.shibboleth.idp.authn.context.AuthenticationContext;
import net.shibboleth.idp.authn.context.UsernameContext;
import org.opensaml.profile.action.ActionSupport;
import org.opensaml.profile.context.ProfileRequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author David Langenberg <davel@uchicago.edu>
 */
public class ValidateDuo extends AbstractValidationAction {

	/** Class logger. */
    @Nonnull private final Logger log = LoggerFactory.getLogger(ValidateDuo.class);
	
	/** Username context identifying identity to validate. */
    @Nullable private UsernameContext usernameContext;
	
	@Override
	protected Subject populateSubject(Subject sbjct) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	/**
	 * {@inheritDoc }
	 * @param profileRequestContext
	 * @param authenticationContext
	 */
	@Override
	protected boolean doPreExecute(@Nonnull final ProfileRequestContext profileRequestContext,
            @Nonnull final AuthenticationContext authenticationContext) {
		
		usernameContext = authenticationContext.getSubcontext(UsernameContext.class);
		//we should always have a username and it should always be non-null
        if (usernameContext == null) {
            log.debug("{} No UsernameContext available within authentication context", getLogPrefix());
            ActionSupport.buildEvent(profileRequestContext, AuthnEventIds.NO_CREDENTIALS);
            return false;
        }
		
		if (usernameContext.getUsername() == null) {
            log.debug("{} No username available within UsernameContext", getLogPrefix());
            ActionSupport.buildEvent(profileRequestContext, AuthnEventIds.NO_CREDENTIALS);
            return false;
        }
		
		return true;
	}

	/**
	 * Validate The Response?
	 * @param profileRequestContext
	 * @param authenticationContext 
	 */
	@Override
	protected void doExecute(ProfileRequestContext profileRequestContext, AuthenticationContext authenticationContext) {
		super.doExecute(profileRequestContext, authenticationContext); //To change body of generated methods, choose Tools | Templates.
	}
	
	
}
