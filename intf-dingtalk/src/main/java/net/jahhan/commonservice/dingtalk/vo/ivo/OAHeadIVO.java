package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "OA消息头")
public class OAHeadIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "消息头部的背景颜色")
	private String bgcolor;

	@ApiModelProperty(value = "消息的头部标题")
	private String text;
}