
function stop(){
	$.ajax({ type:'GET',url: window.location+'&a=1',success:window.location.reload()});
}
function pause(){
	$.ajax({ type:'GET',url: window.location+'&a=2',success:window.location.reload()});
}
function restart(){
	$.ajax({ type:'GET',url: window.location+'&a=3',success:window.location.reload()});
}
function start(){
	$.ajax({ type:'GET',url: window.location+'&a=4',success:window.location.reload()});
}
$('#button_stop').bind('click',stop);
$('#button_pause').bind('click',pause);
$('#button_restart').bind('click',restart);
$('#button_start').bind('click',start);

$('#precces').change(function(){ 
	var process = $(this).children('option:selected').val();
	window.location.search = "?process="+process;
});