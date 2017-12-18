package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "OA消息体的单行富文本信息")
public class OABodyRichIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "单行富文本信息的数目")
	private String num;

	@ApiModelProperty(value = "单行富文本信息的单位")
	private String unit;
}