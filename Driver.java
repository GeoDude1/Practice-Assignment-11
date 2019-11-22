public class Driver
	{
	public static void main(String[] args) {
		Judge judge = new Judge();
		//Example 1
		System.out.println(judge.findJudge(2, new int[][] { 
			{1, 2} } ));
		//Example 2
		System.out.println(judge.findJudge(3, new int[][] { 
			{1, 3}, {2, 3} } ));
		//Example 3
		System.out.println(judge.findJudge(3, new int[][] { 
			{1, 3}, {2, 3}, {3, 1} } ));
		//Example 4
		System.out.println(judge.findJudge(3, new int[][] { 
			{1, 2}, {2, 3} } ));
		//Example 5
		System.out.println(judge.findJudge(4, new int[][] { 
			{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3} } ));
		}
	}