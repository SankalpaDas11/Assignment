//Q.3 print the pattern
/* 1
 * 212
 * 32123
 * 4321234
 * 543212345
 */
public class MirrorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = 1; i <=num; i++) {
            for (int j = i ; j >= 1; j--) { // 1st loop to print the descending order
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) { // 2nd loop to print the ascending order
                System.out.print(k);
            }
            System.out.println();
        }
	}
}
