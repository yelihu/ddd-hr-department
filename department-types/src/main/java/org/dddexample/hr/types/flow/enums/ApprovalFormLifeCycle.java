package org.dddexample.hr.types.flow.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * TODO
 *
 * @author yelihu
 */
@Getter
@AllArgsConstructor
public enum ApprovalFormLifeCycle {
    /**
     * 审批提交
     */
    SUBMITTED("SUBMITTED", "审批提交"),
    /**
     * 审批执行节点中
     */
    APPROVING("APPROVING", "审批执行节点中"),
    /**
     * TO_BE_EFFECTED("TO_BE_EFFECTED", "变更待生效"),
     */
    TO_BE_EFFECTED("TO_BE_EFFECTED", "变更待生效"),
    /**
     * 审批单完成
     */
    DONE("DONE", "审批单完成");

    /** 状态码 */
    private final String code;

    /** 状态描述 */
    private final String description;

    /**
     * 根据编码查找枚举
     *
     * @param code 编码
     * @return {@link ApprovalFormLifeCycle } 实例
     **/
    public static ApprovalFormLifeCycle find(String code) {
        return Arrays.stream(ApprovalFormLifeCycle.values())
            .filter(instance -> instance.getCode()
                .equals(code))
            .findFirst()
            .orElse(null);
    }
}
