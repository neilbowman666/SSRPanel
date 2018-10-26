package org.shadowsocks.ssrpanel.user.repository;

import org.shadowsocks.ssrpanel.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User Repository
 */
public interface UserDao extends JpaRepository<User, Long> {
}
