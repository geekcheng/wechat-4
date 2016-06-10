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
<script src="${_currConText }/plug-in/login/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${_currConText }/plug-in/login/js/jquery.form.js"></script>
<script type="text/javascript" src="${_currConText }/plug-in/login/js/tooltips.js"></script>
<script type="text/javascript" src="${_currConText }/plug-in/login/js/login.js"></script>

</head>
<body>
<div class="page-container">
	<div class="main_box">
		<div class="login_box">
			<div class="login_logo">
				<!--  <img src="images/logo.png" > -->
				<label class="t"><h2>后台登录界面模板</h2></label> 
			</div>
		
			<div class="login_form">
				<form action="index.html" id="login_form" method="post">
					<div class="form-group">
							<label for="userName" class="t">账　号</label>
						<input id="userName" value="" name="userName" type="text" class="form-control x319 in" 
						autocomplete="off">
					</div>
					<div class="form-group">
						<label for="password" class="t">密　码</label> 
						<input id="password" value="" name="password" type="password" 
						class="password form-control x319 in">
					</div>
					<div class="form-group">
						<label for="captcha" class="t">验证码</label>
						 <input id="captcha" name="captcha" type="text" class="form-control x164 in">
						<img id="captcha_img" alt="点击更换" title="看不清？换一张试试" src="${_currConText }/plug-in/login/images/imageCaptcha.jsp" 
							onclick="javascript:loadimage();" class="m">
					</div>
					<div class="form-group">
						<label class="t"></label>
						<label for="remember" class="m">
						<input id="remember" type="checkbox" value="true">&nbsp;记住登陆账号!</label>
					</div>
					<div class="form-group space">
						<label class="t"></label>　　　
						<button type="button"  id="submit_btn" 
						class="btn btn-primary btn-lg">&nbsp;登&nbsp;录&nbsp </button>
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
</body>
</html>