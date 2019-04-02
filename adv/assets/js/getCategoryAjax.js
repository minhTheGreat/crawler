jQuery(document).ready(function() {
	$('#txtCateSelector').blur(function() {
		alert();
		$('#loading-gif').show();
		if(checkSourceInfo()){
			$.ajax({
				url : 'new/category',
				data : {
					txtName : $('txtName').val(),
					txtCateSelector : $('#txtCateSelector').val(),
					txtLink : $('#txtLink').val()
				},
				success : function(responseText) {
					if(responseText.length){
						$('#loading-gif').hide();
						$('.choose-categories').html(responseText);
					} else {
						$('#loading-gif').hide();
						$('.choose-categories').html("<b>***Không tìm thấy chuyên mục nào</b>");
					}
				},
				error : function() {
					$('#loading-gif').hide();
					alert("Some thing wrong");
				},
			});
		}
	});

	$('.cate-enable').click(function(event){
		event.preventDefault();
		let object = $(this);
		$.ajax({
			url : $(this).attr('href').toString(),
			type : 'POST',
			success : function(responseText) {
				if(responseText == 'enable'){
					object.parent().attr('class', 'alert alert-success');
					object.text('Sử dụng');
				} else if(responseText == 'unenable'){
					object.parent().attr('class', 'alert alert-danger');
					object.text('Không sử dụng');
				} else {
					alert("Có lỗi xảy ra ^_^\nVui lòng liên hệ với nhóm phát triển!!!");
				}
			},
			error : function() {
				alert("Có lỗi xảy ra ^_^\nVui lòng liên hệ với nhóm phát triển!!!");
			},
		});
	});
	
	$('.destroy-cate').click(function(event){
		event.preventDefault();
		let object = $(this);
		$.ajax({
			url : $(this).attr('href').toString(),
			type : 'POST',
			success : function(responseText) {
				window.location.replace("/adv/category/view");
			},
			error : function() {
				alert("Có lỗi xảy ra ^_^\nVui lòng liên hệ với nhóm phát triển!!!");
			},
		});
	});

	$('.paginate').change(function(){
		window.location.replace($(this).val());
	});
	var href = window.location.href.split('/');
	$('.paginate option[value="'+ href[href.length-1] +'"]').attr('selected', true);

	$('a[href="modified-all"]').click(function(){
		event.preventDefault();
		$.ajax({
			url : $(this).attr('href').toString(),
			type : 'POST',
			success : function(responseText) {
				if(responseText == 'success'){
					window.location.replace('view');
				} else {
					alert("Có lỗi xảy ra ^_^\nVui lòng liên hệ với nhóm phát triển!!!");
				}
			},
			error : function() {
				alert("Có lỗi xảy ra ^_^\nVui lòng liên hệ với nhóm phát triển!!!");
			},
		});
	});
	var pathName = window.location.pathname.split('/');
	if(pathName[2]=='view'){
		$('ul.menu-right li:first-child').attr('class','active');
	} else {
		$('ul.menu-right li a[href*="'+pathName[2]+'"]').parent().attr('class','active');
	}
});

function checkSourceInfo(){
	let message = "";
	if(!$('#txtName').val()){
		message += "Chưa đi�\uFFFDn tên nguồn \n";
	}
	if(!$('#txtCateSelector').val()){
		message += "Chưa đi�\uFFFDn đư�\uFFFDng dẫn \n";
	}
	if(!$('#txtLink').val()){
		message += "Chưa đi�\uFFFDn xác định chuyên mục";
	}

	if(message.length){
		alert(message);
		return false;
	}

	return true;
}







