package rekursia;
//תרגילי ריקורסיה עם מערכים עמוד 27
public class hw2 {

	public static int exe14(int[]a,int i) {
		if(i==0) {
			return a[0];
		}
		return a[i]+exe14(a,i-1);
	}
	
	public static int exe15 (int []a, int i) {
		if(i==-1) {
			return 0;
		}
		if(a[i]>0) {
			return 1+exe15(a, i-1);
		}
		return exe15(a,i-1);
	}
	
	public static int exe16(int[]a, int n,int i) {
		// i start with 0
		if(i==a.length) {
			return -1;
		}
		if(a[i]==n) {
			return i;
		}
		return exe16(a,n,i+1);
	}
	
	public static boolean exe17(int[]a, int i) {
		if(i==a.length-1) {
			if(a[i]<a[i-1]) {
				return false;
			}
			return true;
		}
		if(a[i+1]<a[i]) {
			return false;
		}
		return exe17(a,i+1);	
	}
	public static boolean exe18(int[]a,int i) {
		if(i==a.length-1) {
			if(f8(a[i],a[i]-1)==true) {
				return false;
			}
			return true;
		}
		if(f8(a[i],a[i]-1)==true) {
			return false;
		}
		return exe18(a,i+1);
	}
	
	public static boolean f8(int n1,int n2) {
		if(n2<=1) {
			return true;
		}
		else if(n1%n2==0) {
			return false;
		}
		return f8(n1,n2-1);		
	}
	
	public static int exe19(int[][]a, int n,int i) {
		if (i==0) {
			if(exe19_2(a[i], n, a[i].length-1)==true) {
				return 1;
			}	
			return 0;
		}
		if(exe19_2(a[i], n, a[i].length-1)==true) {
			return 1+exe19(a,n,i-1);
		}
		return exe19(a, n,i-1);
		
	}
 
	public static boolean exe19_2(int []a, int n, int i) {
		if(i==0) {
			if(a[i]==n) {
				return true;
			}
			return false;
		}
		if(a[i]==n) {
			return true;
		}
		return exe19_2(a,n,i-1);
	}
	
	public static boolean exe20(int[]a, int x, int y) {
		int x1,x2;
		if(x==y) {
		while(x==y) {
			x=(int)(Math.random()*(a.length));
			y=(int)(Math.random()*(a.length));
		}
			if(x>y) {
				 x1=x;
				 x2=y;
			}
			else {
				 x1=y;
				 x2=x;
			}
	
		}
		else {
			 x1=x;
			 x2=y;
		}
		if(a[x1]!=a[x2]) {
			return false;
		}
		if(x1-x2==1||x1-x2==2) {
			return true;
		}
		
		return exe20(a, x1--,x2++);
		
		
	}
	public static void main(String[] args) {
		int []a= {1,2,3,2,1};
		System.out.println(exe20(a,0,0));

	}

	
}
