<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" import="java.lang.String" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
      + request.getServerName() + ":" + request.getServerPort()
      + path + "/";
%>
<%
  String couponType = request.getParameter("COUPONTYPE");
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <base href="<%=basePath%>">
  <!-- 下拉框 -->
  <link rel="stylesheet" href="static/ace/css/chosen.css"/>
  <!-- jsp文件头和头部 -->
  <%@ include file="../system/index/top.jsp" %>
  <!-- 日期框 -->
  <link rel="stylesheet" href="static/ace/css/datepicker.css"/>
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
            <!-- 上传表信息 -->
            <table style="margin-top:5px;">
              <tr>
                <td>

                </td>

              </tr>
            </table>
            <!-- 上传卡密详情信息 -->
            <table style="margin-top:5px;">
              <tr>
                <td>
                  <div class="row">
                    <div class="col-lg-12 col-sm-12 col-xs-12">
                      <div class="tabbable">
                        <ul class="nav nav-tabs" id="myTab">
                          <li class="<%="0".equals(couponType) ? "active" : "tab-red" %>">
                            <a data-toggle="tab" onclick="tabCponType(this, '${upload.UPLOADID }', 0);">
                              全部卡券
                            </a>
                          </li>

                          <li class="<%="1".equals(couponType) ? "active" : "tab-red" %>">
                            <a data-toggle="tab" onclick="tabCponType(this, '${upload.UPLOADID }', 1);">
                              中国知网会员卡
                            </a>
                          </li>

                          <li class="<%="2".equals(couponType) ? "active" : "tab-red" %>">
                            <a data-toggle="tab" onclick="tabCponType(this, '${upload.UPLOADID }', 2);">
                              吾喜杂志阅读券
                            </a>
                          </li>

                          <li class="<%="3".equals(couponType) ? "active" : "tab-red" %>">
                            <a data-toggle="tab" onclick="tabCponType(this, '${upload.UPLOADID }', 3);">
                              CNKI学问福利券
                            </a>
                          </li>

                          <li class="<%="4".equals(couponType) ? "active" : "tab-red" %>">
                            <a data-toggle="tab" onclick="tabCponType(this, '${upload.UPLOADID }', 4);">
                              知识超市福利券
                            </a>
                          </li>

                          <li class="<%="5".equals(couponType) ? "active" : "tab-red" %>">
                            <a data-toggle="tab" onclick="tabCponType(this, '${upload.UPLOADID }', 5);">
                              大成编客福利券
                            </a>
                          </li>

                          <li class="<%="6".equals(couponType) ? "active" : "tab-red" %>">
                            <a data-toggle="tab" onclick="tabCponType(this, '${upload.UPLOADID }', 6);">
                              手机知网福利券
                            </a>
                          </li>


                          <%--<c:if test="${cponTypeStr.contains('1') }">
                            <li class="tab-red">
                              <a data-toggle="tab" onclick="tabCponType('${upload.UPLOADID }', 1);">
                                中国知网会员卡
                              </a>
                            </li>
                          </c:if>--%>

                        </ul>

                        <div class="tab-content">
                          <div id="cponAll" class="tab-pane in active">
                            <table id="simple-table" class="table table-striped table-bordered table-hover"
                                   style="margin-top:5px;">
                              <thead>
                              <tr>
                                <th class="center" style="width:50px;">序号</th>
                                <th class="center">福利券名称</th>
                                <th class="center">面值（元）</th>
                                <th class="center">导入数量（张）</th>
                                <th class="center">投放数量（张）</th>
                                <th class="center">剩余数量（张）</th>
                                <th class="center">有效期止</th>
                                <th class="center">投放情况</th>
                                <th class="center">操作</th>
                              </tr>
                              </thead>

                              <tbody>

                              <!-- 开始循环 -->
                              <c:choose>
                                <c:when test="${not empty cponstocklist}">
                                  <c:if test="${QX.cha == 1 }">
                                    <c:forEach items="${cponstocklist}" var="cponstock" varStatus="vs">
                                      <tr>
                                        <td class='center' style="width: 30px;">${vs.index+1}</td>
                                        <td class="center"><a onclick="uploadCponstockDetail('${upload.UPLOADID }', '${cponstock.COUPONID }');">${cponstock.COUPONNAME }</a></td>
                                        <td class="center"><fmt:formatNumber value="${cponstock.COUPONPRICE }" pattern="￥"></fmt:formatNumber></td>
                                        <td class="center">${cponstock.PREPNUMCOUPON }</td>
                                        <td class="center">${cponstock.REALNUMCOUPON }</td>
                                        <td class="center">${cponstock.PREPNUMCOUPON - cponstock.REALNUMCOUPON}</td>
                                        <td class="center"><fmt:formatDate value="${cponstock.VALIDTIMEEND }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                                        <td class="center">
                                          <div class="progress progress-striped active">
                                            <div class="progress-bar progress-bar-success"
                                                 role="progressbar"
                                                 aria-valuenow="${cponstock.REALNUMCOUPON / cponstock.PREPNUMCOUPON }"
                                                 aria-valuemin="0" aria-valuemax="100"
                                                 style="width: ${cponstock.REALNUMCOUPON * 100 / cponstock.PREPNUMCOUPON }%">
                                                <span class="sr-only">
                                                    60% Complete (warning)
                                                </span>
                                            </div>
                                          </div>
                                        </td>
                                        <td class="center">
                                          <a class="btn btn-xs btn-info" onclick="goEditActivity('${upload.UPLOADID }', '${cponstock.COUPONID }');">投放</a>
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
                          </div>

                        </div>
                      </div>
                      <div class="horizontal-space"></div>

                    </div>
                  </div>
                </td>
              </tr>
            </table>
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
<%@ include file="../system/index/foot.jsp" %>
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
  function searchs() {
    top.jzts();
    $("#cponstockForm").submit();
  }

  $(function () {
    //日期框
    $('.date-picker').datepicker({autoclose: true, todayHighlight: true});

    //下拉框
    if (!ace.vars['touch']) {
      $('.chosen-select').chosen({allow_single_deselect: true});
      $(window)
          .off('resize.chosen')
          .on('resize.chosen', function () {
            $('.chosen-select').each(function () {
              var $this = $(this);
              $this.next().css({'width': $this.parent().width()});
            });
          }).trigger('resize.chosen');
      $(document).on('settings.ace.chosen', function (e, event_name, event_val) {
        if (event_name != 'sidebar_collapsed') return;
        $('.chosen-select').each(function () {
          var $this = $(this);
          $this.next().css({'width': $this.parent().width()});
        });
      });
      $('#chosen-multiple-style .btn').on('click', function (e) {
        var target = $(this).find('input[type=radio]');
        var which = parseInt(target.val());
        if (which == 2) $('#form-field-select-4').addClass('tag-input-style');
        else $('#form-field-select-4').removeClass('tag-input-style');
      });
    }


    //复选框全选控制
    var active_class = 'active';
    $('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function () {
      var th_checked = this.checked;//checkbox inside "TH" table header
      $(this).closest('table').find('tbody > tr').each(function () {
        var row = this;
        if (th_checked) $(row).addClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', true);
        else $(row).removeClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', false);
      });
    });
  });

  // 上切换福利券页签
  function tabCponType(even, uploadId, cponType) {
    window.location = '<%=basePath%>stock/uploadCponstockList.do?UPLOADID=' + uploadId + '&COUPONTYPE=' + cponType;
  }

  // 上传卡密详情
  function uploadCponstockDetail(uploadId, couponId) {
    window.location = '<%=basePath%>stock/uploadCardList.do?UPLOADID=' + uploadId + '&COUPONID=' + couponId;
  }

  // 上传卡密详情
  function createActivity(uploadId, couponId) {
    window.location = '<%=basePath%>stock/uploadCardList.do?UPLOADID=' + uploadId + '&COUPONID=' + couponId;
  }

  //修改
  function goEditActivity(uploadId, couponId){
    top.jzts();
    var diag = new top.Dialog();
    diag.Drag=true;
    diag.Title ="资料";
    diag.URL = '<%=basePath%>stock/goEditActivity.do?CARDID='+cardId;
    diag.Width = 800;
    diag.Height = 600;
    diag.CancelEvent = function(){ //关闭事件
      if(diag.innerFrame.contentWindow.document.getElementById('zhongxin').style.display == 'none'){
        nextPage(${page.currentPage});
      }
      diag.close();
    };
    diag.show();
  }



</script>
</html>
