package BinarySearchTrees;

public class BinarySearchTrees {

    public static void main(String[] args) throws Exception {
        EmptyBST e = new EmptyBST();
        NonEmptyBst n = new NonEmptyBst(5);

        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkAddMemberCardianlity(e, 5);
        Testers.checkAddMemberCardianlity(n, 5);
        Testers.checkAddMemberCardianlity(n, 6);
        int tests = 1000;
        for (int i = 0; i < tests; i++) {
            Tree t;
            if (i % 10 == 0) {
                t = Testers.rndTree(0);
            } else {
                t = Testers.rndTree(10);
            }
            Testers.checkAddMemberCardianlity(t, i);
        }
    }
}
