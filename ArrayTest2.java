
public class ArrayTest2 {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		for (int i=0; i<poker.length; i++){
			int tempi = (int)(Math.random()*(poker.length-i));
			int tempv = poker[tempi];
			poker[tempi] = poker[poker.length-i-1];
			poker[poker.length-i-1] = tempv;
		}
		for(int v : poker) System.out.println(v);
		
		// 發牌  
		
		// 攤牌

	}

}
