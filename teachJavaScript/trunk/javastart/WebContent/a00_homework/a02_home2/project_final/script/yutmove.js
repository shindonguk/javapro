
function call()//윷 던지기를 클릭하면 발동하는 함수 윷던지기의 모션을 출력해준다
	{
		if(player_turn==3 ||player_turn==4)
		{
		output2="";
		move_yut='<img src="../imgs/moveyut2.gif" style="position: absolute; left: 570px; top: 100px;">';
		move_yut2="";
		view();
		move_yut="";
		setTimeout(make_move,300);
		}
		else 
		{
			player_msg_yut();
		}
	}

function make_move() // 윷던지기 2차 함수 이동할 거리를 만들고 변경된 이미지를 보여준다
	{
	turn_msg=""; // 윷을 던지면 초기화

	if(player_turn==4 )  //1번 유저가 움직인 이후이면 2번 유저의 턴으로
	{player_turn=2;}

	if(player_turn==3)	//2번 유저가 움직인 이후이면 1번 유저의 턴으로 변경한다
	{player_turn=1;}

 	var a=0;	  
	var y=Math.floor(Math.random()*10000); //도개걸윳모 확률에 따라 분배
	
		if(y<1536)
		{
		a=0;
		move1[(move_idx)]=a+1; // 이동값에 해당 결과값 전송
		move_stack++;
		idx=move_idx; //함수에서 현재 idx값을 간직하기 위해 만든 변수
		output1[move_idx]='<img src="../imgs/do2.png" style="position: absolute; left: '+(700+move_idx*70)+'px; top: 113px;" onclick="move_min('+idx+')">';
		}
		
		else if(y<4792)
		{
		a=1;
		move1[(move_idx)]=a+1; // 이동값에 해당 결과값 전송
		move_stack++;
		idx=move_idx;
		output1[move_idx]='<img src="../imgs/ge2.png" style="position: absolute; left: '+(700+move_idx*70)+'px; top: 113px;" onclick="move_min('+idx+')">';
		}

		else if(y<8048)
		{
		a=2;
		move1[(move_idx)]=a+1; // 이동값에 해당 결과값 전송
		move_stack++;
		idx=move_idx;
		output1[move_idx]='<img src="../imgs/ger2.png" style="position: absolute; left: '+(700+move_idx*70)+'px; top: 113px;" onclick="move_min('+idx+')">';
		}

		else if(y<9344)
		{
		a=3;
		move_stack++;
		idx=move_idx;
		output1[idx]='<img src="../imgs/yoot2.png" style="position: absolute; left: '+(700+move_idx*70)+'px; top: 113px;" onclick="move_min('+idx+')">';
		move_idx++;
		move1[idx]=a+1; // 이동값에 해당 결과값 전송
		player_turn+=2;
		}
		
		else
		{
		a=4;
		move_stack++;
		idx=move_idx;
		output1[idx]='<img src="../imgs/mo2.png" style="position: absolute; left: '+(700+move_idx*70)+'px; top: 113px;" onclick="move_min('+idx+')">';
		move_idx++;
		move1[idx]=a+1; // 이동값에 해당 결과값 전송
		player_turn+=2;
		}
	yyut=yut00[a];
	
	for(var i=0;i<5;i++)
	{div2[i] = "";}
	
	output2='<img src="../imgs/'+yyut+'" style="position: absolute; left: 620px; top: 200px;">';
	view();
	
	if(a==3 || a==4)
	{
		setTimeout(yutmo_turn,700);// 0.7초 후에 던짐
	}
}

function yutmo_turn()//윳이나 모면 한번더 던짐
{
	if(player_turn==3)
	{
		output2="";
		move_yut2='<img src="../imgs/muzi2.gif" style="position: absolute; left: 720px; top: 400px;" width="200" height="200">';
	}
	else if(player_turn==4)
	{
		output2="";
		move_yut2='<img src="../imgs/lion.gif" style="position: absolute; left: 720px; top: 400px; width="200" height="200">';
	}
	view();
}

function move_min(idx2) //이동 할때 도개걸윷모 사라지게 만드는 함수
{
	idx3=idx2;
	move=move1[idx2];
	view();
}






