/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTrees;

/**
 *
 * @author Simone
 */
class NonEmptyBst<D extends Comparable> implements Tree<D> {

    D data;
    Tree<D> left;
    Tree<D> right;

    public NonEmptyBst(D elt) {
        data = elt;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBst(D elt, Tree<D> leftTree, Tree<D> rightTree) {
        data = elt;
        left = leftTree;
        right = rightTree;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return (1 + left.cardinality() + right.cardinality());
    }

    @Override
    public boolean member(D elt) {
        if (data == elt) {
            return true;
        } else if (elt.compareTo(data) < 0) {
            return left.member(elt);
        } else {
            return right.member(elt);
        }

    }

    @Override
    public NonEmptyBst<D> add(D elt) {
        if (data == elt) {
            return this;
        } else if (elt.compareTo(data) < 0) {
            return new NonEmptyBst<>(data, left.add(elt), right);
        } else {
            return new NonEmptyBst<>(data, left, right.add(elt));
        }

    }

}
