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
              <input type="hidden" name="UPLOADID" value="${pd.UPLOADID }"> <!-- 上传表id  -->
              <input type="hidden" name="COUPONID" value="${pd.COUPONID }"><!-- 福利券类别id  -->
              <input type="hidden" name="CARDSTATE" value="${pd.CARDSTATE }"><!-- 福利券状态  -->
              <table style="margin-top:5px;">
                <tr>
                  <td style="vertical-align:top;padding-left:2px;">
                    <label>福利券状态：</label>
                    <select class="chosen-select form-control" name="CARDSTATE" id="cardState" data-placeholder="请选择状态" style="vertical-align:top;width: 120px;">
                      <option value=""></option>
                      <option value="">全部</option>
                      <option value="0" <c:if test="${pd.CARDSTATE=='0'}">selected</c:if>>已导入</option>
                      <option value="1" <c:if test="${pd.CARDSTATE=='1'}">selected</c:if>>已投放</option>
                      <option value="2" <c:if test="${pd.CARDSTATE=='2'}">selected</c:if>>已发放</option>
                    </select>
                  </td>
                  <c:if test="${QX.cha == 1 }">
                    <td style="vertical-align:top;padding-left:2px;">
                    <td style="vertical-align:top;padding-left:2px;"><a class="btn btn-light btn-xs" onclick="searchs();"  title="检索"><i id="nav-search-icon" class="ace-icon fa fa-search bigger-110 nav-search-icon blue"></i></a></td>
                  </c:if>
                </tr>
              </table>
              <!-- 检索  -->

              <table id="simple-table" class="table table-striped table-bordered table-hover"  style="margin-top:5px;">
                <thead>
                <tr>
                  <th class="center" style="width:50px;">序号</th>
                  <th class="center">名称</th>
                  <th class="center">面值</th>
                  <th class="center">卡号</th>
                  <th class="center">有效期</th>
                  <th class="center">导入时间</th>
                  <th class="center">状态</th>
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
                          <td class="center">${card.COUPONNAME }</td>
                          <td class="center"><fmt:formatNumber value="${card.COUPONPRICE }" pattern="￥"></fmt:formatNumber></td>
                          <td class="center">${card.CARDCODE }</td>
                          <td class="center"><fmt:formatDate value="${card.VALIDTIMESTART }" pattern="yyyy/MM/dd"/> - <fmt:formatDate value="${card.VALIDTIMEEND }" pattern="yyyy/MM/dd"/> </td>
                          <td class="center"><fmt:formatDate value="${card.CREATETIME }" pattern="yyyy/MM/dd"/> </td>
                          <td class="center">
                            <c:if test="${card.CARDSTATE == '0'}">已导入</c:if>
                            <c:if test="${card.CARDSTATE == '1'}">已投放</c:if>
                            <c:if test="${card.CARDSTATE == '2'}">已发放</c:if>
                            <c:if test="${card.CARDSTATE == '3'}">已充值</c:if>
                            <c:if test="${card.CARDSTATE == '4'}">已过期</c:if>
                            <c:if test="${card.CARDSTATE == '5'}">回收站</c:if>
                          </td>
                          <td class="center">
                            <c:if test="${QX.edit != 1 && QX.del != 1 }">
                              <span class="label label-large label-grey arrowed-in-right arrowed-in"><i class="ace-icon fa fa-lock" title="无权限"></i></span>
                            </c:if>
                            <div class="hidden-sm hidden-xs btn-group">
                              <c:if test="${QX.edit == 1 }">
                                <a class="btn btn-xs btn-success" title="编辑" onclick="editCard('${card.CARDID}');">
                                  <i class="ace-icon fa fa-pencil-square-o bigger-120" title="编辑"></i>
                                </a>
                              </c:if>
                              <c:if test="${QX.del == 1 }">
                                <a class="btn btn-xs btn-danger" onclick="delCard('${user.USER_ID }','${card.CARDID }');">
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
  function editCard(cardId){
    top.jzts();
    var diag = new top.Dialog();
    diag.Drag=true;
    diag.Title ="资料";
    diag.URL = '<%=basePath%>stock/goEditCard.do?CARDID='+cardId;
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

	/**
   * 卡密状态
   * @param state
   */
  function cardState(state){
    switch (state){
      case "0":
        return "已导入";
      case "1":
        return "已投放";
      case "2":
        return "已发放";
      case "3":
        return "已充值";
      case "4":
        return "已过期";
      case "5":
        return "回收站";
      default:
        return "已导入";
    }
  }

</script>
</html>
