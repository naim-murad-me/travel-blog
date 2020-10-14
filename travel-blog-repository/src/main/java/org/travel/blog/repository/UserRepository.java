package org.travel.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nm.tb.models.User;

/**
 * 
 * @author Naim Murad
 * @since Oct 14, 2020
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
