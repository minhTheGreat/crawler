function checkValidUser(fn){
	// Lấy thông tin tài khoản
	var accname = fn.txtName.value;
	var accfullname = fn.txtFullName.value;
	var accemail = fn.txtEmail.value;


	//Biến xác nhaank sự hợp lệ
	var validAccName = true;
	var validAccFullName = true;
	var validAccEmail = true;

	// hiển thị thông báo

	var message ="";

	//Kiểm tra thông tin tài khoản
	accname = accname.trim();
	if(accname==""){
		validAccName = false;
		message ="Thiếu thông tin tên tài khoản";
	} else{
		if(accname.indexOf(" ")!=-1){
			validAccName= false;
			message="Tên tài khoản không có dấu cách";
		}else{
			if(accname.length>100){
				validUserName=false;
				message="Tên tài khoản quá dài";
			}
		}
	}
	//Ten day du
	accfullname=accfullname.trim();
	if(accfullname==""){
		validAccFullName = false;
		message ="Thiếu thông tin tên tài khoản";
	} else{
		if(accfullname.indexOf(" ")!=-1){
			validAccFullName= false;
			message="Tên đầy đủ không có dấu cách";
		}else{
			if(accfullname.length>100){
				validAccFullName=false;
				message="Tên quá dài";
			}
		}
	}
	//Kiểm tra mật khẩu


	//Kiểm tra hộp thư

	accemail=accemail.trim();
	if(accemail==""){
		validAccEmail=false;
		message +="\n Thiếu hộp thư cho tài khoản";
	}else{
		var pattern =/\w+@\w+[.]\w/;
	if(!accemail.match(pattern)){
		validAccEmail=false;
		message+="\n Hộp thư không chính xác";
		}
	}



	//Xuất thông báo
	if(message!=""){
		window.alert(message);
		if(!validAccName){
			fn.txtAccName.focus();
			fn.txtAccName.select();
		}else if(!validAccPass){
			fn.txtAccPass.focus();
			fn.txtAccPass.select();
		}else if(!validAccEmail){
			fn.txtAccEmail.focus();
			fn.txtAccEmail.select();
		}
	}
	//Trả v�\uFFFD kết quả kiểm tra
	return validAccName && validAccFullName && validAccEmail ;
}
	function saveUser(fn){
		if(this.checkValidUser(fn)){
			fn.method ="POST";
			fn.action = "/adv/user/ae";
			fn.submit();

		}

	}
