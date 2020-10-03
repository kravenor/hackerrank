package BinarySearchTrees;

/**
 *
 * @author Simone
 */
public class EmptyBST<D extends Comparable> implements Tree<D> {

    public EmptyBST() {
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D elt) {
        return false;
    }

    @Override
    public NonEmptyBst<D> add(D elt) {
        return new NonEmptyBst<D>(elt);
    }

}
