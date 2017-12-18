package net.jahhan.commonservice.dingtalk.intf;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.jahhan.common.extension.constant.ContentType;
import net.jahhan.commonservice.dingtalk.vo.ivo.CreateChatIVO;
import net.jahhan.commonservice.dingtalk.vo.ivo.SendChatIVO;
import net.jahhan.commonservice.dingtalk.vo.ivo.UpdateChatIVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.CreateChatOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.GetChatInfoOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.ResponseOVO;

@Path("/chat")
@Consumes({ ContentType.APPLICATION_JSON_UTF_8 })
@Produces({ ContentType.APPLICATION_JSON_UTF_8 })
@Api("群会话接口")
public interface ChatIntf {
    @POST
    @Path("create")
    @ApiOperation(value = "创建会话")
    public CreateChatOVO createChat(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "会话内容不能为空") CreateChatIVO createChatIVO
    );

    @POST
    @Path("update")
    @ApiOperation(value = "修改会话")
    public ResponseOVO updateChat(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "会话内容不能为空") UpdateChatIVO updateChatIVO
    );

    @GET
    @Path("get")
    @ApiOperation(value = "获取会话")
    public GetChatInfoOVO getChat(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @QueryParam(value = "chatid") @NotNull(message = "chatid不能为空") @ApiParam(value = "群会话id") String chatid
    );

    @POST
    @Path("send")
    @ApiOperation(value = "发送群消息")
    public ResponseOVO sendGroupChat(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "群消息内容不能为空") SendChatIVO sendChatIVO
    );
}
