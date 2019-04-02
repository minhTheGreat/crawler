//Các xử lí kịch bản cho login.html

function checkValidLogin(fn){
	//Lấy thông tin đăng nhập
	var username = fn.txtUserName.value;
	var userpass = fn.txtUserPass.value;
	
	//Biến xác nhận sự hợp lệ của giá trị
	var validUserName = true;
	var validUserPass = true;
	
	//Biến ghi nhận thông báo sau kiểm tra
	var message = "";
	
	//Kiểm tra tên đăng nhập
	username = username.trim();
	if(username==""){
		validUserName = false;
		message = "Please input  the Uer name to login.";
	}else{
		if(username.indexOf(" ") !=-1){
			validUsername = false;
			message = "Have a space character in the User name.";
		}else{
			if(username.length>100){
				validUserName = false;
				message = "The User name is too long...Limit 100 char.";
			}else{
				//Tìm kiếm các kí tự liên quan tới hộp thư
				if(username.indexOf("@")!=-1 ||
					username.indexOf(".")!=-1 ){
					
						//Khai báo mẫu hộp thư
						var pattern = /\w+@\w+[.]\w/ ;
						if(!username.match(pattern)){
							validUserName = false;
							message = "The email is incorrect of structure.";
						}
				}
			}
		}
		
	}//username
	
	//Kiểm tra mật khẩu
	userpass = userpass.trim();
	if(userpass==""){
		validUserPass = false;
		message += "Please input the User pass to login.";	
	}else{
		if(userpass.length<6){
			validUserPass = false;
			message += "The User pass is too short to login.";
		}
	}
	
	//Kiểm tra thông báo
	message = message.trim();
	if(message!=""){
		window.alert(message);
		if(!validUserName){
			fn.txtUserName.focus();
			fn.txtUserName.select();
		}else if(!validUserPass){
			fn.txtUserPass.focus();
			fn.txtUserPass.select();
		}
		
	}
	
	//Trả về kết quả
	
	return validUserName && validUserPass;
	
}

	//Gọi vào doPot() để xử lí 
function login(fn){
	if(this.checkValidLogin(fn)){
		fn.method = "POST"; //Gọi doPot
		fn.action = "/adv/user/login"; //Đường dẫn Servlet
		fn.submit();
	}
			
}



