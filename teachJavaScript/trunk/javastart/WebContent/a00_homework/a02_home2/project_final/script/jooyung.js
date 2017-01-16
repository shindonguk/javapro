//var R = (0<=R<1);
//var R_col = parseInt(Math.random()*4+1)
 var sero=[581,494,408,318,232,146,146,146,146,146,146,232,318,408,494,581,581,581,581,581,600,218,290,364,437,509,218,290,437,509,619] // 세로
 var garo=[577,577,577,577,577,577,490,402,315,227,140,140,140,140,140,140,227,315,402,489,595,505,431,358,285,212,212,285,431,505,613] // 가로


window.onload=function(){
	setInterval(TD, 1000);
}

function TD()
{
var TD_LIST='<table border="1">'+'<tr>'+'<td style="position: absolute; left: '+garo[0]+'px; top: '+sero[0]+'px; z-index: 250">'+'00'+'</td>';
for(var i=1; i<=30; i++)
	{
	TD_LIST+='<td style="position: absolute; left: '+garo[i]+'px; top: '+sero[i]+'px; z-index: 250">'+i+'</td>';
	}
document.body.innerHTML=TD_LIST+"<input type='button'; onclick='td_color()' value='쓸데없는 버튼';>";
//..html/ground.html.body.inert
}

function td_color(){
	var td_list = document.getElementsByTagName("td");

	var abc=["red", "yellow", "blue", "green"];

	for(var i=0; i<31; i++)
		{td_list[i].style.background=abc[i%4];} //i%4

	} //obj.style.background=colors


