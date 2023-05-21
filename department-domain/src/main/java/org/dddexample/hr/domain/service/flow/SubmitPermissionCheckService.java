package org.dddexample.hr.domain.service.flow;

import org.dddexample.hr.types.common.EmployeeId;

/**
 * TODO
 *
 * @author yelihu
 * @version V3.0
 * @since 2023/5/21 8:06 PM
 */
public interface SubmitPermissionCheckService {
    boolean hasPermission(EmployeeId id);
}
