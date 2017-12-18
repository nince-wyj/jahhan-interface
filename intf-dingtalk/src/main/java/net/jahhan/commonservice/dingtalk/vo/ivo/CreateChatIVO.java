package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "创建会话")
public class CreateChatIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "群名称。长度限制为1~20个字符")
	@NotNull(message = "name不能为空")
	@Length(min = 1, max = 20, message = "群名称长度为1~20个字符")
	private String name;

	@ApiModelProperty(value = "群主userId")
	@NotNull(message = "owner不能为空")
	private String owner;

	@ApiModelProperty(value = "群成员列表，每次最多操作40人，群人数上限为1000")
	@NotNull(message = "useridlist不能为空")
	@Length(max = 40, message = "最多操作40人")
	private List<String> useridlist;

	@ApiModelProperty(value = "新成员是否可查看聊天历史消息。0代表否，1代表是，不传默认为否")
	private Integer showHistoryType = 0;
}