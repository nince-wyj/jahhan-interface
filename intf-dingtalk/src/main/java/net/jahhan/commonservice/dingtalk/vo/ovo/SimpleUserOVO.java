package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "返回部门成员信息")
public class SimpleUserOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "在分页查询时返回，代表是否还有下一页更多数据")
    private boolean hasMore;

    @ApiModelProperty(value = "成员列表")
    private List<UserOVO> userlist;
}
