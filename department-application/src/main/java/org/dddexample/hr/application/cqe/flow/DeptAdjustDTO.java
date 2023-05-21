package org.dddexample.hr.application.cqe.flow;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.dddexample.hr.types.common.EmployeeId;
import org.dddexample.hr.types.dept.DepartmentId;

import lombok.Data;

/**
 * @author yelihu
 **/
@Data
public class DeptAdjustDTO implements Serializable {

    private static final long serialVersionUID = -70094136739320731L;

    @NotEmpty
    private String deptName;

    @NotNull
    private EmployeeId masterWorkNo;

    @NotNull
    private EmployeeId hrbpWorkNo;

    @NotNull
    @Positive
    @Min(0)
    @Max(20)
    private Integer deptLayer;

    @NotNull
    private DepartmentId parentDeptNo;

}
