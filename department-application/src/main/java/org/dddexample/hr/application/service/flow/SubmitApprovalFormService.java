package org.dddexample.hr.application.service.flow;

import javax.validation.Valid;

import org.dddexample.hr.application.cqe.flow.ApprovalFormCreateCommand;
import org.example.hr.Result;

/**
 * TODO
 *
 * @author yelihu
 */
public interface SubmitApprovalFormService {
    /**
     * 创建审批单
     *
     * @param createCommand 审批单创建写命令
     * @return 是否创建成功
     */
    Result<Boolean> submit(@Valid ApprovalFormCreateCommand createCommand);
}
