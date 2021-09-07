


function showUploadResult(uploadResultArr) {
	if(!uploadResultArr || uploadResultArr.length ==0 ) { return false; }
	
	var imgtarget = $("input[name='profileImage']");
	var str = "";
	
	$(uploadResultArr).each(function (i, obj){
		//img type
		if (!obj.image) { // 파일이면 다운로드 , 이미지면 화면 보이기
			var fileCallPath = encodeURIComponent( obj.uploadPath+"/"+obj.uuid+"_"+obj.fileName);  
			// encodeURIComponent()   파일이름에 한글이나 공백문자등이 문제되는걸 방지하기위한 메소드, 문자열을 URI호출에 맞는 문자열로 인코딩함.
			//var fileLink = fileCallPath.replace(new RegExp(/\\/g),"/");
			
			} else {
			
			var fileCallPath = encodeURIComponent( obj.uploadPath+"/s_"+obj.uuid+"_"+obj.fileName); 
			
			
			str += "<li "; 
			str += "data-path='"+obj.uploadPath+"' data-uuid='"+obj.uuid+"' data-filename='"+obj.fileName+"' data-type='"+obj.image+"'";
			str += "><div><span>"+obj.fileName+"</span><button type='button' data-type='image' data-file=\'"+fileCallPath+"\' class='btn btn-warning btn-circle'><i class='fa fa-times'></i></button><br>";
			str += "<img src='/display?fileName="+fileCallPath+"'>";
			str += "</div></li>";
		}
	});
	imgtarget.attr("src","/resources/upload/tmp"); // 미리보기 추가
}
