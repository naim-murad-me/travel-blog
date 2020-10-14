package org.travel.blog.api.service;

import com.nm.tb.models.User;

/**
 * User's related services
 * @author Naim Murad
 * @since Oct 14, 2020
 *
 */
public interface UserService {

	void save(User user);

	User findByUsername(String username);
}
