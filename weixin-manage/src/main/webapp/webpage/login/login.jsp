<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../../context/common.jsp"%>
<html>
<head>
<title>${_currProject }</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel="stylesheet" href="${_currConText }/plug-in/login/css/supersized.css">
<link rel="stylesheet" href="${_currConText }/plug-in/login/css/login.css">
<link href="${_currConText }/plug-in/login/css/bootstrap.min.css" rel="stylesheet">
<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
	<script src="${_currConText }/plug-in/login/js/html5.js"></script>
<![endif]-->
<script src="${_currConText }/plug-in/jquery/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${_currConText }/plug-in/jquery/jquery.form.js"></script>
<script type="text/javascript" src="${_currConText }/plug-in/login/js/tooltips.js"></script>
<script type="text/javascript" src="${_currConText }/plug-in/login/js/login.js"></script>
</head>
<body>
<div class="page-container">
	<div class="main_box">
		<div class="login_box">
			<div class="login_logo">
				<label><span>微信后台管理系统登录</span></label> 
			</div>
		
			<div class="login_form">
				<form action="loginController.shtml?doLogin" id="login_form" method="post"
					check="loginController.shtml?checkuser" >
					<div class="form-group">
						<label for="userName" class="t">账　号</label>
						<input id="userName" name="userName" type="text" 
							class="userName form-control x319 in" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="password" class="t">密　码</label> 
						<input id="password" value="" name="password" type="password" 
						class="password form-control x319 in">
					</div>
					<div class="form-group">
						<label for="captcha" class="t">验证码</label>
						<input id="captcha" name="captcha" value="" type="text" 
							class="form-control x164 in" autocomplete="off">
						<img id="captcha_img" alt="点击更换" title="看不清？换一张试试" 
							src="${_currConText }/plug-in/login/images/imageCaptcha.jsp" 
							onclick="javascript:loadimage(); return false;" class="m">
					</div>
					<div class="form-group space">
						<label class="t"></label>　　　
						<button type="button"  id="submit_btn" 
						class="btn btn-primary btn-lg">&nbsp;登&nbsp;录&nbsp; </button>
						<input type="reset" value="&nbsp;重&nbsp;置&nbsp;" class="btn btn-default btn-lg">
					</div>
				</form>
			</div>
		</div>
		<div class="bottom">Copyright &copy; 2016 - 2017 </div>
	</div>
</div>

<!-- Javascript -->

<script src="${_currConText }/plug-in/login/js/supersized.3.2.7.min.js"></script>
<script src="${_currConText }/plug-in/login/js/supersized-init.js"></script>
<script src="${_currConText }/plug-in/login/js/scripts.js"></script>
<script src="${_currConText }/plug-in/login/js/jquery-jrumble.js"></script>
</body>
</html>