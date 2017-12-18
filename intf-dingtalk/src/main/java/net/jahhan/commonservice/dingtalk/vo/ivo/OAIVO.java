package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "消息头部内容")
public class OAIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "客户端点击消息时跳转到的H5地址")
	private String message_url;

	@ApiModelProperty(value = "PC端点击消息时跳转到的URL地址")
	private String pc_message_url;

	@ApiModelProperty(value = "消息标题")
	private OAHeadIVO head;

	@ApiModelProperty(value = "消息标题")
	private OABodyIVO body;

}