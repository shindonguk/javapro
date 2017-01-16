/*
 * 무지
 */
function muzi(num,move,idx4) // num : 말 번호
{

	if (player_turn == 1) // 1팀턴인지 2팀턴인지 판단함( 1은 1팀의 이동을 턴)
	{
		if (move != 0) 
		{
			move_min(idx4);
			move_stack--;
			player_msg_call = "";
			checkLump(num); // /업기 확인 업기
			out[num] += move; // 1팀턴일때만 이동
			g[num] += move;
			s[num] += move;
			if(output1[idx4]=="")
				{
				output1[idx4+1] = "";
				}
			else
				{
				output1[idx4] = "";
				}
			if (move_stack == 0) 
			{
				player_turn = 4; // 이동후 변수이름을 바꿔줌 ( 4은 2팀의 윷을 던지는 턴)
				output2 = "";
				move_yut2 = '<img src="../imgs/lion.gif" style="position: absolute; left: 720px; top: 400px; width="200" height="200">';
				move_idx = 0;
			}
			checkCatch(num); // 잡기 확인 및 잡기
			ascore(num); // 스코어 연산 함수
			
			catch_in();
			for(var a=0;a<5;a++)
			{div2[a] = "";}
			
			div2[idx4];
			view(); // 현재상태 그리기
			
			move = 0;
		} 
		else 
		{
			move_button();
		}
	}
	else if (player_turn == 2) 
	{
		for(var a=0;a<5;a++)
		{div2[a] = "";}
		player_msg_yut();
	}
	else if (move == 0) 
	{
		move_button();
	}
	else 
	{
		yut_msg();
	}
}

/*
 * 라이언
 */
function ryan(num,move,idx4) 
{
	if (player_turn == 2) 
	{
		if (move != 0) 
		{
			move_min(idx4);
			move_stack--;
			player_msg_call = "";
			checkLump(num);
			out[num] += move;
			g[num] += move;
			s[num] += move;
			if(output1[idx4]=="")
			{
			output1[idx4+1] = "";
			}
			else
			{
			output1[idx4] = "";
			}
			if (move_stack == 0) 
			{
				player_turn = 3; // 이동후 변수이름을 바꿔줌 ( 4은 2팀의 윷을 던지는 턴)
				output2 = "";
				move_yut2 = '<img src="../imgs/muzi2.gif" style="position: absolute; left: 720px; top: 400px;" width="200" height="200">';
				move_idx = 0;
			}
			checkCatch(num);
			bscore(num);
			
			catch_in();
			for(var a=0;a<5;a++)
			{div2[a] = "";}
			view();
			move = 0;
			
		}
		else
		{
			move_button();
		}
	}
	else if (player_turn == 1)
	{
		for(var a=0;a<5;a++)
		{div2[a] = "";}
		player_msg_yut();
	}
	else if (move == 0)
	{
		move_button();
	} 
	else 
	{
		yut_msg();
	}
}