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
import net.jahhan.commonservice.dingtalk.vo.ivo.BatchUserIdIVO;
import net.jahhan.commonservice.dingtalk.vo.ivo.UserInfoIVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.GetAdminUserOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.GetUserOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.ListDepartmentUserInfoOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.ResponseOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.SimpleUserOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.UserIdOVO;

@Path("user")
@Consumes({ ContentType.APPLICATION_JSON_UTF_8 })
@Produces({ ContentType.APPLICATION_JSON_UTF_8 })
@Api("成员接口")
public interface UserIntf {
    @GET
    @Path("getUseridByUnionId")
    @ApiOperation(value = "根据unionid获取成员的userid")
    public UserIdOVO getUseridByUnionId(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @QueryParam(value = "unionid") @NotNull(message = "unionid不能为空") @ApiParam(value = "用户在当前钉钉开放平台账号范围内的唯一标识") String unionId
    );

    @GET
    @Path("get")
    @ApiOperation(value = "获取成员详情")
    public GetUserOVO getUserDetailInfo(
        @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
        @QueryParam(value = "userid") @NotNull(message = "userid不能为空") @ApiParam(value = "员工ID") String userId,
        @QueryParam(value = "lang") @ApiParam(value = "通讯录语言(默认zh_CN，支持en_US)") String lang
    );

    @POST
    @Path("create")
    @ApiOperation(value = "创建成员")
    public UserIdOVO createUserInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "成员信息不能为空") UserInfoIVO userInfoIVO
    );

    @POST
    @Path("update")
    @ApiOperation(value = "更新成员")
    public ResponseOVO updateUserInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @QueryParam(value = "lang") @ApiParam(value = "通讯录语言(默认zh_CN另外支持en_US)") String lang,
            @NotNull(message = "成员信息不能为空") UserInfoIVO userInfoIVO
    );

    @GET
    @Path("delete")
    @ApiOperation(value = "删除成员")
    public ResponseOVO deleteUserInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @QueryParam(value = "userid") @NotNull(message = "userid不能为空") @ApiParam(value = "员工唯一标识ID") String unionId
    );

    @POST
    @Path("batchdelete")
    @ApiOperation(value = "批量删除成员")
    public ResponseOVO batchdeleteUserInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "成员id不能为空") BatchUserIdIVO batchUserIdIVO
    );

    @GET
    @Path("simplelist")
    @ApiOperation(value = "获取部门成员")
    public SimpleUserOVO listSimpleDepartmentUserInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @QueryParam(value = "lang")  @ApiParam(value = "通讯录语言(默认zh_CN另外支持en_US)") String lang,
            @QueryParam(value = "department_id") @NotNull(message = "department_id不能为空") @ApiParam(value = "部门id") Long departmentId,
            @QueryParam(value = "offset") @ApiParam(value = "偏移量") Long offset,
            @QueryParam(value = "size") @ApiParam(value = "分页大小，最大100") Integer size,
            @QueryParam(value = "order") @ApiParam(value = "排序(如modify_desc代表按照部门信息修改时间降序)") String order
    );

    @GET
    @Path("list")
    @ApiOperation(value = "获取部门成员详情")
    public ListDepartmentUserInfoOVO listDepartmentUserDetailInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @QueryParam(value = "lang")  @ApiParam(value = "通讯录语言(默认zh_CN另外支持en_US)") String lang,
            @QueryParam(value = "department_id") @NotNull(message = "department_id不能为空") @ApiParam(value = "部门id") Long departmentId,
            @QueryParam(value = "offset") @ApiParam(value = "偏移量") @NotNull(message = "offset不能为空") Long offset,
            @QueryParam(value = "size") @ApiParam(value = "分页大小，最大100") @NotNull(message = "size不能为空") Integer size,
            @QueryParam(value = "order") @ApiParam(value = "排序(如modify_desc代表按照部门信息修改时间降序)") String order
    );

    @GET
    @Path("get_admin")
    @ApiOperation(value = "获取管理员列表")
    public GetAdminUserOVO getAdminList(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken
    );
}
