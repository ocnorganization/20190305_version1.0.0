<%--
  Created by IntelliJ IDEA.
  User: 那边那个熊猫
  Date: 2019/3/16
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息表</title>
    <style>
        .div-search{
            /*background: #6a6a6a;*/
            background-color: #6a6a6a;

        }
    </style>
</head>
<body>
<div id="#tb" style="height: 10%;width:100%">
    <span style="color: #6a6a6a">员工编号</span>
    <input id="staffId">
    <span style="color: #6a6a6a">员工姓名</span>
    <input id="staffName">
    <a href="#" class="easyui-linkbutton" plain="true" style="background-color: #6a6a6a;color: #ffffff" onclick="doSearch()">搜索</a>
</div>
<div style="height: 90%;width:100%;margin: 0 auto">
    <%--表格可以适应窗口变化--%>
    <table id="user_charts" style="height:100%;width: 100%"></table>
</div>
</body>
<script type="text/javascript">
    $('#user_charts').datagrid({
        toolbar:"#tb",
        pagination:true,
        fitColumns:true,
        url:'/index/getMenus/loadEmployeeData/getTableDataByPage',
        striped:true,
        columns:[[
            {field:'staffId',title:'员工编号',width:100},
            {field:'staffName',title:'员工姓名',width:100},
            {field:'staffGender',title:'员工性别',width:100},
            {field:'staffPosition',title:'员工职位',width:100},
            {field:'staffPower',title:'员工权限等级',width:100}
        ]]
    });
    function doSearch(){
        $('#user_charts').datagrid('load',{
            staffId:$('#staffId').val(),
            staffName:$('#staffName').val()
        });
    }

</script>
</html>
