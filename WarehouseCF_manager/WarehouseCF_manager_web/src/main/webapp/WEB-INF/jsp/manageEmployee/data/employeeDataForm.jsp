<%--
  ~ Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
  ~ Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
  ~ Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
  ~ Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
  ~ Vestibulum commodo. Ut rhoncus gravida arcu.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: 那边那个熊猫
  Date: 2019/3/26
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="height: 100%;width:50%;margin: 0 auto;text-align: center;">
    <%--<div style="background-color: #ffffff;height: 10%;width: 100%">--%>

    <%--</div>--%>
    <form id="addForm" method="post" style="height:100%;width: 100%;text-align: center;background-color: #ebebeb;padding-top: 40px;font-size: 15px" onsubmit="return sub();">
        <div style="padding: 5px;color: #6a6a6a">
            <label for="staffId">员工编号:</label>
            <input class="easyui-validatebox"  type="text" name="staffId" data-options="required:true" />
        </div>
        <div style="padding: 5px;color: #6a6a6a">
            <label for="staffName">员工姓名:</label>
            <input class="easyui-validatebox"  type="text" name="staffName" data-options="required:true" />
        </div>
        <div style="padding: 5px;color: #6a6a6a">
            <label for="staffGender">员工性别:</label>
            <input class="easyui-validatebox" type="text" name="staffGender" data-options="required:false" />
        </div>
        <div style="padding: 5px;color: #6a6a6a">
            <label for="staffPosition">员工职位:</label>
            <input class="easyui-validatebox"  type="text" name="staffPosition" data-options="required:false" />
        </div>
        <div style="padding: 5px;color: #6a6a6a">
            <label for="staffPower">员工权限:</label>
            <input class="easyui-validatebox"  type="text" name="staffPower" data-options="required:true" />
        </div>
        <div style="padding: 5px;color: #6a6a6a">
            <a href="#"  type="submit" class="easyui-linkbutton" plain="true" style="background-color: #6a6a6a;color: #ffffff" onclick="sub()">添加</a>
            <a href="#"  type="submit" class="easyui-linkbutton" plain="true" style="background-color: #6a6a6a;color: #ffffff" onclick="clean()">重置</a>
        </div>
        <%--<table style="margin: 0 auto;text-align: center;">--%>
            <%--<tr>--%>
                <%--<td>员工编号:</td>--%>
                <%--<td><input name="staffId" type="text"></input></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>员工姓名:</td>--%>
                <%--<td><input name="staffName" type="text"></input></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>员工性别:</td>--%>
                <%--<td><input name="staffGender" type="text"></input></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>员工职位:</td>--%>
                <%--<td><input name="staffPosition" type="text"></input></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>员工权限:</td>--%>
                <%--<td><input name="staffPower" type="text"></input></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td></td>--%>
                <%--<td><input type="submit" value="添加"></input></td>--%>
            <%--</tr>--%>
        <%--</table>--%>
    </form>
</div>
<script type="text/javascript">
    function sub() {
        $.ajax({
            cache: true,
            type: "POST",
            url:"/index/getMenus/addEmployeeData/addForm",
            data:$('#addForm').serialize(),
            async: false,
            error: function(request) {
                alert("Connection error:"+request.error);
            },
            success: function(data) {
                var flag = data;
                if(flag == "SUCCESS"){
                    alert("SUCCESS!");
                }
                else{
                    alert(flag);
                }

            }
        });
    }
</script>
</body>
</html>
