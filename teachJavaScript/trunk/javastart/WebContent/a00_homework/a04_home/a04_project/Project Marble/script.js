

//플레이어 말 좌표값

	var xIdx=["300","370","450","530","610","690","770","850","930","1010","1070","1120","1070","1010","930","850","770","690","610","530","450","370",
			  "330","370","450","530","610","690","770","850","930","1010","1070","1120","1070","1010","930","850","770","690","610","530","450","370",
			  "330","370","450","530","610","690","770","850","930","1010","1070","1150"];
	var yIdx=["245","245","245","245","245","245","245","245","245", "245", "245", "295", "345", "345","345","345","345","345","345","345","345","345",
			  "385","425","425","425","425","425","425","425","425", "425", "425", "475", "525", "525","525","525","525","525","525","525","525","525",
			  "575","625","625","625","625","625","625","625","625", "625", "625", "625"];
	var rIdx=[  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0",   "0",   "0",  "90", "180", "180","180","180","180","180","180","180","180","180",
			   "90",  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0",   "0",   "0",  "90", "180", "180","180","180","180","180","180","180","180","180",
			   "90",  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0",   "0",   "0",   "0"];

	var a=1; //주사위 던지는 순서 규정해주는 변수
	var p1p=0;
	var p2p=0;
	var p3p=0;
	var p4p=0; //플레이어 위치 인덱스 값

	var onest = ""; // 1 - 차 순서 고르는 전역 변수
	var twost = ""; // 2
	var trest = ""; // 3
	var forst = ""; // 4

//점수 배열
	var score = [];

// 이미지 배열
	var sImg = [];
	
/*메인==> 차 선택------------------------------*/
	function chos() {
		var dis = document.getElementById("one");
		var input = document.getElementById("zero");
		dis.style.visibility='hidden';
		input.style.visibility='visible';
	    }

	
/*차 순서--------------------------------------*/
	function cars(d,s) {
		var orcar = document.getElementById(d);
		
		if(onest==""){orcar.innerHTML="1st"; onest=d;}
		else if(twost==""){orcar.innerHTML = "2nd"; twost=d;}
		else if(trest==""){orcar.innerHTML = "3rd"; trest=d;}
		else if(forst==""){orcar.innerHTML = "4th"; forst=d;};
		}	
	
	
/*선택 취소 하기------------------------------*/
	function rechos() {
		if(onest!=""){document.getElementById("no1").innerHTML="";onest="";
					  document.getElementById("no2").innerHTML="";twost="";
					  document.getElementById("no3").innerHTML="";trest="";
					  document.getElementById("no4").innerHTML="";forst="";
		}
	}
	
	
/*차 선택==> 메인-----------------------------*/
	function ok() {
		var dis = document.getElementById("one");
		var input = document.getElementById("zero");
		dis.style.visibility='visible';
		input.style.visibility='hidden';
	    }

	
/*시작 버튼(주사위 활성화)---------------------*/
	function start() {
		var dis = document.getElementById("btn");
		dis.style.visibility='visible';
	}


/*---------------------------------------------*/
/*메인 기능------------------------------------*/
	function moveCar(){

/*버튼 정지 기능(주사위 굴리는 동안)-------*/
		var btn = document.getElementById("btn");
		btn.disabled = 'disabled';
		setTimeout(function(){btn.disabled = false;},500);
/*-----------------------------------------*/
		
		var dice=parseInt((Math.random()*6)+1);
						
		var car01 = document.getElementById("div01");
		var car02 = document.getElementById("div02");
		var car03 = document.getElementById("div03");
		var car04 = document.getElementById("div04");

		var diceImg = document.getElementById("dImg");
		diceImg.innerHTML="<img src=img/jf.gif>"; 

/*Time*/setTimeout(	function(){diceImg.innerHTML="<img src=img/"+dice+".png>";
					var diceValue=document.getElementById("dValue"); 
					diceValue.innerHTML=dice; //주사위 값 입력

/*1111*/if(a==1){
			var before1=p1p;
			var next1=before1+dice
			p1p+=dice;
			var saveX=parseInt(xIdx[before1]);
			var saveY=parseInt(yIdx[before1]);
			var saveR=parseInt(rIdx[before1]);

			if(p1p<=10){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p1p])){
							clearInterval(mov);
							car01.style.left = parseInt(xIdx[p1p])+'px';
							car01.style.top = parseInt(yIdx[p1p])+'px';
							car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car01.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before1<=11 && p1p>=11){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p1p]) && saveY==parseInt(yIdx[p1p]) ){
							clearInterval(mov);
							car01.style.left = parseInt(xIdx[p1p])+'px';
							car01.style.top = parseInt(yIdx[p1p])+'px';
							car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
							break;
						}else if(saveX<=1070 && saveY==245){
							if(saveY==245){
								saveX+=2; 
								car01.style.left = saveX + 'px';
							}else if(saveY==345){
								saveX-=2; 
								car01.style.left = saveX + 'px';
							}
						}else if(saveX>1070 && saveX<=1120){
							if(saveY>=245 && saveY<295){
								saveX+=5; 
								saveY+=5;
								saveR+=9;
								car01.style.left = saveX + 'px';
								car01.style.top = saveY + 'px';
								car01.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=295 && saveY<345){
								saveX-=5; 
								saveY+=5;
								saveR+=9;
								car01.style.left = saveX + 'px';
								car01.style.top = saveY + 'px';
								car01.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==345){
								saveX-=2; 
								car01.style.left = saveX + 'px';
							}
						}else{
							saveX-=2; 
							car01.style.left = saveX + 'px';
						}
					}					
				}, 50); 
	
			}else if(before1>=12 && p1p<=21){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p1p])){
							clearInterval(mov);
							car01.style.left = parseInt(xIdx[p1p])+'px';
							car01.style.top = parseInt(yIdx[p1p])+'px';
							car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
							break;
						}else{
							saveX-=2; 
							car01.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before1<=22 && p1p>=22){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p1p]) && saveY==parseInt(yIdx[p1p]) ){
							clearInterval(mov);
							car01.style.left = parseInt(xIdx[p1p])+'px';
							car01.style.top = parseInt(yIdx[p1p])+'px';
							car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
							break;
						}else if(saveX>=370 && saveY==345){
							if(saveY==345){
								saveX-=2; 
								car01.style.left = saveX + 'px';
							}else if(saveY==425){
								saveX+=2; 
								car01.style.left = saveX + 'px';
							}
						}else if(saveX<370 && saveX>=330){
							if(saveY>=345 && saveY<385){
								saveX-=4; 
								saveY+=4;
								saveR-=9;
								car01.style.left = saveX + 'px';
								car01.style.top = saveY + 'px';
								car01.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=385 && saveY<425){
								saveX-=4; 
								saveY+=4;
								saveR-=9;
								car01.style.left = saveX + 'px';
								car01.style.top = saveY + 'px';
								car01.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==425){
								saveX+=2; 
								car01.style.left = saveX + 'px';
							}
						}else{
							saveX+=2; 
							car01.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before1>=23 && p1p<=32){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p1p])){
							clearInterval(mov);
							car01.style.left = parseInt(xIdx[p1p])+'px';
							car01.style.top = parseInt(yIdx[p1p])+'px';
							car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car01.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before1<=33 && p1p>=33){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p1p]) && saveY==parseInt(yIdx[p1p]) ){
							clearInterval(mov);
							car01.style.left = parseInt(xIdx[p1p])+'px';
							car01.style.top = parseInt(yIdx[p1p])+'px';
							car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
							break;
						}else if(saveX<=1070 && saveY==425){
							if(saveY==425){
								saveX+=2; 
								car01.style.left = saveX + 'px';
							}else if(saveY==525){
								saveX-=2; 
								car01.style.left = saveX + 'px';
							}
						}else if(saveX>1070 && saveX<=1120){
							if(saveY>=425 && saveY<475){
								saveX+=5; 
								saveY+=5;
								saveR+=9;
								car01.style.left = saveX + 'px';
								car01.style.top = saveY + 'px';
								car01.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=475 && saveY<525){
								saveX-=5; 
								saveY+=5;
								saveR+=9;
								car01.style.left = saveX + 'px';
								car01.style.top = saveY + 'px';
								car01.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==525){
								saveX-=2; 
								car01.style.left = saveX + 'px';
							}
						}else{
							saveX-=2; 
							car01.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before1>=34 && p1p<=43){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p1p])){
							clearInterval(mov);
							car01.style.left = parseInt(xIdx[p1p])+'px';
							car01.style.top = parseInt(yIdx[p1p])+'px';
							car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
							break;
						}else{
							saveX-=2; 
							car01.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before1<=44 && p1p>=44){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p1p]) && saveY==parseInt(yIdx[p1p]) ){
							clearInterval(mov);
							car01.style.left = parseInt(xIdx[p1p])+'px';
							car01.style.top = parseInt(yIdx[p1p])+'px';
							car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
							break;
						}else if(saveX>=370 && saveY==525){
							if(saveY==525){
								saveX-=2; 
								car01.style.left = saveX + 'px';
							}else if(saveY==625){
								saveX+=2; 
								car01.style.left = saveX + 'px';
							}
						}else if(saveX<370 && saveX>=330){
							if(saveY>=525 && saveY<575){
								saveX-=4; 
								saveY+=5;
								saveR-=9;
								car01.style.left = saveX + 'px';
								car01.style.top = saveY + 'px';
								car01.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=575 && saveY<625){
								saveX-=4; 
								saveY+=5;
								saveR-=9;
								car01.style.left = saveX + 'px';
								car01.style.top = saveY + 'px';
								car01.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==625){
								saveX+=2; 
								car01.style.left = saveX + 'px';
							}
						}else{
							saveX+=2; 
							car01.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before1>=45 && p1p<=54){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p1p])){
							clearInterval(mov);
							car01.style.left = parseInt(xIdx[p1p])+'px';
							car01.style.top = parseInt(yIdx[p1p])+'px';
							car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car01.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(p1p>=55){
				p1p=55; 
				car01.style.left = parseInt(xIdx[p1p])+'px';
				car01.style.top = parseInt(yIdx[p1p])+'px';
				car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
				
				// 결승점 통과 했을 경우, 알림.
				var con = confirm("player01 WIN!");
				if (con) {
					enabledInput();
					// 랭킹
					inItScore();
				}

			}else{
			car01.style.left = parseInt(xIdx[p1p])+'px';
			car01.style.top = parseInt(yIdx[p1p])+'px';
			car01.style.transform = "rotate("+rIdx[p1p]+"deg)";
			}

			a++;
			
			if(p1p==p2p){p2p=0; //위치 값이 같은 말 처음으로 이동
				car02.style.left = parseInt(xIdx[p2p])+'px';
				car02.style.top = parseInt(yIdx[p2p])+'px';
				car02.style.transform = "rotate(0deg)";
			}
			else if(p1p==p3p){p3p=0;
				car03.style.left = parseInt(xIdx[p3p])+'px';
				car03.style.top = parseInt(yIdx[p3p])+'px';
				car03.style.transform = "rotate(0deg)";
			}
			else if(p1p==p4p){p4p=0;
				car04.style.left = parseInt(xIdx[p4p])+'px';
				car04.style.top = parseInt(yIdx[p4p])+'px';
				car04.style.transform = "rotate(0deg)";
			}
			else{}
		}

/*2222*/else if(a==2){
			var before2=p2p;
			var next2=before2+dice
			p2p+=dice;

			var saveX=parseInt(xIdx[before2]);
			var saveY=parseInt(yIdx[before2]);
			var saveR=parseInt(rIdx[before2]);

			if(p2p<=10){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p2p])){
							clearInterval(mov);
							car02.style.left = parseInt(xIdx[p2p])+'px';
							car02.style.top = parseInt(yIdx[p2p])+'px';
							car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car02.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before2<=11 && p2p>=11){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p2p]) && saveY==parseInt(yIdx[p2p]) ){
							clearInterval(mov);
							car02.style.left = parseInt(xIdx[p2p])+'px';
							car02.style.top = parseInt(yIdx[p2p])+'px';
							car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
							break;
						}else if(saveX<=1070 && saveY==245){
							if(saveY==245){
								saveX+=2; 
								car02.style.left = saveX + 'px';
							}else if(saveY==345){
								saveX-=2; 
								car02.style.left = saveX + 'px';
							}
						}else if(saveX>1070 && saveX<=1120){
							if(saveY>=245 && saveY<295){
								saveX+=5; 
								saveY+=5;
								saveR+=9;
								car02.style.left = saveX + 'px';
								car02.style.top = saveY + 'px';
								car02.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=295 && saveY<345){
								saveX-=5; 
								saveY+=5;
								saveR+=9;
								car02.style.left = saveX + 'px';
								car02.style.top = saveY + 'px';
								car02.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==345){
								saveX-=2; 
								car02.style.left = saveX + 'px';
							}
						}else{
							saveX-=2; 
							car02.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before2>=12 && p2p<=21){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p2p])){
							clearInterval(mov);
							car02.style.left = parseInt(xIdx[p2p])+'px';
							car02.style.top = parseInt(yIdx[p2p])+'px';
							car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
							break;
						}else{
							saveX-=2; 
							car02.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before2<=22 && p2p>=22){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p2p]) && saveY==parseInt(yIdx[p2p]) ){
							clearInterval(mov);
							car02.style.left = parseInt(xIdx[p2p])+'px';
							car02.style.top = parseInt(yIdx[p2p])+'px';
							car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
							break;
						}else if(saveX>=370 && saveY==345){
							if(saveY==345){
								saveX-=2; 
								car02.style.left = saveX + 'px';
							}else if(saveY==425){
								saveX+=2; 
								car02.style.left = saveX + 'px';
							}
						}else if(saveX<370 && saveX>=330){
							if(saveY>=345 && saveY<385){
								saveX-=4; 
								saveY+=4;
								saveR-=9;
								car02.style.left = saveX + 'px';
								car02.style.top = saveY + 'px';
								car02.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=385 && saveY<425){
								saveX-=4; 
								saveY+=4;
								saveR-=9;
								car02.style.left = saveX + 'px';
								car02.style.top = saveY + 'px';
								car02.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==425){
								saveX+=2; 
								car02.style.left = saveX + 'px';
							}
						}else{
							saveX+=2; 
							car02.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before2>=23 && p2p<=32){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p2p])){
							clearInterval(mov);
							car02.style.left = parseInt(xIdx[p2p])+'px';
							car02.style.top = parseInt(yIdx[p2p])+'px';
							car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car02.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before2<=33 && p2p>=33){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p2p]) && saveY==parseInt(yIdx[p2p]) ){
							clearInterval(mov);
							car02.style.left = parseInt(xIdx[p2p])+'px';
							car02.style.top = parseInt(yIdx[p2p])+'px';
							car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
							break;
						}else if(saveX<=1070 && saveY==425){
							if(saveY==425){
								saveX+=2; 
								car02.style.left = saveX + 'px';
							}else if(saveY==525){
								saveX-=2; 
								car02.style.left = saveX + 'px';
							}
						}else if(saveX>1070 && saveX<=1120){
							if(saveY>=425 && saveY<475){
								saveX+=5; 
								saveY+=5;
								saveR+=9;
								car02.style.left = saveX + 'px';
								car02.style.top = saveY + 'px';
								car02.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=475 && saveY<525){
								saveX-=5; 
								saveY+=5;
								saveR+=9;
								car02.style.left = saveX + 'px';
								car02.style.top = saveY + 'px';
								car02.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==525){
								saveX-=2; 
								car02.style.left = saveX + 'px';
							}
						}else{
							saveX-=2; 
							car02.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before2>=34 && p2p<=43){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p2p])){
							clearInterval(mov);
							car02.style.left = parseInt(xIdx[p2p])+'px';
							car02.style.top = parseInt(yIdx[p2p])+'px';
							car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
							break;
						}else{
							saveX-=2; 
							car02.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before2<=44 && p2p>=44){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p2p]) && saveY==parseInt(yIdx[p2p]) ){
							clearInterval(mov);
							car02.style.left = parseInt(xIdx[p2p])+'px';
							car02.style.top = parseInt(yIdx[p2p])+'px';
							car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
							break;
						}else if(saveX>=370 && saveY==525){
							if(saveY==525){
								saveX-=2; 
								car02.style.left = saveX + 'px';
							}else if(saveY==625){
								saveX+=2; 
								car02.style.left = saveX + 'px';
							}
						}else if(saveX<370 && saveX>=330){
							if(saveY>=525 && saveY<575){
								saveX-=4; 
								saveY+=5;
								saveR-=9;
								car02.style.left = saveX + 'px';
								car02.style.top = saveY + 'px';
								car02.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=575 && saveY<625){
								saveX-=4; 
								saveY+=5;
								saveR-=9;
								car02.style.left = saveX + 'px';
								car02.style.top = saveY + 'px';
								car02.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==625){
								saveX+=2; 
								car02.style.left = saveX + 'px';
							}
						}else{
							saveX+=2; 
							car02.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before2>=45 && p2p<=54){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p2p])){
							clearInterval(mov);
							car02.style.left = parseInt(xIdx[p2p])+'px';
							car02.style.top = parseInt(yIdx[p2p])+'px';
							car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car02.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(p2p>=55){
				p2p=55; 
				car02.style.left = parseInt(xIdx[p2p])+'px';
				car02.style.top = parseInt(yIdx[p2p])+'px';
				car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
	
				// 결승점 통과 했을 경우, 알림.
				var con = confirm("player02 WIN!");
				if (con) {
					enabledInput();
					// 랭킹
					inItScore();
				}

			}else{
			car02.style.left = parseInt(xIdx[p2p])+'px';
			car02.style.top = parseInt(yIdx[p2p])+'px';
			car02.style.transform = "rotate("+rIdx[p2p]+"deg)";
			}	

			a++;

			if(p2p==p1p){p1p=0; //위치 값이 같은 말 처음으로 이동
				car01.style.left = parseInt(xIdx[p1p])+'px';
				car01.style.top = parseInt(yIdx[p1p])+'px';
				car01.style.transform = "rotate(0deg)";
			}
			else if(p2p==p3p){p3p=0;
				car03.style.left = parseInt(xIdx[p3p])+'px';
				car03.style.top = parseInt(yIdx[p3p])+'px';
				car03.style.transform = "rotate(0deg)";
			}
			else if(p2p==p4p){p4p=0;
				car04.style.left = parseInt(xIdx[p4p])+'px';
				car04.style.top = parseInt(yIdx[p4p])+'px';
				car04.style.transform = "rotate(0deg)";
			}
			else{}
		}

/*3333*/else if(a==3){
			var before3=p3p;
			var next3=before3+dice
			p3p+=dice;

			var saveX=parseInt(xIdx[before3]);
			var saveY=parseInt(yIdx[before3]);
			var saveR=parseInt(rIdx[before3]);
			if(p3p<=10){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p3p])){
							clearInterval(mov);
							car03.style.left = parseInt(xIdx[p3p])+'px';
							car03.style.top = parseInt(yIdx[p3p])+'px';
							car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car03.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before3<=11 && p3p>=11){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p3p]) && saveY==parseInt(yIdx[p3p]) ){
							clearInterval(mov);
							car03.style.left = parseInt(xIdx[p3p])+'px';
							car03.style.top = parseInt(yIdx[p3p])+'px';
							car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
							break;
						}else if(saveX<=1070 && saveY==245){
							if(saveY==245){
								saveX+=2; 
								car03.style.left = saveX + 'px';
							}else if(saveY==345){
								saveX-=2; 
								car03.style.left = saveX + 'px';
							}
						}else if(saveX>1070 && saveX<=1120){
							if(saveY>=245 && saveY<295){
								saveX+=5; 
								saveY+=5;
								saveR+=9;
								car03.style.left = saveX + 'px';
								car03.style.top = saveY + 'px';
								car03.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=295 && saveY<345){
								saveX-=5; 
								saveY+=5;
								saveR+=9;
								car03.style.left = saveX + 'px';
								car03.style.top = saveY + 'px';
								car03.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==345){
								saveX-=2; 
								car03.style.left = saveX + 'px';
							}
						}else{
							saveX-=2; 
							car03.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before3>=12 && p3p<=21){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p3p])){
							clearInterval(mov);
							car03.style.left = parseInt(xIdx[p3p])+'px';
							car03.style.top = parseInt(yIdx[p3p])+'px';
							car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
							break;
						}else{
							saveX-=2; 
							car03.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before3<=22 && p3p>=22){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p3p]) && saveY==parseInt(yIdx[p3p]) ){
							clearInterval(mov);
							car03.style.left = parseInt(xIdx[p3p])+'px';
							car03.style.top = parseInt(yIdx[p3p])+'px';
							car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
							break;
						}else if(saveX>=370 && saveY==345){
							if(saveY==345){
								saveX-=2; 
								car03.style.left = saveX + 'px';
							}else if(saveY==425){
								saveX+=2; 
								car03.style.left = saveX + 'px';
							}
						}else if(saveX<370 && saveX>=330){
							if(saveY>=345 && saveY<385){
								saveX-=4; 
								saveY+=4;
								saveR-=9;
								car03.style.left = saveX + 'px';
								car03.style.top = saveY + 'px';
								car03.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=385 && saveY<425){
								saveX-=4; 
								saveY+=4;
								saveR-=9;
								car03.style.left = saveX + 'px';
								car03.style.top = saveY + 'px';
								car03.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==425){
								saveX+=2; 
								car03.style.left = saveX + 'px';
							}
						}else{
							saveX+=2; 
							car03.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before3>=23 && p3p<=32){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p3p])){
							clearInterval(mov);
							car03.style.left = parseInt(xIdx[p3p])+'px';
							car03.style.top = parseInt(yIdx[p3p])+'px';
							car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car03.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before3<=33 && p3p>=33){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p3p]) && saveY==parseInt(yIdx[p3p]) ){
							clearInterval(mov);
							car03.style.left = parseInt(xIdx[p3p])+'px';
							car03.style.top = parseInt(yIdx[p3p])+'px';
							car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
							break;
						}else if(saveX<=1070 && saveY==425){
							if(saveY==425){
								saveX+=2; 
								car03.style.left = saveX + 'px';
							}else if(saveY==525){
								saveX-=2; 
								car03.style.left = saveX + 'px';
							}
						}else if(saveX>1070 && saveX<=1120){
							if(saveY>=425 && saveY<475){
								saveX+=5; 
								saveY+=5;
								saveR+=9;
								car03.style.left = saveX + 'px';
								car03.style.top = saveY + 'px';
								car03.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=475 && saveY<525){
								saveX-=5; 
								saveY+=5;
								saveR+=9;
								car03.style.left = saveX + 'px';
								car03.style.top = saveY + 'px';
								car03.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==525){
								saveX-=2; 
								car03.style.left = saveX + 'px';
							}
						}else{
							saveX-=2; 
							car03.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before3>=34 && p3p<=43){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p3p])){
							clearInterval(mov);
							car03.style.left = parseInt(xIdx[p3p])+'px';
							car03.style.top = parseInt(yIdx[p3p])+'px';
							car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
							break;
						}else{
							saveX-=2; 
							car03.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before3<=44 && p3p>=44){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p3p]) && saveY==parseInt(yIdx[p3p]) ){
							clearInterval(mov);
							car03.style.left = parseInt(xIdx[p3p])+'px';
							car03.style.top = parseInt(yIdx[p3p])+'px';
							car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
							break;
						}else if(saveX>=370 && saveY==525){
							if(saveY==525){
								saveX-=2; 
								car03.style.left = saveX + 'px';
							}else if(saveY==625){
								saveX+=2; 
								car03.style.left = saveX + 'px';
							}
						}else if(saveX<370 && saveX>=330){
							if(saveY>=525 && saveY<575){
								saveX-=4; 
								saveY+=5;
								saveR-=9;
								car03.style.left = saveX + 'px';
								car03.style.top = saveY + 'px';
								car03.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=575 && saveY<625){
								saveX-=4; 
								saveY+=5;
								saveR-=9;
								car03.style.left = saveX + 'px';
								car03.style.top = saveY + 'px';
								car03.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==625){
								saveX+=2; 
								car03.style.left = saveX + 'px';
							}
						}else{
							saveX+=2; 
							car03.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before3>=45 && p3p<=54){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p3p])){
							clearInterval(mov);
							car03.style.left = parseInt(xIdx[p3p])+'px';
							car03.style.top = parseInt(yIdx[p3p])+'px';
							car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car03.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(p3p>=55){
				p3p=55; 
				car01.style.left = parseInt(xIdx[p3p])+'px';
				car01.style.top = parseInt(yIdx[p3p])+'px';
				car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
				
				// 결승점 통과 했을 경우, 알림.
				var con = confirm("player03 WIN!");
				if (con) {
					enabledInput();
					// 랭킹
					inItScore();
				}

			}else{
			car03.style.left = parseInt(xIdx[p3p])+'px';
			car03.style.top = parseInt(yIdx[p3p])+'px';
			car03.style.transform = "rotate("+rIdx[p3p]+"deg)";
			}	
		
			a++;

			if(p3p==p1p){p1p=0; //위치 값이 같은 말 처음으로 이동
				car01.style.left = parseInt(xIdx[p1p])+'px';
				car01.style.top = parseInt(yIdx[p1p])+'px';
				car01.style.transform = "rotate(0deg)";
			}
			else if(p3p==p2p){p2p=0;
				car02.style.left = parseInt(xIdx[p2p])+'px';
				car02.style.top = parseInt(yIdx[p2p])+'px';
				car02.style.transform = "rotate(0deg)";
			}
			else if(p3p==p4p){p4p=0;
				car04.style.left = parseInt(xIdx[p4p])+'px';
				car04.style.top = parseInt(yIdx[p4p])+'px';
				car04.style.transform = "rotate(0deg)";
			}
			else{}
		}

/*4444*/else if(a==4){
			var before4=p4p;
			var next4=before4+dice
			p4p+=dice;

			var saveX=parseInt(xIdx[before4]);
			var saveY=parseInt(yIdx[before4]);
			var saveR=parseInt(rIdx[before4]);

			if(p4p<=10){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p4p])){
							clearInterval(mov);
							car04.style.left = parseInt(xIdx[p4p])+'px';
							car04.style.top = parseInt(yIdx[p4p])+'px';
							car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car04.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before4<=11 && p4p>=11){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p4p]) && saveY==parseInt(yIdx[p4p]) ){
							clearInterval(mov);
							car04.style.left = parseInt(xIdx[p4p])+'px';
							car04.style.top = parseInt(yIdx[p4p])+'px';
							car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
							break;
						}else if(saveX<=1070 && saveY==245){
							if(saveY==245){
								saveX+=2; 
								car04.style.left = saveX + 'px';
							}else if(saveY==345){
								saveX-=2; 
								car04.style.left = saveX + 'px';
							}
						}else if(saveX>1070 && saveX<=1120){
							if(saveY>=245 && saveY<295){
								saveX+=5; 
								saveY+=5;
								saveR+=9;
								car04.style.left = saveX + 'px';
								car04.style.top = saveY + 'px';
								car04.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=295 && saveY<345){
								saveX-=5; 
								saveY+=5;
								saveR+=9;
								car04.style.left = saveX + 'px';
								car04.style.top = saveY + 'px';
								car04.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==345){
								saveX-=2; 
								car04.style.left = saveX + 'px';
							}
						}else{
							saveX-=2; 
							car04.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before4>=12 && p4p<=21){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p4p])){
							clearInterval(mov);
							car04.style.left = parseInt(xIdx[p4p])+'px';
							car04.style.top = parseInt(yIdx[p4p])+'px';
							car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
							break;
						}else{
							saveX-=2; 
							car04.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before4<=22 && p4p>=22){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p4p]) && saveY==parseInt(yIdx[p4p]) ){
							clearInterval(mov);
							car04.style.left = parseInt(xIdx[p4p])+'px';
							car04.style.top = parseInt(yIdx[p4p])+'px';
							car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
							break;
						}else if(saveX>=370 && saveY==345){
							if(saveY==345){
								saveX-=2; 
								car04.style.left = saveX + 'px';
							}else if(saveY==425){
								saveX+=2; 
								car04.style.left = saveX + 'px';
							}
						}else if(saveX<370 && saveX>=330){
							if(saveY>=345 && saveY<385){
								saveX-=4; 
								saveY+=4;
								saveR-=9;
								car04.style.left = saveX + 'px';
								car04.style.top = saveY + 'px';
								car04.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=385 && saveY<425){
								saveX-=4; 
								saveY+=4;
								saveR-=9;
								car04.style.left = saveX + 'px';
								car04.style.top = saveY + 'px';
								car04.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==425){
								saveX+=2; 
								car04.style.left = saveX + 'px';
							}
						}else{
							saveX+=2; 
							car04.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before4>=23 && p4p<=32){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p4p])){
							clearInterval(mov);
							car04.style.left = parseInt(xIdx[p4p])+'px';
							car04.style.top = parseInt(yIdx[p4p])+'px';
							car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car04.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before4<=33 && p4p>=33){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p4p]) && saveY==parseInt(yIdx[p4p]) ){
							clearInterval(mov);
							car04.style.left = parseInt(xIdx[p4p])+'px';
							car04.style.top = parseInt(yIdx[p4p])+'px';
							car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
							break;
						}else if(saveX<=1070 && saveY==425){
							if(saveY==425){
								saveX+=2; 
								car04.style.left = saveX + 'px';
							}else if(saveY==525){
								saveX-=2; 
								car04.style.left = saveX + 'px';
							}
						}else if(saveX>1070 && saveX<=1120){
							if(saveY>=425 && saveY<475){
								saveX+=5; 
								saveY+=5;
								saveR+=9;
								car04.style.left = saveX + 'px';
								car04.style.top = saveY + 'px';
								car04.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=475 && saveY<525){
								saveX-=5; 
								saveY+=5;
								saveR+=9;
								car04.style.left = saveX + 'px';
								car04.style.top = saveY + 'px';
								car04.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==525){
								saveX-=2; 
								car04.style.left = saveX + 'px';
							}
						}else{
							saveX-=2; 
							car04.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before4>=34 && p4p<=43){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p4p])){
							clearInterval(mov);
							car04.style.left = parseInt(xIdx[p4p])+'px';
							car04.style.top = parseInt(yIdx[p4p])+'px';
							car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
							break;
						}else{
							saveX-=2; 
							car04.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(before4<=44 && p4p>=44){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){ 
						//alert(saveX+" "+saveY+" " +saveR); //주사위 값만큼 움직이게
						if( saveX==parseInt(xIdx[p4p]) && saveY==parseInt(yIdx[p4p]) ){
							clearInterval(mov);
							car04.style.left = parseInt(xIdx[p4p])+'px';
							car04.style.top = parseInt(yIdx[p4p])+'px';
							car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
							break;
						}else if(saveX>=370 && saveY==525){
							if(saveY==525){
								saveX-=2; 
								car04.style.left = saveX + 'px';
							}else if(saveY==625){
								saveX+=2; 
								car04.style.left = saveX + 'px';
							}
						}else if(saveX<370 && saveX>=330){
							if(saveY>=525 && saveY<575){
								saveX-=4; 
								saveY+=5;
								saveR-=9;
								car04.style.left = saveX + 'px';
								car04.style.top = saveY + 'px';
								car04.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY>=575 && saveY<625){
								saveX-=4; 
								saveY+=5;
								saveR-=9;
								car04.style.left = saveX + 'px';
								car04.style.top = saveY + 'px';
								car04.style.transform = "rotate("+saveR+"deg)";
							}else if(saveY==625){
								saveX+=2; 
								car04.style.left = saveX + 'px';
							}
						}else{
							saveX+=2; 
							car04.style.left = saveX + 'px';
						}
					}					
				}, 50); 

			}else if(before4>=45 && p4p<=54){
				var mov = setInterval(function(){
					for(var i=0;i<dice;i++){//주사위 값만큼 움직이게
						if(saveX==parseInt(xIdx[p4p])){
							clearInterval(mov);
							car04.style.left = parseInt(xIdx[p4p])+'px';
							car04.style.top = parseInt(yIdx[p4p])+'px';
							car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
							break;
						}else{
							saveX+=2; 
							car04.style.left = saveX + 'px';
						}					
					}					
				}, 10);

			}else if(p4p>=55){
				p4p=55; 
				car04.style.left = parseInt(xIdx[p4p])+'px';
				car04.style.top = parseInt(yIdx[p4p])+'px';
				car04.style.transform = "rotate("+rIdx[p4p]+"deg)";

				// 결승점 통과 했을 경우, 알림.
				var con = confirm("player04 WIN!");
				if (con) {
					enabledInput();
					// 랭킹
					inItScore();
				}

			}else{
			car04.style.left = parseInt(xIdx[p4p])+'px';
			car04.style.top = parseInt(yIdx[p4p])+'px';
			car04.style.transform = "rotate("+rIdx[p4p]+"deg)";
			}	
		
			a=1;

			if(p4p==p1p){p1p=0; //위치 값이 같은 말 처음으로 이동
				car01.style.left = parseInt(xIdx[p1p])+'px';
				car01.style.top = parseInt(yIdx[p1p])+'px';
				car01.style.transform = "rotate(0deg)";
			}
			else if(p4p==p2p){p2p=0;
				car02.style.left = parseInt(xIdx[p2p])+'px';
				car02.style.top = parseInt(yIdx[p2p])+'px';
				car02.style.transform = "rotate(0deg)";
			}
			else if(p4p==p3p){p3p=0;
				car03.style.left = parseInt(xIdx[p3p])+'px';
				car03.style.top = parseInt(yIdx[p3p])+'px';
				car03.style.transform = "rotate(0deg)";
			}
			else{}
		}
			

		// 스코어값
		var p1s = document.getElementById("p1Score");
		var p2s = document.getElementById("p2Score");
		var p3s = document.getElementById("p3Score");
		var p4s = document.getElementById("p4Score");
		
		// 스코어 배열 저장
		score[0] = parseInt(p1p);
		score[1] = parseInt(p2p);
		score[2] = parseInt(p3p);
		score[3] = parseInt(p4p);

		// 스코어 출력부분
		p1s.innerHTML = ": " + p1p;
		p2s.innerHTML = ": " + p2p;
		p3s.innerHTML = ": " + p3p;
		p4s.innerHTML = ": " + p4p;


/*Time*/}, 500);

	}



	function enabledInput() {
		var dis = document.getElementById("one");
		var input = document.getElementById("two");
		dis.style.visibility = 'hidden';
		input.style.visibility = 'visible';
	}

	function inItScore() {
	
		var rank1 = document.getElementById("rrank1");
		var rank2 = document.getElementById("rrank2");
		var rank3 = document.getElementById("rrank3");
		var rank4 = document.getElementById("rrank4");

		//이미지 배열
		sImg[0] = "img/b_car.png";
		sImg[1] = "img/black_car.png";
		sImg[2] = "img/o_car.png";
		sImg[3] = "img/r_car.png";
	
		// 스코어 비교
		// 오름차순정렬
		var temp = "";
		var temp = "";
		for (var i=0;i<4;i++) {
			for (var j=i+1;j<4;j++) {
				if (score[i] < score[j]) {
					temp = sImg[i];
					temp2 = score[i];	
			        sImg[i] = sImg[j];
				    score[i] = score[j];
					sImg[j] = temp;
					score[j] = temp2;
				}
			}
		}

		rank1.innerHTML = "<img src=" + sImg[0] + " width='55px' height='27px'>";
		rank2.innerHTML = "<img src=" + sImg[1] + " width='55px' height='27px'>";
		rank3.innerHTML = "<img src=" + sImg[2] + " width='55px' height='27px'>";
		rank4.innerHTML = "<img src=" + sImg[3] + " width='55px' height='27px'>";

	}
