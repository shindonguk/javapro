package javastart.E01_string;

public class A04_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* wrapper Ŭ����: primitive data type�� ���ϴ� ������ ���·� ��ȯ ��
						��ɸ޼��� ������ ���� ��ü������ �ٲٴ� ���� ���Ѵ�.
		*/
			int num= 256;
			//�����ڸ� ���� primitive data ==> ��üȭ
			Integer warpInt = new Integer(num);
			System.out.println("�⺻���ڿ��� ��ȯ:"+warpInt.toString());
			//compareTo:���� �����ϸ�0, ������ -1, ũ�� +1
			System.out.println("compareTo:"+warpInt.compareTo(new Integer("350")));
			
			char grade ='A';
			System.out.println("Character :"+Character.toString(grade));
			double weight = 75.5;
			System.out.println("�⺻���ڿ��� ��ȯ:"+new Double(weight).toString());
			/*
			 *  ��ȯ ó��
			 *  Integer.parseInt("����������") ==> ����
			 *  Double.parseDouble("�Ǽ�������") ==> �Ǽ�
			 */
			String dblstr="76.7";
			System.out.println("Double.parseDouble:"+(Double.parseDouble(dblstr)+0.7));
	}

}