package org.dddexample.hr.domain.entity.inst;

import java.util.List;

import org.dddexample.hr.domain.entity.def.FlowDefinition;
import org.dddexample.hr.types.flow.inst.FlowId;

/**
 * {@link FlowDefinition} 的实例化对象，
 *
 * @author yelihu
 **/
public class Flow {

    private FlowId id;

    private List<Node> nodes;
}
