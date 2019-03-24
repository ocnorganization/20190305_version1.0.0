<%--
  Created by
  User: 那边那个熊猫
  Date: 2019/3/15
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加员工权限</title>
</head>
<body style="background: #ffffff">
<table id="user_chart">
</table>
<script type="text/javascript">
    $('#user_charts').datagrid({
        url:'datagrid_data.json',
        columns:[[
            {field:'code',title:'Code',width:100},
            {field:'name',title:'Name',width:100},
            {field:'price',title:'Price',width:100,align:'right'}
        ]]
    });
</script>
</body>
</html>

