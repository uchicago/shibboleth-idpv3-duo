/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uchicago.identity.shibboleth.authn.duo;

import javax.annotation.Nonnull;
import javax.security.auth.Subject;
import net.shibboleth.idp.authn.AbstractValidationAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author David Langenberg <davel@uchicago.edu>
 */
public class ValidateDuo extends AbstractValidationAction {

	/** Class logger. */
    @Nonnull private final Logger log = LoggerFactory.getLogger(ValidateDuo.class);
	
	
	@Override
	protected Subject populateSubject(Subject sbjct) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
