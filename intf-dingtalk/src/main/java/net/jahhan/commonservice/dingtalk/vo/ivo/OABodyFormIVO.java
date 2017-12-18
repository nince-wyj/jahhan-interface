package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "OA消息体的表单")
public class OABodyFormIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "消息体的关键字")
	private String key;

	@ApiModelProperty(value = "消息体的关键字对应的值")
	private String value;
}