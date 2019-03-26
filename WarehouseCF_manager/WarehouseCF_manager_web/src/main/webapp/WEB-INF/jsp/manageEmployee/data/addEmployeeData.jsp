<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/24
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加员工信息</title>
</head>

<body>
<form id="addForm" method="post"  onsubmit="return sub();">
    <table>
        <tr>
            <td>员工编号:</td>
            <td><input name="staffId" type="text"></input></td>
        </tr>
        <tr>
            <td>员工姓名:</td>
            <td><input name="staffName" type="text"></input></td>
        </tr>
        <tr>
            <td>员工性别:</td>
            <td><input name="staffGender" type="text"></input></td>
        </tr>
        <tr>
            <td>员工职位:</td>
            <td><input name="staffPosition" type="text"></input></td>
        </tr>
        <tr>
            <td>员工权限:</td>
            <td><input name="staffPower" type="text"></input></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="添加"></input></td>
        </tr>
    </table>
</form>
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
