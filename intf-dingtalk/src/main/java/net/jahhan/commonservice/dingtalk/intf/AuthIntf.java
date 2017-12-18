package net.jahhan.commonservice.dingtalk.intf;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.jahhan.common.extension.constant.ContentType;
import net.jahhan.commonservice.dingtalk.vo.ovo.AuthScopesOVO;

@Path("/auth")
@Consumes({ ContentType.APPLICATION_JSON_UTF_8 })
@Produces({ ContentType.APPLICATION_JSON_UTF_8 })
@Api("权限接口")
public interface AuthIntf {
    @GET
    @Path("scopes")
    @ApiOperation(value = "获取通讯录权限")
    public AuthScopesOVO addressBookAuthScopes(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken
    );
}
