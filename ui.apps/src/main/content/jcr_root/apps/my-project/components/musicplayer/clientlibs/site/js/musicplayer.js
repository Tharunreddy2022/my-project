var audioel = document.getElementById('audio');
const cntrlBut = document.getElementById("play");
audioel.addEventListener("timeupdate", function() {
    var currentTime = audioel.currentTime;
    document.getElementById("currttime").innerHTML = (currentTime /60).toFixed(1);

    var duration = audioel.duration;
    document.getElementById("duration").innerHTML = (duration / 60).toFixed(1);

   $('.hp_range').stop(true,true).animate({'width':(currentTime +.25)/duration*100+'%'},250,'linear')
});

function playpause(){
    if(cntrlBut.classList.contains("fa-pause")){
         audioel.pause();
         cntrlBut.classList.remove("fa-pause");
         cntrlBut.classList.add("fa-play");
     }else{
         audioel.play();
         cntrlBut.classList.add("fa-pause");
         cntrlBut.classList.remove("fa-play");
     }
 }
