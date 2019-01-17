package cc.openhome;

public class Shuffle {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		//num[10] = 1,2,3,4,5,6,7,8,9,10
		
		int[] arr = new int[10];  //ノㄓ竚睹计
		
		int n;
		for(int i = 0; i < arr.length; i++)
        {
            n = (int)(Math.random()*(10-i));   //穦盢ǐ计琵计滦籠 ┮程计﹚礚ノ
            arr[i] = num[n];                  //眖1~10ヴ種1计arr皚
            for(int j = n; j < num.length - 1; j++)
            {
                num[j] = num[j+1];            //盢ǐ计琵计滦籠
            }
        }
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
