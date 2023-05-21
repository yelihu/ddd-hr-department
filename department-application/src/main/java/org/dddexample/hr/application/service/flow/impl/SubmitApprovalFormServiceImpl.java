package org.dddexample.hr.application.service.flow.impl;

import org.dddexample.hr.application.cqe.flow.ApprovalFormCreateCommand;
import org.dddexample.hr.application.service.flow.SubmitApprovalFormService;
import org.dddexample.hr.domain.service.flow.ApprovalFormService;
import org.dddexample.hr.types.enums.AdjustType;
import org.example.hr.Result;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yelihu
 **/
@Slf4j
@Service
@RequiredArgsConstructor
public class SubmitApprovalFormServiceImpl implements SubmitApprovalFormService {

    private final ApprovalFormService approvalFormService;

    @Override
    public Result<Boolean> submit(ApprovalFormCreateCommand cmd) {

        AdjustType adjustType = cmd.getType();

        //权限校验

        //根据参数路由获取definition
        //工厂根据definition生成approvalForm、Module、Flow、Node的实例

        //组装
        //落库

        return Result.success(null);
    }
}
