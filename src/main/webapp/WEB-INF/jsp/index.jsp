<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--  <meta http-equiv="refresh" content="3">-->
    <title>同步状态</title>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/process.css" rel="stylesheet">
    <script src="assets/js/ie-emulation-modes-warning.js"></script>
  </head>
  <body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">用户管理</a>
          

        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#"></a></li>
            <li><a href="#">登出</a></li>
          </ul>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
		<div class="main">
          <h2 class="sub-header">运行信息:
          </h2>

          <div class="table-responsive">
			<p>
			<a id="button_stop" class="btn btn-default" role="button">停止 </a>
			<a id="button_pause" class="btn btn-default"  role="button">暂停 </a>
			<a id="button_restart" class="btn btn-default"  role="button">重启 &raquo;</a>
			<a id="button_start" class="btn btn-default"  role="button">开始 &raquo;</a>
			</p>
          </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/ie10-viewport-bug-workaround.js"></script>
    <script src="assets/js/process.js"></script>
  </body>
</html>
