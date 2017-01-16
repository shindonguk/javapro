
<!--주사위-->
	
		var p1p=0;
		var p2p=0;
		var p3p=0;
		var p4p=0; //플레이어 위치값
		/*시작 인원 */
		 
		
		var a =0 ;
	
		function game(){
			var R= Math.random();
			var dice1=document.getElementById("dice");
			var dice=parseInt((R*6)+1);
			dice1.innerHTML=dice; 			// 주사위 값 확인
			
		
		
			//***주사위 플레이어 순서데로 입력
			if(a%4==0){ //player01 순서
				
//				ths=document.getElementById(p1p); // p1p는 숫자값 = th의 id 값도 숫자로 되어 있음
//				ths.innerHTML=p1p;				  // 비어있을 th 칸에 원래 숫자값을 입력
//				p1p+=dice;						  // 주사위 나온 값을 더함
//				if(p1p>=55){p1p=55; alert("player01 WIN!");} // 결승점 통과 했을 경우, 알림.
//				else{}
//				ths=document.getElementById(p1p); // 새로운 id에 해당하는 th 정보 
//				ths.innerHTML=document.getElementById("div01").outerHTML;
//				a++;
//				if(p1p==p2p){p2p=0; //위치 값이 같은 말 처음으로 이동
//					ths=document.getElementById(p2p); 
//					ths.innerHTML=document.getElementById("div02").outerHTML;}
//				else if(p1p==p3p){p3p=0;
//					ths=document.getElementById(p3p); 
//					ths.innerHTML=document.getElementById("div03").outerHTML;}
//				else if(p1p==p4p){p4p=0;
//					ths=document.getElementById(p4p); 
//					ths.innerHTML=document.getElementById("div04").outerHTML;}
//				else{}
			}

			else if(a%4==1){ //player02 순서
				ths=document.getElementById(p2p);
				ths.innerHTML=p2p;
				p2p+=dice;
				if(p2p>=55){p2p=55; alert("player02 WIN!");}
				else{}
			    ths=document.getElementById(p2p);
			    ths.innerHTML=document.getElementById("div02").outerHTML;
			    a++;
				if(p2p==p3p){p3p=0;
					ths=document.getElementById(p3p); 
					ths.innerHTML=document.getElementById("div03").outerHTML;}
				else if(p2p==p4p){p4p=0;
					ths=document.getElementById(p4p); 
					ths.innerHTML=document.getElementById("div04").outerHTML;}
				else if(p2p==p1p){p1p=0;
					ths=document.getElementById(p1p); 
					ths.innerHTML=document.getElementById("div01").outerHTML;}
				else{}
			}
			
			else if(a%4==2){ //player03 순서
				ths=document.getElementById(p3p);
			  	ths.innerHTML=p3p;
			 	p3p+=dice;
				if(p3p>=55){p3p=55; alert("player03 WIN!");}
				else{}
           		ths=document.getElementById(p3p);
            	ths.innerHTML=document.getElementById("div03").outerHTML;
            	a++;
				if(p3p==p4p){p4p=0;
					ths=document.getElementById(p4p); 
					ths.innerHTML=document.getElementById("div04").outerHTML;}
				else if(p3p==p1p){p1p=0;
					ths=document.getElementById(p1p); 
					ths.innerHTML=document.getElementById("div01").outerHTML;}
				else if(p3p==p2p){p2p=0;
					ths=document.getElementById(p2p); 
					ths.innerHTML=document.getElementById("div02").outerHTML;}
				else{}
			}
			
			else if(a%4==3){ //player04 순서
				ths=document.getElementById(p4p);
			 	ths.innerHTML=p4p;
			 	p4p+=dice;
				if(p4p>=55){p4p=55; alert("player04 WIN!");}
				else{}
             	ths=document.getElementById(p4p);
              	ths.innerHTML=document.getElementById("div04").outerHTML;
              	a=0;
				if(p4p==p1p){p1p=0;
					ths=document.getElementById(p1p); 
					ths.innerHTML=document.getElementById("div01").outerHTML;}
				else if(p4p==p2p){p1p=0;
					ths=document.getElementById(p2p); 
					ths.innerHTML=document.getElementById("div02").outerHTML;}
				else if(p4p==p3p){p2p=0;
					ths=document.getElementById(p3p); 
					ths.innerHTML=document.getElementById("div03").outerHTML;}
				else{}						 
			}
		};
		function myMove() {
		    var elem = document.getElementById("div01"); 
		    var pos = 0;
		    var id = setInterval(frame, 5);
		    function frame() {
		        if (pos == 50) {
		            clearInterval(id);
		        } else {
		            pos++; 
		            elem.style.bottom = pos + 'px';
		        }
		    }
		    
		}
		
		
