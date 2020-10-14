package org.travel.blog.api.service;

/**
 * App's security related services
 * @author Naim Murad
 * @since Oct 14, 2020
 *
 */
public interface SecurityService {

	boolean isAuthenticated();

	void autoLogin(String username, String password);
}
