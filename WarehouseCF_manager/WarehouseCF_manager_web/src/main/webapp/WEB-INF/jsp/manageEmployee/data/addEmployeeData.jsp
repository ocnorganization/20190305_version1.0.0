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
<%--<form id="addForm" method="post">--%>
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
<%--<form id="addForm" method="post">--%>
    <%--<div>--%>
        <%--<label for="staffId" >员工编号:</label>--%>
        <%--<input class="easyui-validatebox" type="text" name="staffId" data-options="required:true" />--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<label for="staffName">员工姓名:</label>--%>
        <%--<input class="easyui-validatebox" type="text" name="staffName" data-options="required:true" />--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<label for="staffGender">员工性别:</label>--%>
        <%--<input class="easyui-validatebox" type="text" name="staffGender" data-options="required:true" />--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<label for="staffPosition">员工职位:</label>--%>
        <%--<input class="easyui-validatebox" type="text" name="staffPosition" data-options="required:true" />--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<label for="staffPower">员工权限:</label>--%>
        <%--<input class="easyui-validatebox" type="text" name="staffPower" data-options="required:true" />--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<a type="submit" href="#" class="easyui-linkbutton" plain="true" style="background-color: #6a6a6a;color: #ffffff" onclick="doAdd()">添加</a>--%>
    <%--</div>--%>

<%--</form>--%>

    <%--<div>--%>
        <%--<span style="color: #6a6a6a">员工编号</span>--%>
        <%--<input id="staffId">--%>
        <%--<span style="color: #6a6a6a">员工姓名</span>--%>
        <%--<input id="staffName">--%>
        <%--<span style="color: #6a6a6a">性别</span>--%>
        <%--<input id="staffGender">--%>
        <%--<span style="color: #6a6a6a">职位</span>--%>
        <%--<input id="staffPosition">--%>
        <%--<span style="color: #6a6a6a">权限</span>--%>
        <%--<input id="staffPower">--%>
        <%--<a id="btn" href="#" class="easyui-linkbutton" plain="true" style="background-color: #6a6a6a;color: #ffffff" onclick="saveReport()">添加</a>--%>
    <%--</div>--%>
<script type="text/javascript">
    function sub() {
        $.ajax({
            cache: true,
            type: "POST",
            url:"/index/getMenus/addEmployeeData/addForm",
            data:$('#addForm').serialize(),// 你的formid
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
<script type="text/javascript">
    // function doAdd(){
    //     alert("ssssss");
    //     $('#addForm').form('submit',{
    //         url:'/index/getMenus/addEmployeeData/addForm',
    //         onSubmit:function (param) {
    //             param.staffId = 'staffId';
    //             param.staffName = 'staffName';
    //             param.staffGender = 'staffGender';
    //             param.staffPosition = 'staffPosition';
    //             param.staffPower = 'staffPower';
    //         },
    //         success:function (data) {
    //             alert(data)
    //         }
    //     });
    // }

    // $('#addForm').form({
    //     success:function(data){
    //         $.messager.alert('Info', data, 'info');
    //     }
    // });

    // function doAdd(){
    //         staffId:$('#staffId').val(),
    //         staffName:$('#staffName').val()
    //
//     function saveReport() {
//         alert("ssss");
// //jquery 表单提交
//         $("#addForm").onsubmit(function(message) {
// // 对于表单提交成功后处理，message为提交页面saveReport.htm的返回内容
//         });
//         return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
//     }
//     $('#addForm').form({
//         url:'/index/getMenus/addEmployeeData/addForm',
//         onSubmit: function(){
//             // do some check
//             // return false to prevent submit;
//         },
//         success:function(data){
//             alert(data)
//         }
//     });
//     // submit the form
//     $('#addForm').submit();
</script>
</html>
