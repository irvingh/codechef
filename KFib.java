public class KFib {
	private final static int M = 1000000007;
	private long[] kf;
	public long solve(int n, int k) {
		if (kf==null) kf = new long[n + 1];
		if (n<=k) return 1;
		if (kf[n]!=0) return kf[n];
		long res = 0;
		for (int i=1; i<=k; i++) {
			kf[n-i] = solve(n-i, k) % M;
			res += kf[n-i];
		}
		return res;
	}
}