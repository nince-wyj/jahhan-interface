package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by 99 on 2017/10/20.
 */
public class ListDepartmentUserInfoOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "在分页查询时返回，代表是否还有下一页更多数据")
    private boolean hasMore;

    @ApiModelProperty(value = "成员列表")
    private UserListOVO[] userlist;

}
