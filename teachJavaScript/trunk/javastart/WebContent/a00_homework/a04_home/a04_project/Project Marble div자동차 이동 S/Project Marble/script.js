
//플레이어 말 좌표값

	var xIdx=["300","370","450","530","610","690","770","850","930","1010","1070","1120","1070","1010","930","850","770","690","610","530","450","370",
			  "330","370","450","530","610","690","770","850","930","1010","1070","1120","1070","1010","930","850","770","690","610","530","450","370",
			  "330","370","450","530","610","690","770","850","930","1010","1070","1150"];
	var yIdx=["257","257","257","257","257","257","257","257","257", "257", "257", "295", "345", "345","345","345","345","345","345","345","345","345",
			  "388","443","443","443","443","443","443","443","443", "443", "443", "481", "530", "530","530","530","530","530","530","530","530","530",
			  "574","629","629","629","629","629","629","629","629", "629", "629", "629"];
	var rIdx=[  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0",   "0",   "0",  "90", "180", "180","180","180","180","180","180","180","180","180",
			   "90",  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0",   "0",   "0",  "90", "180", "180","180","180","180","180","180","180","180","180",
			   "90",  "0",  "0",  "0",  "0",  "0",  "0",  "0",  "0",   "0",   "0",   "0"];

	var a=1; //주사위 던지는 순서 규정해주는 변수
	var p1p=0;
	var p2p=0;
	var p3p=0;
	var p4p=0; //플레이어 위치 인덱스 값

	function moveCar(){
		var dice=parseInt((Math.random()*6)+1);
						
		var car01 = document.getElementById("div01");
		var car02 = document.getElementById("div02");
		var car03 = document.getElementById("div03");
		var car04 = document.getElementById("div04");

		var diceImg = document.getElementById("dImg");
		diceImg.innerHTML="<img src=img/jf.gif>"; 

		setTimeout(	function(){diceImg.innerHTML="<img src=img/"+dice+".png>";
					var diceValue=document.getElementById("dValue"); 
					diceValue.innerHTML=dice; //주사위 값 입력

		if(a==1){
			var before1 = p1p;
			p1p+=dice;
			
			for(var ix=0;ix<dice;ix++){
				var mov = setInterval(move, 3000); 
				function move() {
					if(before1==p1p){
						clearInterval(mov);
						car01.style.left = parseInt(xIdx[p1p])+'px';
						car01.style.top = parseInt(yIdx[p1p])+'px';
					}else{
						car01.style.left = parseInt(xIdx[before1])+'px';
						car01.style.top = parseInt(yIdx[before1])+'px';
						before1++; 
					}			
				}
			}
			
			if(p1p>=11){car01.style.transform = "rotate(90deg)";}
			if(p1p>=12){car01.style.transform = "rotate(180deg)";}
			if(p1p>=22){car01.style.transform = "rotate(90deg)";}
			if(p1p>=23){car01.style.transform = "rotate(0deg)";}
			if(p1p>=33){car01.style.transform = "rotate(90deg)";}
			if(p1p>=34){car01.style.transform = "rotate(180deg)";}
			if(p1p>=44){car01.style.transform = "rotate(90deg)";}
			if(p1p>=45){car01.style.transform = "rotate(0deg)";}
			if(p1p>=55){p1p=55; car01.style.left = parseInt(xIdx[p1p])+'px'; alert("player01 WIN!");} // 결승점 통과 했을 경우, 알림.
			else{}
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

		else if(a==2){
			p2p+=dice;
			car02.style.left = parseInt(xIdx[p2p])+'px';
			car02.style.top = parseInt(yIdx[p2p])+'px';
		
			if(p2p>=11){car02.style.transform = "rotate(90deg)";}
			if(p2p>=12){car02.style.transform = "rotate(180deg)";}
			if(p2p>=22){car02.style.transform = "rotate(90deg)";}
			if(p2p>=23){car02.style.transform = "rotate(0deg)";}
			if(p2p>=33){car02.style.transform = "rotate(90deg)";}
			if(p2p>=34){car02.style.transform = "rotate(180deg)";}
			if(p2p>=44){car02.style.transform = "rotate(90deg)";}
			if(p2p>=45){car02.style.transform = "rotate(0deg)";}
			if(p2p>=55){p2p=55; car02.style.left = parseInt(xIdx[p2p])+'px'; alert("player02 WIN!");} // 결승점 통과 했을 경우, 알림.
			else{}
			a++;

			if(p2p==p1p){p1p=0; //위치 값이 같은 말 처음으로 이동
				car01.style.left = parseInt(xIdx[p1p])+'px';
				car01.style.top = parseInt(yIdx[p1p])+'px';
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

		else if(a==3){
			p3p+=dice;
			car03.style.left = parseInt(xIdx[p3p])+'px';
			car03.style.top = parseInt(yIdx[p3p])+'px';
		
			if(p3p>=11){car03.style.transform = "rotate(90deg)";}
			if(p3p>=12){car03.style.transform = "rotate(180deg)";}
			if(p3p>=22){car03.style.transform = "rotate(90deg)";}
			if(p3p>=23){car03.style.transform = "rotate(0deg)";}
			if(p3p>=33){car03.style.transform = "rotate(90deg)";}
			if(p3p>=34){car03.style.transform = "rotate(180deg)";}
			if(p3p>=44){car03.style.transform = "rotate(90deg)";}
			if(p3p>=45){car03.style.transform = "rotate(0deg)";}
			if(p3p>=55){p3p=55; car03.style.left = parseInt(xIdx[p3p])+'px'; alert("player03 WIN!");} // 결승점 통과 했을 경우, 알림.
			else{}
			a++;

			if(p3p==p1p){p1p=0; //위치 값이 같은 말 처음으로 이동
				car01.style.left = parseInt(xIdx[p1p])+'px';
				car01.style.top = parseInt(yIdx[p1p])+'px';
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

		else if(a==4){
			p4p+=dice;
			car04.style.left = parseInt(xIdx[p4p])+'px';
			car04.style.top = parseInt(yIdx[p4p])+'px';
		
			if(p4p>=11){car04.style.transform = "rotate(90deg)";}
			if(p4p>=12){car04.style.transform = "rotate(180deg)";}
			if(p4p>=22){car04.style.transform = "rotate(90deg)";}
			if(p4p>=23){car04.style.transform = "rotate(0deg)";}
			if(p4p>=33){car04.style.transform = "rotate(90deg)";}
			if(p4p>=34){car04.style.transform = "rotate(180deg)";}
			if(p4p>=44){car04.style.transform = "rotate(90deg)";}
			if(p4p>=45){car04.style.transform = "rotate(0deg)";}
			if(p4p>=55){p4p=55; car04.style.left = parseInt(xIdx[p4p])+'px'; alert("player03 WIN!");} // 결승점 통과 했을 경우, 알림.
			else{}
			a=1;

			if(p4p==p1p){p1p=0; //위치 값이 같은 말 처음으로 이동
				car01.style.left = parseInt(xIdx[p1p])+'px';
				car01.style.top = parseInt(yIdx[p1p])+'px';
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


}, 1000);

	}
