package javastart.b02_array;

public class A04_InitArrayExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1�ܰ� Ȯ�ο���..
		�����: ����, ����, ����
		����:    80    90    70
		�� ������ ����� �Ҵ��� �ٷ��ϸ鼭 ó���ϰ�..
		for( ������ü: �迭��ü) ���·� ����ϼ���..
		*/
		String []subjects={"����","����","����"};
		int []points={80,70,90};
		System.out.print("�����:");
		for(String subject:subjects){
			System.out.print(subject+",\t");
		}
		System.out.print("\n��  ��:");
		for(int point:points){
			System.out.print(point+"\t");
			
		}		
		/*
		2�ܰ� : �������, ����ϰ�.
		�������� - ����� 
		 * */	
		/*
		int tot=0;
		int lowIdx=0;
		int lowpnt=0; // �ʱⰪ setting 
		              // ������ - ���ü� �� �� �ְ��� setting
		              // �ְ� - 0
		for(int idx=0;idx<points.length;idx++){
			if(idx==0){   // �������̱� ������ �ʱⵥ���� setting�ʿ�.
				lowpnt=points[idx];
			}
			tot+=points[idx]; // ����� ���� ����..
			if(lowpnt>points[idx]){ // ���� �������� ���� ������
				lowpnt=points[idx];
				lowIdx=idx;   // �ش� index���� ������ ������, ����� ȣ��� �� �մ�.
			}
			
		}	
		*/
		int tot=0;
		int lowIdx=0;
		int lowpnt=100; // ���� �� �ִ� �ְ����� setting
		int idx=0;  // ������� �����;� �ϱ⿡ index���� ȣ��..
		for(int point:points){
			tot+=point;
			if( point < lowpnt ){ // ���� ������ ���� ������������ ���� ��..
				lowpnt=point;
				lowIdx=idx; // ����� �������� ���� index����
			}
			idx++;		
		}	
		System.out.println("\n���:"+tot/points.length);
		System.out.println("��������:"+subjects[lowIdx]);
		System.out.println("��������:"+points[lowIdx]);	
		
		
	}

}
