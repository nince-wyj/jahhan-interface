package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "返回创建会话消息结果")
public class CreateChatOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "群会话的id")
    private String chatid;
}
