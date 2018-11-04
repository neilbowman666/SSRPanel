package org.shadowsocks.ssrpanel.good.enetity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Good {

    @Id
    private Long id;
    private String title;
    private String description;
    private Plan plan;
    private Double originalPrice;
    private Integer positiveDiscount;
    private boolean isEnabled = true;
    private Timestamp create;
    private Timestamp update;

}