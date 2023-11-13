import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int pos = Integer.parseInt(st.nextToken()); //수빈이 현재 위치 
		int n = Integer.parseInt(st.nextToken()); // 동생의 위치 
		//동생이 뒤에 있으면 한 칸 씩 뒤로 가는 방법 밖에 없음
		// 동생이 앞에 있으면 순간 이동도 사용가능 
		if (pos <= n) { 
			int[] dp = new int[100001];  //수빈이가 갈 수 있는 위치의 범위, 배열 안에 있는 요소들은 그 위치(index)
			// 배열의 안의 요소값들은 해당 인덱스(거리) 까지 가는데 걸리는 횟수를 뜻함. 
			dp[pos] = 0; //  자기 자신의 위치는 아무런 위치 이동이 필요없기에 0으로 설정. 
			// 여기서 인덱스는 자기가 가고싶은 장소를 뜻함. 
			// 만약에 동생의 위치가 1이라면? 느낌으로 미리 값들을 채워줘야함.
			// 차근차근 올라가면서 특정위치까지 값을 채워가는 거 
			// Bottom-up 방식이라함.  ex 피보나치 수열 
			for (int i = pos-1 ; i >= 0; i--) {
				dp[i] = dp[i+1] +1; 
			}
			//특정 위치로 가는 최소 방법들을 체크 
			for (int i = pos + 1; i <= n; i++) {
				int min; // 최소값이 담길 변수 생성 
				if (i % 2 == 0) {  // 순간이동을 할 수 있을 때 
					min = dp[i/2] +1;  
				} else {
					//순간이동을 하지 못 한다면 
					// 한칸 앞으로 이동해서 순간이동을 하거나 
					// 한칸 뒤로 가서 순간이동을 해본다. 
					// 뒤로가는 거 +1개 소모 , 순간이동 1개 소모 그래서 +2가 들어감. 
					min = Math.min(dp[(i+1)/2] ,dp[(i-1)/2]) +2;
				}
				//이렇게 해서 나온 min값과  dp[i-1]+1 그냥 뒤의 값에서 +1(한칸 이동) 한 것 중에
				// 더 작은 값을 dp[i]에 넣는다.
				// 이게 가능한 이유는 각 인덱스의 요소들은 그 위치로 가는 최적의 해를 보장하기에 이게 성립됨.
				dp[i] = Math.min(dp[i-1]+1, min);
			}
			System.out.println(dp[n]);  // 동생이 있는 위치까지 가는 최단 거리 
		} else {
			//동생이 뒤에 있으면 걍 뒤로 가는 거 
			System.out.println(pos -n);
		}


	}
}
[출처] 백준 14501  퇴사, 백준 15486 , 백준1697 숨바꼭질 자바 dp 풀이|작성자 JongJae

