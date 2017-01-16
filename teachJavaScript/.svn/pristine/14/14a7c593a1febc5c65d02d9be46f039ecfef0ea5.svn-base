/*
 * 업기
 */
function checkLump(num) 
{
	for (var idx = 0; idx < out.length; idx++) 
	{
		g[idx] = checkEdge(g[num], g[idx]);	// 모서리에서 업기 상태일 때 같은 말판 위로 변경
		s[idx] = checkEdge(g[num], g[idx]);	// 모서리에서 업기 상태일 때 같은 말판 위로 변경
		if (num != idx && g[num] == g[idx]) 
		{
			if ((num == 0 || num == 1 || num == 2 || num == 3)
					&& (idx == 0 || idx == 1 || idx == 2 || idx == 3)
					&& (out[idx] != 0) && (out[idx] <40)) 
			{
				out[idx] += move;
				g[idx] += move;
				s[idx] += move;
				ascore(idx);
			} else if ((num == 4 || num == 5 || num == 6 || num == 7)
					&& (idx == 4 || idx == 5 || idx == 6 || idx == 7)
						&& (out[idx] != 0) && (out[idx] <40))
			{
				out[idx] += move;
				g[idx] += move;
				s[idx] += move;
				bscore(idx);
			}
		}
	}
}

function catch_in_in()
{
	div3 ="";
}


function catch_in() {
	if (catch2 == 1|| catch2==2) {
		move_idx++;
		if(catch2==1)
		{
		div3 ='<img src="../imgs/ch_muzi.gif" style="position: absolute; left: 200px; top: 300px;" width="400" height="400">';
		}

		else if(catch2==2)
		{
		div3 ='<img src="../imgs/ch_ryan.gif" style="position: absolute; left: 200px; top: 300px;" width="400" height="400">';
		}
		setTimeout(catch_in_in,900);
		view();
		catch2 = 0;
	}
}
/*
 * 잡기
 */
function checkCatch(num) 
{
	// alert("out[num](이동위치) : "+out[num]+"\n num(말) : "+num);
	for (var idx = 0; idx < out.length; idx++) 
	{
		if (num != idx && (g[num] == g[idx] || checkEdge(out[num], g[idx]) == g[num])) 
		{
			// 무지팀 순서일 때
			if ((num == 0 || num == 1 || num == 2 || num == 3)
					&& (idx == 4 || idx == 5 || idx == 6 || idx == 7)
						&& (out[idx] != 0) && (out[idx] <40))
			{
				setShorCut(idx);
				out[idx] = 0;
				g[idx] = 0;
				s[idx] = 0;
				player_turn = 3;
				output2 = "";
				move_yut2 = '<img src="../imgs/muzi2.gif" style="position: absolute; left: 720px; top: 400px;" width="200" height="200">';
				catch2 = 1;
				// 라이언 팀 순서일 때
			} else if ((num == 4 || num == 5 || num == 6 || num == 7)
					&& (idx == 0 || idx == 1 || idx == 2 || idx == 3)
						&& (out[idx] != 0) && (out[idx] <40))
			{
				setShorCut(idx);
				out[idx] = 0;
				g[idx] = 0;
				s[idx] = 0;
				player_turn = 4;
				output2 = "";
				move_yut2 = '<img src="../imgs/lion.gif" style="position: absolute; left: 720px; top: 400px; width="200" height="200">';
				catch2 = 2;
			}
		}
	}
}

/*
 * 모서리에 있을 때 업기가 가능하도록
 * 각 케릭터가 같은 배열에 있도록 변경해 줌
 */
function checkEdge(firstPlayer, secondPlayer){
	// 오른쪽 위 모서리
	if(firstPlayer == 21 && secondPlayer == 5){
		secondPlayer = firstPlayer;
	// 왼쪽 위 모서리
	} else if(firstPlayer == 33 && secondPlayer == 10){
		secondPlayer = firstPlayer;
	// 왼쪽 아래 모서리
	} else if(firstPlayer == 27 && secondPlayer == 15){
		secondPlayer = firstPlayer;
	// 가운데 모서리
	} else if(firstPlayer == 36 && secondPlayer == 24){
		secondPlayer = firstPlayer;
	// 결승점 모서리
	} 
	
	/*else if((firstPlayer == 20 || firstPlayer == 32 || firstPlayer == 39) && 
			(firstPlayer == 20 || firstPlayer == 32 || firstPlayer == 39)){
		secondPlayer = firstPlayer;
	}*/
	return secondPlayer;
}
