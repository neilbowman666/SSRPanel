package org.shadowsocks.ssrpanel.good.enetity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plan {

    @Id
    private Long id;
    private String name;
    private String description;
    private int lastingDays;
    private int transfer; // in Byte

}
