$(function(){
	var winHeight = $(window).height();
	var bodHeight = $("body").height();
	if(bodHeight<winHeight){
		var temp = winHeight - bodHeight;
		$(".space").css("height",temp);
	}
	$(".pg-nav>ul>li").mouseenter(function(){
		$(this).children(".nav-drop").show();
	})
	$(".pg-nav>ul>li").mouseleave(function(){
		$(this).children(".nav-drop").hide();
	})
})
