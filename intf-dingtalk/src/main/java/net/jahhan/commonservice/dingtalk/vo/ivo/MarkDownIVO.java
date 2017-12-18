package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "markdown消息")
public class MarkDownIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "首屏会话透出的展示内容")
	private String title;

	@ApiModelProperty(value = "markdown格式的消息")
	private String text;
}