package org.shadowsocks.ssrpanel.node.dao;

import org.shadowsocks.ssrpanel.node.entity.SSRNode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SSRNodeRepository extends JpaRepository<SSRNode, Long> {
}
