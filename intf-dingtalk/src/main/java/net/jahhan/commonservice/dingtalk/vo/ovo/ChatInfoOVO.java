package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "群会话消息")
public class ChatInfoOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "群名称")
    private String name;

    @ApiModelProperty(value = "群主userid")
    private String owner;

    @ApiModelProperty(value = "群成员userId列表")
    private List<String> useridlist;
}
