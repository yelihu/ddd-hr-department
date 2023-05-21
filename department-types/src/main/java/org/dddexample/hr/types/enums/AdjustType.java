package org.dddexample.hr.types.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * TODO
 *
 * @author yelihu
 * @version V3.0
 * @since 2023/5/21 10:55 PM
 */
@Getter
@AllArgsConstructor
public enum AdjustType {

    CREATE("CREATE", "新增"),
    MODIFY("MODIFY", "变更"),
    DELETE("DELETE", "修改");

    private final String code;

    private final String description;

    public static AdjustType find(String code) {
        return Arrays.stream(AdjustType.values())
            .filter(instance -> instance.getCode()
                .equals(code))
            .findFirst()
            .orElse(null);
    }
}
