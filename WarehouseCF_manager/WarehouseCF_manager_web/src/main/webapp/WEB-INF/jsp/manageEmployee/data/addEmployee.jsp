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
    <title>添加员工信息</title>
</head>
<body style="padding-left: 50px">
<table class="easyui-datagrid" style="width:500px;height:600px;" data-options="url:'datagrid_data.json',fitColumns:true,singleSelect:true,">
    <thead>
    <tr>
        <th data-options="field:'code',width:100">Code</th>
        <th data-options="field:'name',width:100">Name</th>
        <th data-options="field:'price',width:100">Price</th>
    </tr>
    </thead>
</table>
</body>
</html>
