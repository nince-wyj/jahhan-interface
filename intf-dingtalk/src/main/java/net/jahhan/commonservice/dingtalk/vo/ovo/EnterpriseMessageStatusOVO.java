package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "返回企业通知消息已读未读状态")
public class EnterpriseMessageStatusOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "已读的人员userId列表，JSON数组格式")
    private List<String> read;

    @ApiModelProperty(value = "未读的人员userId列表，JSON数组格式")
    private List<String> unread;
}
