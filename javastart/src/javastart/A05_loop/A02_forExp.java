package javastart.A05_loop;

public class A02_forExp {
	public static void main(String[] args) {
		/*
		 * for�� Ȱ��
		 * 1.�迭�� �Բ� ������ �Է�ó��
		 * 	�迭 length: �迭�� ũ�⸦ ���
		 * 2.�迭�� [index]�� ������ �� �ִ�.
		 * 	3���� ũ��迭, 0, 1, 2���� ������ �ִ�.
		 * 
		 */
		System.out.println("�Էµ� ������ ũ��: "+args.length);
		//0���� �����ؼ� �迭�� ũ�⺸�� 1���� ������ �����´�.
		int price = 0;
		int cnt = 0;
		//int tot = 0;
		for(int idx=0;idx<args.length;idx++){
			System.out.print(args[idx]+"\t");
			if(idx%3==1){
				price = Integer.parseInt(args[idx]);
		}
			if(idx%3==2){// 0: ���ϸ� 1: �ܰ� 2: ����
				// % �̿��ؼ� ������ �� �ٹٲ� ó��
				cnt = Integer.parseInt(args[idx]);
				System.out.print((price*cnt));
				System.out.println();
				//tot(price*cnt)
			// Ȧ�� �迭�� �����͸� �������� �ʹ�.
			/*if(idx%2 == 1){
			System.out.println("�迭 args["+idx+"]"+args[idx]);*/
		}
		}		
	}
}
