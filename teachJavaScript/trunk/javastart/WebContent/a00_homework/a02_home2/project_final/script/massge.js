
function yut_msg()// 윷을 던져주세요 메시지 출력문
{
	turn_msg = '<img style="position: absolute; left: 0px; top: 280px;" src="../imgs/playyut.png"  >';
	view();
}

function win_msg()// 승리 메시지
{
	if(score1>=4)
	{
	 win1='<img style="position: absolute; left: 0px; top: 280px;" src="../imgs/win_01.png"  >';
	}
	
	else if(score2>=4)
	{
		 win2='<img style="position: absolute; left: 0px; top: 280px;" src="../imgs/win_02.png"  >';
	}
}

function player_msg2() // 플레이어 턴일때 보여지는 메시지(화살표 깜빡이게 표현)
{
	setTimeout(player_msg_call2,10);
	setTimeout(player_msg_call3,300);
	setTimeout(player_msg_call2,600);
	setTimeout(player_msg_call3,900);
}


function player_msg_call2()//화살표 보임
{
	player_msg_call=player_msg;
	view();
}


function player_msg_call3()//화살표 안보임
{
	player_msg_call="";
	view();
}

function player_msg_yut() //윷에서 화살표 뜨게 할때 쓰는 함수 
{
	if(player_turn==2)
	{
	player_msg='<img src="../imgs/turn01.png" style="position: absolute; left: 20px; top: 680px; width="70" height="70">';
	player_msg2();
	}
	else if(player_turn==1)
	{
	player_msg='<img src="../imgs/turn01.png" style="position: absolute; left: 20px; top: 20px; width="70" height="70">';
	player_msg2();
	}
}

function move_button() //이동하기위한 버튼..? 함수..
{
	//위에거랑 똑같아서 변수그냥 재사용
	player_msg='<img src="../imgs/turn01.png" style="position: absolute; left: 620px; top: 80px; width="70" height="70">';
	player_msg2();
}

