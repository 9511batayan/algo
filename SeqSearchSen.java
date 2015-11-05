package algo;

//線形探索(番兵法)
import java.util.Scanner;
public class SeqSearchSen {

	//配列aの先頭n個の要素からkeyと一致する要素を線形探索(番兵法)
	static int seqsearchsen(int[] a,int n,int key){
		int i=0;

		a[n]=key;//番兵を追加

		while(true){
			if(a[i]==key)
				break;
			i++;
		}
		return i== n ? -1 : i;//本来のデータか、番兵を見つけたかどうかの判定
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("要素数 : ");
		int num=stdIn.nextInt();
		int[] x=new int[num+1];

		for(int i=0;i<num;i++){
			System.out.print("x["+i+"] : ");
			x[i]=stdIn.nextInt();
		}

		System.out.print("探す値 : ");
		int ky=stdIn.nextInt();

		int idx=seqsearchsen(x,num,ky);

		if(idx==-1)
			System.out.print("その値の要素は存在しません。");
		else
			System.out.print("その値はx["+idx+"]にあります。");
	}

}
