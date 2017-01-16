function pan(num) // 캐릭터를 클릭하면 발판이 생김
{
	
	setShorCut(num); // 지름길 연산 함수
	if (num <= 3)// 무지이면
	{
		if (player_turn == 1) 
		{
			for (var a = 0; a < 10; a++)// 현재 주사위를 던진 총수 만큼 발판을 그림
			{
				if (output1[a] != "") 
				{
					div2[a] = '<img style="position: absolute; left: '
							+ (garo[num][(g[num] + move1[a])] - 20)
							+ 'px; top: '
							+ (sero[num][(s[num] + move1[a])] - 20)
							+ 'px;" src="../imgs/pan.png" onclick="muzi(' + num
							+ ',' + move1[a] + ',' + a + ')" >';
				}
			}
		} 
		else if(player_turn ==2)
		{
			player_msg_yut();
		}
		else
			{
			yut_msg();
			}
	} 
	else if (num > 3)// 라이언이면
	{
		if (player_turn == 2) 
		{
			for (var a = 0; a < 10; a++) 
			{
				if (output1[a] != "") 
				{
					div2[a] = '<img style="position: absolute; left: '
							+ (garo[num][(g[num] + move1[a])] - 20)
							+ 'px; top: '
							+ (sero[num][(s[num] + move1[a])] - 20)
							+ 'px;" src="../imgs/pan.png" onclick="ryan(' + num
							+ ',' + move1[a] + ',' + a + ')" >';
				}
			}
		} 
		else if(player_turn==1)
		{
			player_msg_yut();
		}
		else
			{
			yut_msg();
			}
	}

	view();
}
