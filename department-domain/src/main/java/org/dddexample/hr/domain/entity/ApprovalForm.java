package org.dddexample.hr.domain.entity;

import java.util.List;

import org.dddexample.hr.domain.entity.inst.Flow;
import org.dddexample.hr.domain.entity.inst.Module;
import org.dddexample.hr.types.flow.ApprovalFormId;
import org.dddexample.hr.types.flow.enums.ApprovalFormLifeCycle;

/**
 * 审批单实例
 *
 * @author yelihu
 **/
public class ApprovalForm {

    private ApprovalFormId id;

    /**
     * 审批单名称
     */
    private String formName;

    /**
     * 审批单发起人工号
     */
    private String creatorWorkNo;

    /**
     * 审批单流程节点模块
     */
    private Flow flow;

    /**
     * 审批单所有模块
     */
    private List<Module> modules;

    /**
     * 审批单生命周期
     */
    private ApprovalFormLifeCycle lifeCycle;

    /**
     * 是否逻辑删除
     */
    private Boolean deleted;

}
