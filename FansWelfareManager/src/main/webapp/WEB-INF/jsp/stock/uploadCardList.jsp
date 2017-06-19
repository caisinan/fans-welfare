<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
      + request.getServerName() + ":" + request.getServerPort()
      + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <base href="<%=basePath%>">
  <!-- 下拉框 -->
  <link rel="stylesheet" href="static/ace/css/chosen.css" />
  <!-- jsp文件头和头部 -->
  <%@ include file="../system/index/top.jsp"%>
  <!-- 日期框 -->
  <link rel="stylesheet" href="static/ace/css/datepicker.css" />
</head>
<body class="no-skin">

<!-- /section:basics/navbar.layout -->
<div class="main-container" id="main-container">
  <!-- /section:basics/sidebar -->
  <div class="main-content">
    <div class="main-content-inner">
      <div class="page-content">
        <div class="row">
          <div class="col-xs-12">

            <!-- 检索  -->
            <form action="/stock/uploadCardList" method="post" name="cardForm" id="cardForm">
              <table style="margin-top:5px;">
                <tr>
                  <td>
                    <div class="nav-search">
									<span class="input-icon">
										<input class="nav-search-input" autocomplete="off" id="nav-search-input" type="text" name="keywords" value="${pd.keywords }" placeholder="这里输入关键词" />
										<i class="ace-icon fa fa-search nav-search-icon"></i>
									</span>
                    </div>
                  </td>
                  <td style="padding-left:2px;"><input class="span10 date-picker" name="lastLoginStart" id="lastLoginStart"  value="${pd.lastLoginStart}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" style="width:88px;" placeholder="开始日期" title="最近登录开始"/></td>
                  <td style="padding-left:2px;"><input class="span10 date-picker" name="lastLoginEnd" name="lastLoginEnd"  value="${pd.lastLoginEnd}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" style="width:88px;" placeholder="结束日期" title="最近登录结束"/></td>
                  <td style="vertical-align:top;padding-left:2px;">
                    <select class="chosen-select form-control" name="ROLE_ID" id="role_id" data-placeholder="请选择角色" style="vertical-align:top;width: 120px;">
                      <option value=""></option>
                      <option value="">全部</option>
                      <c:forEach items="${roleList}" var="role">
                        <option value="${role.ROLE_ID }" <c:if test="${pd.ROLE_ID==role.ROLE_ID}">selected</c:if>>${role.ROLE_NAME }</option>
                      </c:forEach>
                    </select>
                  </td>
                  <c:if test="${QX.cha == 1 }">
                    <td style="vertical-align:top;padding-left:2px;"><a class="btn btn-light btn-xs" onclick="searchs();"  title="检索"><i id="nav-search-icon" class="ace-icon fa fa-search bigger-110 nav-search-icon blue"></i></a></td>
                    <c:if test="${QX.toExcel == 1 }"><td style="vertical-align:top;padding-left:2px;"><a class="btn btn-light btn-xs" onclick="toExcel();" title="导出到EXCEL"><i id="nav-search-icon" class="ace-icon fa fa-download bigger-110 nav-search-icon blue"></i></a></td></c:if>
                    <c:if test="${QX.FromExcel == 1 }"><td style="vertical-align:top;padding-left:2px;"><a class="btn btn-light btn-xs" onclick="fromExcel();" title="从EXCEL导入"><i id="nav-search-icon" class="ace-icon fa fa-cloud-upload bigger-110 nav-search-icon blue"></i></a></td></c:if>
                  </c:if>
                </tr>
              </table>
              <!-- 检索  -->

              <table id="simple-table" class="table table-striped table-bordered table-hover"  style="margin-top:5px;">
                <thead>
                <tr>
                  <th class="center" style="width:50px;">序号</th>
                  <th class="center">编号</th>
                  <th class="center">名称</th>
                  <th class="center">价格</th>
                  <th class="center">状态</th>
                  <th class="center">卡号</th>
                  <th class="center">密码</th>
                  <th class="center">导入时间</th>
                  <th class="center">有效期起</th>
                  <th class="center">有效期止</th>
                  <th class="center">发放时间</th>
                  <th class="center">激活时间</th>
                  <th class="center">是否有效</th>
                  <th class="center">是否激活</th>
                  <th class="center">操作</th>
                </tr>
                </thead>

                <tbody>

                <!-- 开始循环 -->
                <c:choose>
                  <c:when test="${not empty cardList}">
                    <c:if test="${QX.cha == 1 }">
                      <c:forEach items="${cardList}" var="card" varStatus="vs">

                        <tr>
                          <td class='center' style="width: 30px;">${vs.index+1}</td>
                          <td class="center">${card.CARDID }</td>
                          <td class="center">${card.COUPONNAME }</td>
                          <td class="center">${card.COUPONPRICE }</td>
                          <td class="center">${card.CARDSTATE }</td>
                          <td class="center">${card.CARDCODE }</td>
                          <td class="center">${card.CARDPWD }</td>
                          <td class="center"><fmt:formatDate value="${card.CREATETIME }" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
                          <td class="center"><fmt:formatDate value="${card.VALIDTIMESTART }" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
                          <td class="center"><fmt:formatDate value="${card.VALIDTIMEEND }" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
                          <td class="center"><fmt:formatDate value="${card.CARDGRANTTIME }" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
                          <td class="center"><fmt:formatDate value="${card.CARDVALIDTIME }" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
                          <td class="center">${card.ISVALID }</td>
                          <td class="center">${card.ISACTIVE }</td>
                          <td class="center">
                            <c:if test="${QX.edit != 1 && QX.del != 1 }">
                              <span class="label label-large label-grey arrowed-in-right arrowed-in"><i class="ace-icon fa fa-lock" title="无权限"></i></span>
                            </c:if>
                            <div class="hidden-sm hidden-xs btn-group">
                              <c:if test="${QX.edit == 1 }">
                                <a class="btn btn-xs btn-success" title="编辑" onclick="editUser('${user.USER_ID}');">
                                  <i class="ace-icon fa fa-pencil-square-o bigger-120" title="编辑"></i>
                                </a>
                              </c:if>
                              <c:if test="${QX.del == 1 }">
                                <a class="btn btn-xs btn-danger" onclick="delUser('${user.USER_ID }','${user.USERNAME }');">
                                  <i class="ace-icon fa fa-trash-o bigger-120" title="删除"></i>
                                </a>
                              </c:if>
                            </div>
                          </td>
                        </tr>

                      </c:forEach>
                    </c:if>
                    <c:if test="${QX.cha == 0 }">
                      <tr>
                        <td colspan="10" class="center">您无权查看</td>
                      </tr>
                    </c:if>
                  </c:when>
                  <c:otherwise>
                    <tr class="main_info">
                      <td colspan="10" class="center">没有相关数据</td>
                    </tr>
                  </c:otherwise>
                </c:choose>
                </tbody>
              </table>

              <div class="page-header position-relative">
                <table style="width:100%;">
                  <tr>
                    <td style="vertical-align:top;"><div class="pagination" style="float: right;padding-top: 0px;margin-top: 0px;">${page.pageStr}</div></td>
                  </tr>
                </table>
              </div>
            </form>

          </div>
          <!-- /.col -->
        </div>
        <!-- /.row -->
      </div>
      <!-- /.page-content -->
    </div>
  </div>
  <!-- /.main-content -->

  <!-- 返回顶部 -->
  <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
    <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
  </a>

</div>
<!-- /.main-container -->

<!-- basic scripts -->
<!-- 页面底部js¨ -->
<%@ include file="../system/index/foot.jsp"%>
<!-- 删除时确认窗口 -->
<script src="static/ace/js/bootbox.js"></script>
<!-- ace scripts -->
<script src="static/ace/js/ace/ace.js"></script>
<!-- 日期框 -->
<script src="static/ace/js/date-time/bootstrap-datepicker.js"></script>
<!-- 下拉框 -->
<script src="static/ace/js/chosen.jquery.js"></script>
<!--提示框-->
<script type="text/javascript" src="static/js/jquery.tips.js"></script>
</body>

<script type="text/javascript">
  $(top.hangge());

  //检索
  function searchs(){
    top.jzts();
    $("#cardForm").submit();
  }

  //删除
  function delUser(userId,msg){
    bootbox.confirm("确定要删除["+msg+"]吗?", function(result) {
      if(result) {
        top.jzts();
        var url = "<%=basePath%>user/deleteU.do?USER_ID="+userId+"&tm="+new Date().getTime();
        $.get(url,function(data){
          nextPage(${page.currentPage});
        });
      };
    });
  }

  //修改
  function editUser(user_id){
    top.jzts();
    var diag = new top.Dialog();
    diag.Drag=true;
    diag.Title ="资料";
    diag.URL = '<%=basePath%>user/goEditU.do?USER_ID='+user_id;
    diag.Width = 469;
    diag.Height = 510;
    diag.CancelEvent = function(){ //关闭事件
      if(diag.innerFrame.contentWindow.document.getElementById('zhongxin').style.display == 'none'){
        nextPage(${page.currentPage});
      }
      diag.close();
    };
    diag.show();
  }


  $(function() {
    //日期框
    $('.date-picker').datepicker({autoclose: true,todayHighlight: true});

    //下拉框
    if(!ace.vars['touch']) {
      $('.chosen-select').chosen({allow_single_deselect:true});
      $(window)
          .off('resize.chosen')
          .on('resize.chosen', function() {
            $('.chosen-select').each(function() {
              var $this = $(this);
              $this.next().css({'width': $this.parent().width()});
            });
          }).trigger('resize.chosen');
      $(document).on('settings.ace.chosen', function(e, event_name, event_val) {
        if(event_name != 'sidebar_collapsed') return;
        $('.chosen-select').each(function() {
          var $this = $(this);
          $this.next().css({'width': $this.parent().width()});
        });
      });
      $('#chosen-multiple-style .btn').on('click', function(e){
        var target = $(this).find('input[type=radio]');
        var which = parseInt(target.val());
        if(which == 2) $('#form-field-select-4').addClass('tag-input-style');
        else $('#form-field-select-4').removeClass('tag-input-style');
      });
    }

  });


</script>
</html>
