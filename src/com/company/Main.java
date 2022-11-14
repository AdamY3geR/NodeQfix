package com.company;
import com.company.Node;

public class Main {
    public static void main(String[] args) {
        Node<Integer> chain = new Node<Integer>(19,
                new Node<Integer>(18,
                        new Node<Integer>(4,
                                new Node<Integer>(19))));
        int x =19;
        System.out.println("there are "+numOfNums(chain)+" numbers in the chain"); //Q1
        System.out.println("the int x is in the chain? "+isNumInLst(x,chain)); //Q2
        System.out.println("the num x appear in the chain "+numOfAppearances(chain,x)+" times");

    }

    /**
     * the method check the number of nums in the chain
     * @param chain of Integers
     * @return boolean
     */
    public static int numOfNums(Node<Integer> chain) {
        int count=0;
        while (chain != null){
            count++;
            chain = chain.getNext();
        }
        return count;
    }

    /**
     * the method check if the given num is in the chain
     * @param x the given int
     * @param chain of integers
     * @return boolean
     */
    public static boolean isNumInLst(int x, Node<Integer> chain){
        while (chain != null) {
            if (x == chain.getValue())
                return true;
            else
                chain = chain.getNext();
        }
        return false;
    }

    /**
     * the method check how many times the int x appear in the chain
     * @param chain of integers
     * @param x the int
     * @return boolean
     */
    public static int numOfAppearances(Node<Integer> chain, int x){
        int num = 0;
        while (chain != null){
            if (chain.getValue() == x)
                num++;
            chain = chain.getNext();
        }
        return num;
    }
}
