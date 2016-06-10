// JavaScript Document
//支持Enter键登录
		document.onkeydown = function(e){
			if($(".bac").length==0)
			{
				if(!e) e = window.event;
				if((e.keyCode || e.which) == 13){
					var obtnLogin=document.getElementById("submit_btn")
					obtnLogin.focus();
				}
			}
		}

    	$(function(){
    		// 焦点默认定在登录账号
    	$('#userName').focus();
			//提交表单
			$('#submit_btn').click(function(){
				show_loading();
				
				if($('#userName').val() == ''){//如果登录账号未输入，则提示输入登录账号
					show_err_msg('你还没有填写用户名哦。');	
					$('#userName').focus();
				} else if($('#password').val() == ''){ 	//如果登录密码未输入，则提示输入登录密码
					show_err_msg('你还没有填写密码哦。');
					$('#password').focus();
				} else if($('#captcha').val() == ''){ 	//如果验证码未输入，则提示输入验证码
					show_err_msg('你还没有填写验证码哦。');
					$('#captcha').focus();
				} else {
					//ajax提交表单，#login_form为表单的ID。 如：$('#login_form').ajaxSubmit(function(data) { ... });
					show_msg('登录成功咯！  正在为您跳转...','/');	
				}
			});
		});
		
		//验证码
		function loadimage() {
			 document.getElementById("captcha_img").src = "plug-in/login/images/imageCaptcha.jsp?"+ Math.random();
		}