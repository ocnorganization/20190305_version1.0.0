<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
    <head>
        <title>XXX后台管理系统(OCNOrganization)</title>
        <link rel="stylesheet" type="text/css" href="css/themes/alex/easyui.css">
        <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
        <script type="text/javascript" src="js/jquery.min.js">
        </script>
        <script type="text/javascript" src="js/jquery.easyui.min.js">
        </script>
        <style>
            .icon{
                font-size: 60px;
                font-weight: lighter;
                text-align:center;
            }
            .title{
                font-size: 30px;
                font-weight: bold;
                text-align:left;
                vertical-align: middle;
                color: #4c4c4c;
            }
            .border-radius{
                border-radius: 15px 15px 15px 15px;
            }
        </style>
    </head>
    <body class="easyui-layout">
        <div data-options="region:'north',title:'',split:false," style="height:80px;">
            <div class="easyui-layout" style="height:100%;background: #ffffff">
                <%--data-options="fit:true"--%>
                <div data-options="region:'west',title:'',split:false,boder:false" style="width:12%;background: #324972;border-bottom: #aab9d0;border-bottom-style: solid;border-bottom-width: thin">
                    <div class="icon">◎</div>
                </div>
                <div data-options="region:'east',title:'',split:false,boder:false" style="width:88%;background: #ffffff">
                    <div class="title" style="padding-left: 10px;padding-top: 20px">OCNOrganization</div>
                </div>
                <%--324972--%>
            </div>
        </div>
        <%--<div data-options="region:'south',split:false,maxHeight:50" style="height:100px;"></div>--%>
        <div data-options="region:'west',split:false" style="width:12%;background: #324972;">
            <ul id='home-tree'></ul>
        </div>

        <%--页面中心布局--%>
        <div data-options="region:'center',split:false," style="width:88%;height:100%;background: #ebebeb">
            <div id="tabs" class="easyui-tabs" style="padding-left: 50px;padding-right: 50px;padding-bottom: 50px;padding-top: 10px;width: auto;height: 100%;background: transparent">
                <div title="首页" class="border-radius" style="padding:20px;background: #ffffff">
                    欢迎使用XXX后台管理系统
                </div>
            </div>
        </div>
    </body>
    <script type="text/javascript">
        $(function(){
            $('#home-tree').tree({
                <%--url : '${path}/index/getMenus',--%>
                url : '${path}/index/getEasyUITree',
            });
        });
        $('#home-tree').tree({
            onClick: function(node){
                if($('#home-tree').tree('isLeaf',node.target)){
                    var tabs = $("#tabs");
                    var tab = tabs.tabs("getTab",node.text);
                    if(tab){
                        tabs.tabs("select",node.text)
                    }else{
                        // 添加一个新的标签页面板（tab panel）
                        tabs.tabs('add',{
                            title:node.text,
                            href:node.attributes.url,
                            closable:true,
                        });
                    }
                }
            }
        });
    </script>
</html>
