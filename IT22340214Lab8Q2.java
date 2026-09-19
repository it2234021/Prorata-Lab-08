public class IT22340214Lab8Q2 {

    public static void main(String[] args) {
	
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[A.length];

        // Print A Array Contents
        System.out.print("A Array Contents: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // Print B Array Contents
        System.out.print("B Array Contents: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        // Calculate A + B and store in Array C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Print C Array Contents (A + B)
        System.out.print("C Array Contents (A + B): ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}