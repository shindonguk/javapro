////////페이지 뷰 함수
function view() // 유동적인 페이지 내용 그리는 함수
{
	var div='<img style="position: absolute; left: '+80+'px; top: '+10+ 'px;" src="../imgs/1팀2.png" >';
	div+='<img style="position: absolute; left: '+(garo[0][g[0]]-20)+'px; top: '+(sero[0][s[0]]-20)+'px;" src="../imgs/1팀말1-2.gif" onclick="pan(0)" >';
	div+='<img style="position: absolute; left: '+(garo[1][g[1]]-20)+'px; top: '+(sero[1][s[1]]-20)+'px;" src="../imgs/1팀말2-2.gif" onclick="pan(1)" >';
	div+='<img style="position: absolute; left: '+(garo[2][g[2]]-20)+'px; top: '+(sero[2][s[2]]-20)+'px;" src="../imgs/1팀말3-2.gif" onclick="pan(2)" >';
	div+='<img style="position: absolute; left: '+(garo[3][g[3]]-20)+'px; top: '+(sero[3][s[3]]-20)+'px;" src="../imgs/1팀말4-2.gif" onclick="pan(3)" >';

	div+='<img style="position: absolute; left: '+80+'px; top: '+660+ 'px;" src="../imgs/2팀2.png"  >';
	div+='<img style="position: absolute; left: '+(garo[4][g[4]]-20)+'px; top: '+(sero[4][s[4]]-20)+'px;" src="../imgs/2팀말1-2.gif" onclick="pan(4)" >';
	div+='<img style="position: absolute; left: '+(garo[5][g[5]]-20)+'px; top: '+(sero[5][s[5]]-20)+'px;" src="../imgs/2팀말2-2.gif" onclick="pan(5)" >';
	div+='<img style="position: absolute; left: '+(garo[6][g[6]]-20)+'px; top: '+(sero[6][s[6]]-20)+'px;" src="../imgs/2팀말3-2.gif" onclick="pan(6)" >';
	div+='<img style="position: absolute; left: '+(garo[7][g[7]]-20)+'px; top: '+(sero[7][s[7]]-20)+'px;" src="../imgs/2팀말4-2.gif" onclick="pan(7)" >';

	div+='<input type="image" src="../imgs/yut_05.png" onclick="call()" style="position: absolute; left: 670px; top: 600px; width: "></input>';
	div+=move_yut;	//윷 던지기 모션 담는 변수 
	div+=move_yut2; //윷 던지기 모션 시간이 지나면 결과값 출력해줄 이미지
	div+=win1; //1팀 승리 메시지 출력
	div+=win2; //2팀 승리 메시지 출력
	div+=turn_msg; // 턴상태 메시지 출력
	div+=player_msg_call;//플레이어 메시지 출력을 위한(화살표) 이미지 저장변수
	div += output2; //결과값 보임
	div+=pass2;//패스 결과값
	div +=div2; //발판
	div += div3;

	for(var a=0;a<10;a++)
		{
		div+=output1[a]; //결과값 보임
		}
	pass();// 패스 함수
	
	
	div+='<input type="button" onclick="edit40()" value="+40!!"style="position: absolute; left: 170px; top: 800px; width: 100px;height: 50px;">';
	div+='<input type="button" onclick="edit1()" value="+1!!"style="position: absolute; left: 290px; top: 800px; width: 100px;height: 50px;">';
	div+='<input type="button" onclick="edit2()" value="+2!!"style="position: absolute; left: 410px; top: 800px; width: 100px;height: 50px;">';
	div+='<input type="button" onclick="edit3()" value="+3!!"style="position: absolute; left: 530px; top: 800px; width: 100px;height: 50px;">';
	div+='<input type="button" onclick="edit4()" value="+4!!"style="position: absolute; left: 650px; top: 800px; width: 100px;height: 50px;">';
	div+='<input type="button" onclick="edit5()" value="+5!!"style="position: absolute; left: 770px; top: 800px; width: 100px;height: 50px;">';
		
	div+='<img style="position: absolute; left: '+0+'px; top: '+0+ 'px;" src="../imgs/paint.png"  >';
	document.body.innerHTML=div;
}

//케릭터 통과시 pass마크 띄워주는 함수
function pass()
{
	for(var a=0; a<8;a++)
	{
		if(out[a]>=40)
		{
				pass2+='<img style="position: absolute; left: '+(garo[a][g[a]]-20)+'px; top: '+(sero[a][s[a]]-20)+'px; width: 70px; height: 70px" src= "../imgs/pass.png" >';			
		}
	}

}



