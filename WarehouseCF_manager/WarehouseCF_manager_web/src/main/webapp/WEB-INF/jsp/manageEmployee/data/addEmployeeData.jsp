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

<body class="easyui-layout" style="padding-left: 50px;" data-option="fit:true">
<div data-options="region:'north',title:'',split:false;fit:true" style="width:100%;height:100%;">
    <div style="width: 100%;height:100%;border-radius: 15px;background: #ffffff;padding: 25px;overflow-y: auto">
        <jsp:include page="employeeDataForm.jsp" flush="true"/>
    </div>
</div>

<%--<div data-options="region:'south',title:'',split:false," style="with:100%;height:30%;padding-top: 40px">--%>
<%--<div class="easyui-layout" data-options="fit:true">--%>
<%--<div data-options="region:'west',title:'',split:false">--%>
<%--<div style="width: 30%;height:100%;overflow-y: auto;border-radius: 15px;background: #ffffff;">--%>
<%--welcome--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>

</div>
</body>
</html>
