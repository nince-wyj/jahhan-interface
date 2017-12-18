package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "修改会话")
public class UpdateChatIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "群会话的id")
	private String chatid;

	@ApiModelProperty(value = "群名称。长度限制为1~20个字符，不传则不修改")
	private String name;

	@ApiModelProperty(value = "群主userId")
	private String owner;

	@ApiModelProperty(value = "添加成员列表，每次最多操作40人，群人数上限为1000")
	private List<String> add_useridlist;

	@ApiModelProperty(value = "删除成员列表，每次最多操作40人，群人数上限为1000")
	private List<String> del_useridlist;
}