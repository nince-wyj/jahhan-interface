package net.jahhan.commonservice.dingtalk.intf;

import com.frameworkx.common.extension.constant.ContentType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.jahhan.commonservice.dingtalk.vo.ivo.MessageIdIVO;
import net.jahhan.commonservice.dingtalk.vo.ivo.SendEnterpriseMessageIVO;
import net.jahhan.commonservice.dingtalk.vo.ivo.SendMessageByCodeIVO;
import net.jahhan.commonservice.dingtalk.vo.ivo.SendPersonalMessageIVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.EnterpriseMessageStatusOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.SendEnterpriseMessageOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.SendPersonalMessageOVO;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;

@Path("/message")
@Consumes({ ContentType.APPLICATION_JSON_UTF_8 })
@Produces({ ContentType.APPLICATION_JSON_UTF_8 })
@Api("消息接口")
public interface MessageIntf {
    @POST
    @Path("send_to_conversation")
    @ApiOperation(value = "个人发送普通消息")
    public SendPersonalMessageOVO sendPersonalMessage(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "消息体不能为空") SendPersonalMessageIVO sendPersonalMessageIVO
    );

    @POST
    @Path("send")
    @ApiOperation(value = "企业发送消息")
    public SendEnterpriseMessageOVO sendEnterpriseMessage(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "消息体不能为空") SendEnterpriseMessageIVO sendEnterpriseMessageIVO
    );

    @POST
    @Path("list_message_status")
    @ApiOperation(value = "获取企业通知消息已读未读状态")
    public EnterpriseMessageStatusOVO getEnterpriseMessageStatus(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "消息ID不能为空") MessageIdIVO messageIdIVO
    );

    @GET
    @Path("sendByCode")
    @ApiOperation(value = "通过临时授权码发送企业消息")
    public SendEnterpriseMessageOVO sendByCode(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "消息体不能为空") SendMessageByCodeIVO sendMessageByCodeIVO
    );
}
