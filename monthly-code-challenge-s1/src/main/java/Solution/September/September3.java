package Solution.September;

public class September3 { //풍선 터트리기
	
    public int solution(int[] a) {
        int answer = 0;      

    	int l = 1000000000, r = 1000000000;

    	for (int i = 0; i < a.length; i++) {
    		if (a[i] < l) {
    			answer++;
    			l = a[i];
    		}

    		if (a[a.length - 1 - i] < r) {
    			answer++;
    			r = a[a.length - 1 - i];
    		}

    		if (l == r)
    			break;
    	}
    	
    	return answer + (-1);
    }

}
