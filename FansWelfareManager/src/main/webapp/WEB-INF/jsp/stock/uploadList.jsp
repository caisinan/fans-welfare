<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

            <!-- 检索  -->
            <form action="/stock/uploadList.do" method="post" name="uploadForm" id="uploadForm">
              <table style="margin-top:5px;">
                <tr>
                  <td>
                    <div class="nav-search">
									<span class="input-icon">
										<input class="nav-search-input" autocomplete="off" id="nav-search-input"
                           type="text" name="keywords" value="${pd.keywords }"
                           placeholder="这里输入关键词"/>
										<i class="ace-icon fa fa-search nav-search-icon"></i>
									</span>
                    </div>
                  </td>
                  <td style="padding-left:2px;"><input class="span10 date-picker"
                                                       name="lastLoginStart" id="lastLoginStart"
                                                       value="${pd.lastLoginStart}" type="text"
                                                       data-date-format="yyyy-mm-dd"
                                                       readonly="readonly" style="width:88px;"
                                                       placeholder="开始日期" title="最近登录开始"/></td>
                  <td style="padding-left:2px;"><input class="span10 date-picker" name="lastLoginEnd"
                                                       name="lastLoginEnd" value="${pd.lastLoginEnd}"
                                                       type="text" data-date-format="yyyy-mm-dd"
                                                       readonly="readonly" style="width:88px;"
                                                       placeholder="结束日期" title="最近登录结束"/></td>
                  <c:if test="${QX.cha == 1 }">
                    <td style="vertical-align:top;padding-left:2px;"><a class="btn btn-light btn-xs"
                                                                        onclick="searchs();"
                                                                        title="检索"><i
                        id="nav-search-icon"
                        class="ace-icon fa fa-search bigger-110 nav-search-icon blue"></i></a>
                    </td>
                    <c:if test="${QX.FromExcel == 1 }">
                      <td style="vertical-align:top;padding-left:2px;"><a
                          class="btn btn-light btn-xs" onclick="fromExcel();"
                          title="从EXCEL导入"><i id="nav-search-icon-excel"
                                              class="ace-icon fa fa-cloud-upload bigger-110 nav-search-icon blue"></i></a>
                      </td>
                    </c:if>
                  </c:if>
                </tr>
              </table>
              <!-- 检索  -->

              <table id="simple-table" class="table table-striped table-bordered table-hover"
                     style="margin-top:5px;">
                <thead>
                <tr>
                  <th class="center" style="width:50px;">序号</th>
                  <th class="center">导入批号</th>
                  <th class="center">文件名称</th>
                  <th class="center">导入时间</th>
                  <th class="center">导入总量</th>
                  <th class="center"><i class="ace-icon fa fa-envelope-o"></i>投放数量</th>
                  <th class="center"><i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>操作人员
                  </th>
                  <th class="center">投放情况</th>
                  <th class="center">操作</th>
                </tr>
                </thead>

                <tbody>

                <!-- 开始循环 -->
                <c:choose>
                  <c:when test="${not empty uploadList}">
                    <c:if test="${QX.cha == 1 }">
                      <c:forEach items="${uploadList}" var="upload" varStatus="vs">
                        <tr>
                          <td class='center' style="width: 30px;">${vs.index+1}</td>
                          <td class="center">${upload.UPLOADCODE }</td>
                          <td class="center">${upload.FILENAME }</td>
                          <td class="center"><fmt:formatDate value="${upload.UPLOADTIME }"
                                                             pattern="yyyy-MM-dd HH:mm:ss"/></td>
                          <td class="center">${upload.UPLOADNUM }</td>
                          <td class="center">${upload.INVESTNUM }</td>
                          <td class="center">${upload.OPERATOR}</td>
                          <td class="center">
                            <div class="progress progress-striped active">
                              <div class="progress-bar progress-bar-success"
                                   role="progressbar"
                                   aria-valuenow="${upload.INVESTNUM / upload.UPLOADNUM }"
                                   aria-valuemin="0" aria-valuemax="100"
                                   style="width: ${upload.INVESTNUM * 100 / upload.UPLOADNUM }%">
                                                <span class="sr-only">
                                                    60% Complete (warning)
                                                </span>
                              </div>
                            </div>
                          </td>
                          <td class="center">
                            <a class="btn btn-xs btn-info"
                               onclick="uploadDetail('${upload.UPLOADID }');">
                              详情
                            </a>
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
                    <td style="vertical-align:top;">
                      <div class="pagination"
                           style="float: right;padding-top: 0px;margin-top: 0px;">${page.pageStr}</div>
                    </td>
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
    $("#uploadForm").submit();
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

  //打开上传excel页面
  function fromExcel() {
    top.jzts();
    var diag = new top.Dialog();
    diag.Drag = true;
    diag.Title = "EXCEL 导入到数据库";
    diag.URL = '<%=basePath%>stock/goUploadExcel.do';
    diag.Width = 300;
    diag.Height = 150;
    diag.CancelEvent = function () { //关闭事件
      if (diag.innerFrame.contentWindow.document.getElementById('zhongxin').style.display == 'none') {
        if ('${page.currentPage}' == '0') {
          top.jzts();
          setTimeout("self.location.reload()", 100);
        } else {
          nextPage(${page.currentPage});
        }
      }
      diag.close();
    };
    diag.show();
  }

  // 上传记录详情
  function uploadDetail(uploadId) {
    window.location = '<%=basePath%>stock/uploadCponstockList.do?UPLOADID=' + uploadId + '&COUPONTYPE=0';
  }

</script>
</html>
