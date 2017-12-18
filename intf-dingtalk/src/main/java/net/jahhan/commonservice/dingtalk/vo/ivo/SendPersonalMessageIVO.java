package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(value = "个人发送普通消息")
public class SendPersonalMessageIVO extends SendMessageBodyIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "消息发送者员工ID")
	@NotNull(message = "sender不能为空")
	private String sender;

	@ApiModelProperty(value = "群消息或者个人聊天会话Id")
	@NotNull(message = "cid不能为空")
	private String cid;
}