package org.dddexample.hr.persistence.PO;

import java.util.Date;

import lombok.Data;

/**
 * @author yelihu
 **/

@Data
public class FlowDefinitionPO {

    private Long id;

    private String flowName;

    /**
     * groovy脚本
     */
    private String script;

    private Date gmtCreated;

    private Date gmtModified;

    private Boolean deleted;
}
