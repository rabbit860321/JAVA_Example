package cc.openhome;

public class Shuffle {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		//num[10] = 1,2,3,4,5,6,7,8,9,10
		
		int[] arr = new int[10];  //�Ψө�m�ü�
		
		int n;
		for(int i = 0; i < arr.length; i++)
        {
            n = (int)(Math.random()*(10-i));   //�]�|�N�����������U�@���л\ �ҥH�̫�@�Ƥ@�w�L��
            arr[i] = num[n];                  //�q1~10���N��1�Ʃ��arr�}�C
            for(int j = n; j < num.length - 1; j++)
            {
                num[j] = num[j+1];            //�N�����������U�@�Ӽ��л\
            }
        }
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
