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
public interface Tree <D extends Comparable>{
public boolean isEmpty();
public int cardinality();
public boolean member(D elt);
public NonEmptyBst <D> add(D elt); 
}
