package org.shadowsocks.ssrpanel.node.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class SSRNode {

    @Id
    private Long id;

    private String title;

    private String host;

    private int port;

    private String password;

    private String method;

    private String protocal;

    private String protocalParam;

    private String obfs;

    private String obfsParam;

    private String groupName;

    private int order;

    private boolean isOnline = false;

    private boolean isDisabled = true;

    private Timestamp createTime;

}
