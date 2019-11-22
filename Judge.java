public class Judge {
	public static int findJudge(int N, int[][] trust) {
		//N = the amount of people
		int[] trusts = new int[N];
		//the amount of people that trust the town judge
		int[] trusted = new int[N];
		for (int[] p : trust) 
		{
			trusts[p[0] - 1]++;
			trusted[p[1] - 1]++;
		}
			int judge = -1;
			int num = 0;
		for (int i = 0; i < N; i++) 
		{
			//this applies to rule 1 and 2
			if (trusted[i] == N - 1 && trusts[i] == 0) 
			{
				judge = i + 1;
				num++;
			}
		}
		//this applies to rule 3 where there is only one judge
		if (num == 1) 
		{
			return judge;
		}
		return -1;
	}
}