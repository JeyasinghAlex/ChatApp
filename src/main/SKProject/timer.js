
window.onload = function() {
    this.startTimer();
}


function  startTimer() {
    var timer = 30;
    setInterval( function(){
        if(timer >= 0){
            document.getElementById("tmr").innerHTML = timer;
        }
        if(timer == 0){
            document.getElementById("tmr").innerHTML = "Completed";
        }
        --timer;
    }, 1000);
}

