
function ascore(a)// 1팀 스코어 연산 함수
{
	var a_1=a;// a, a_1은 해당말의 번호 -1
	if( out[a_1]>=40)// 자신의 위치가 마지막칸을지났으면 
	{
		score1++;//팀의 점수를 올리고 제자리로 돌아감
		g[a_1]=40;
		s[a_1]=40;
		win_msg();//승리 메시지
		
		view();
	}
}

function bscore(a)// 2팀 스코어 연산 함수
{
	var a_1=a;// a, a_1은 해당말의 번호 -1
	if( out[a_1]>=40)// 자신의 위치가 마지막칸을지났으면 
	{
		score2++;//팀의 점수를 올리고 제자리로 돌아감
		g[a_1]=40;
		s[a_1]=40;
		win_msg();// 승리메시지
		view();
	}
}

/*
 * 지름길 연산함수
 */
function setShorCut(num)
{
	if(g[num]==5)
	{
		g[num]=21;
		s[num]=21;
		out[num]=21;//캐릭터의 현재위치를 확인하기 위한 변수
	}
	
	if(g[num]==10)
	{
		g[num]=33;
		s[num]=33;
		out[num]=33;
	}
	
	if(g[num]==15 ||g[num]==27)
	{
		out[num]=34;
	}
	
	if(g[num]==16||g[num]==28)
	{
		out[num]=35;
	}
	
	if(g[num]==17||g[num]==29)
	{
		out[num]=36;
	}
	
	if(g[num]==18||g[num]==30)
	{
		out[num]=37;
	}
	
	if(g[num]==19||g[num]==31)
	{
		out[num]=38;
	}
	
	if(g[num]==20||g[num]==32)
	{
		g[num]=39;
	}
	
	if(g[num]==24)
	{
		g[num]=36;
		s[num]=36;
		out[num]=36;
	}
	
	if(g[num]==32)
	{
		g[num]=39;
		s[num]=39;
		out[num]=39;
	}
}

/*
 player_turn = 1 // 1팀의 이동턴
 player_turn = 2 // 2팀의 이동턴
 player_turn = 3 // 1팀의 윷을 던질 턴
 player_turn = 4 // 2팀의 윷을 던질 턴
 */

