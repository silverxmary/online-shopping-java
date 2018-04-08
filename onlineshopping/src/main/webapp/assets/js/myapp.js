$(function(){
	//solving the active menu problem
	switch(menu){
		case 'About Us':
			$('#about').addClass('active');
			$('footer').css({"position":"absolute"});
			break;
		case 'Contact Us':
			$('#contact').addClass('active');
			$('footer').css({"position":"absolute"});
			break;
		case 'Products':
			$('#listProducts').addClass('active');
			$('footer').css({"position":"absolute"});
			break;
		default:
			$('#home').addClass('active');
			$('footer').css({"position":"relative"});
			break;
			
	}
});