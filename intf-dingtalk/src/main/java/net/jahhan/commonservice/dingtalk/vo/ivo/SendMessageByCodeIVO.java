package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(value = "获取临时授权码")
public class SendMessageByCodeIVO extends SendMessageBodyIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "员工id列表，多个用|分隔")
	private String touser;

	@ApiModelProperty(value = "部门id列表，多个接收者用|分隔")
	private String toparty;

	@ApiModelProperty(value = "企业应用id")
	@NotNull(message = "agentid不能为空")
	private String agentid;

	@ApiModelProperty(value = "临时授权码")
	@NotNull(message = "code不能为空")
	private String code;
}