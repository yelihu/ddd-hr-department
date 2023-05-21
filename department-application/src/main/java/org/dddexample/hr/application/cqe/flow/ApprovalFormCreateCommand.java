package org.dddexample.hr.application.cqe.flow;

import javax.validation.constraints.NotEmpty;

import org.dddexample.hr.types.enums.AdjustType;

import lombok.Data;

/**
 * @author yelihu
 **/
@Data
public class ApprovalFormCreateCommand {

    @NotEmpty
    private String createWorkNo;

    private DeptAdjustDTO from;

    private DeptAdjustDTO to;

    private AdjustType type;

}
