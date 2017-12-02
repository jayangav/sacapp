$(document).ready(function(){
	$.get(
	"https://www.googleapis.com/youtube/v3/channels",{
	part: 'contentDetails',
	forUsername: 'ParadiseTech',

	//id: 'UCMLmgz8mVoGkaAdkDnSpkWQ',
	key: 'AIzaSyDzN7ypIV3M-ZngfkYGOeuVvWbNTmznKr0'},
	
	function(data){
		
		$.each(data.items, function(i, item){
			
			console.log(item);
			pid = item.contentDetails.relatedPlaylists.uploads;
			getVids(pid);
		})
	}
	
);

	function getVids(pid){
		$.get(
	"https://www.googleapis.com/youtube/v3/playlistItems",{
	part: 'snippet',
	maxResutls: 20,
	playlistId: pid,
	key: 'AIzaSyDzN7ypIV3M-ZngfkYGOeuVvWbNTmznKr0'},
	
	function(data){
		var output;
		$.each(data.items, function(i, item){
			console.log(item);
			videTitle = item.snippet.title;
			vedioID = item.snippet.resourceId.videoId;
			output = '<li><iframe src=\"//www.youtube.com/embed/'+vedioID+'"></iframe></li>'
			
			$('#resu').append(output);
		})
	}
	
);
		
		
		
	}


});