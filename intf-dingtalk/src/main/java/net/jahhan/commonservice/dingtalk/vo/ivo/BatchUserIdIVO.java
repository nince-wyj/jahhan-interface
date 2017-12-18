package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "返回成员的userid")
public class BatchUserIdIVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "员工UserID列表。")
    @Length(min = 1, max = 20, message = "列表长度在1到20之间")
    private List<String> useridlist;
}
