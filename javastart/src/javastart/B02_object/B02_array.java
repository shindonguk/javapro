package javastart.B02_object;

class team{
	//����
	String name;
	//������
	int totgame;
	//�¼�
	int vicCnt;
	//��
	int defCnt;
	//�·�
	double vicRatio;
	team(String name, int vicCnt, int defCnt){
		this.name=name;
		this.totgame=vicCnt+defCnt;
		this.vicCnt=vicCnt;
		this.defCnt=defCnt;

	}
	void showCur(){
		vicRatio = vicCnt/(double)totgame;
		System.out.println(name+"\t"+totgame+"\t"+vicCnt+"\t"+defCnt+"\t"+vicRatio);
	}
}
public class B02_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		team t = new team("���׷�",20,17);
		t.showCur();
		/*
		 * ��ü�迭
		 * 1. ��ü�迭 ũ�⼱��
		 * 	��ü[] ��ü�迭 =new person[5]; //5�� person��ü�� �� �� �ִ� �迭
		 * 2. ��ü�迭 ����, �Ҵ�
		 * ex)person[] p = {new person("���̸�"),new person("���̸�2"),new person("���̸�3")}
		 * 3. ��ü�迭�� ���� �޼��� Ȱ��
		 *  for(int idx=0; idx<p.lenght;idx++){
		 *  	p[idx].printAll(); //Ư�� �迭 ��ü ���ο� �ִ� ��ü�Ѱ��� �޼��� Ȱ��
		 *  }
		 *  for(person ps:p){
		 *  	p.printAll();
		 *  	}
		 */
		team[] tArray01 = new team[3];
		tArray01[0] = new team("�λ꺣����",21,18);
		tArray01[1] = new team("�ؼ����̾�Ʈ",19,18);
		tArray01[2] = new team("���Ÿ�̰�",17,14);
		for(team tm:tArray01){
			tm.showCur();
		}
		team[] tArray02 = {new team("LA������",30,10),
						   new team("��̿츮 ���̾���",5,27),
						   new team("�Ｚ���̿���",12,16),			
							};
		for(int idx=0; idx<tArray02.length;idx++){
			tArray02[idx].showCur();
		}
		

}
}
