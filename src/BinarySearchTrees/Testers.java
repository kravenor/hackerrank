/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTrees;

import java.util.Random;

/**
 *
 * @author Simone
 */
public class Testers {

    public static int rndInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public static Tree rndTree(int count) {
        if (count == 0) {
            return new EmptyBST();
        } else {
            return rndTree(count - 1).add(rndInt(0, 50));
        }
    }

    public static void checkIsEmpty(Tree t) throws Exception {
        if (t instanceof EmptyBST) {
            if (!t.isEmpty()) {
                throw new Exception("All is not good, the Tree is an EmptyBST and is not empty.");
            }
        } else if (t instanceof NonEmptyBst) {
            if (t.isEmpty()) {
                throw new Exception("All is not good, the Tree is an NonEmptyBST and is empty.");
            }
        }
    }

    public static void checkAddMemberCardianlity(Tree t, int x) throws Exception {
        int nT = t.add(x).cardinality();
        //Either something was added-> 
        if (nT == (t.cardinality()) + 1) {
            if (t.member(x)) {
                throw new Exception("The cardinality increased by 1, but the thing that was added "
                        + "was alredy a member of the tree");
            }
            /*else {
                System.out.println("All is good");
            }*/
        } else if (nT == (t.cardinality())) {
            if (!t.member(x)) {
                throw new Exception("We added a new thing but the cardinality is not encreased.");
            }/* else {
             System.out.println("All is good the cardinality isn't incresed");   
            }*/
        } else {
            throw new Exception("Something is wrong with our program");
        }
    }
}
