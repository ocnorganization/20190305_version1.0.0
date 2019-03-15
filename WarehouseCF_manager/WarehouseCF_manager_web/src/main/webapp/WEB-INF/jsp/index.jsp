<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
    <head>
        <title>XXX后台管理系统(OCNOrganization)</title>
        <link rel="stylesheet" type="text/css" href="css/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
        <script type="text/javascript" src="js/jquery.min.js">
        </script>
        <script type="text/javascript" src="js/jquery.easyui.min.js">
        </script>
    </head>
    <body class="easyui-layout">
        <div data-options="region:'north',title:'',split:false" style="height:100px;">

        </div>
        <div data-options="region:'south',title:'',split:true,maxHeight:50" style="height:100px;"></div>
        <div data-options="region:'west',title:'菜单',split:true,minWidth:180" style="width:100px;">
            <ul id='home-tree'></ul>
        </div>
        <div data-options="region:'center',title:''" style="padding:5px;background:#eee;">
            <div id="tabs" class="easyui-tabs">
                <div title="首页" style="padding:20px;display:none;">
                    欢迎使用XXX后台管理系统
                </div>

            </div>
        </div>
    </body>
</html>
<script type="text/javascript">
    $(function(){
        $('#home-tree').tree({
            url : '${path}/index/getMenus',
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
                    alert('${path}/index/getMenus/addNewEmployee')
                    tabs.tabs('add',{
                        title:node.text,
                        href:'/index/getMenus/addNewEmployee',
                        closable:true,
                        // tools:[{
                        //     iconCls:'icon-mini-refresh',
                        //     handler:function(){
                        //         alert('refresh');
                        //     }
                        // }]
                    });
            }
            }
        }
    });
</script>