package com.company;

public class Main {
    public static void main(String[] args) {
        Node<Integer> chain = new Node<Integer>(19,
                new Node<Integer>(18,
                        new Node<Integer>(4,
                                new Node<Integer>(19))));
        Node<Integer> L = new Node<Integer>(4,
                new Node<Integer>(4,
                        new Node<Integer>(3,
                                new Node<Integer>(3,
                                        new Node<Integer>(3,
                                                new Node<Integer>(2,
                                                        new Node<Integer>(1,
                                                                new Node<Integer>(2,
                                                                        new Node<Integer>(4,
                                                                                new Node<Integer>(19,
                                                                                        new Node<Integer>(5)))))))))));
        int x = 2;
        System.out.println("there are "+numOfNums(chain)+" numbers in the Node chain"); //Q1
        System.out.println("the int x is in the Node chain? "+isNumInLst(x,chain)); //Q2
        System.out.println("the num x appear in the Node chain "+numOfAppearances(chain,x)+" times");
        int[] arr1 = isXListChecker(L,x);
        System.out.println("Is the Node L is Xlist? "+isXList(arr1, x));
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

    /**
     * the method make an array that helps find if  it's a Xlist
     * @param L Node
     * @param x Integer
     * @return Integer for isXlist
     */
    public static int[] isXListChecker(Node<Integer> L, int x) {
        int[] arr = new int[x];
            for (int i = 1; i <= arr.length; i++) {
                if (L.getValue() > x) {
                    L = L.getNext();
                    i = 1;
                }
                if (L.getValue() == (i)) {
                    arr[i-1] = arr[i-1] + 1;
                    L = L.getNext();
                    i = 1;
                }
            }
        return arr;
    }
    /**
     * the method get the value of isXListChecker and check if its true of false
     * @return boolean
     */
    public static boolean isXList(int []arr1, int x){
        int count = 0;
        for (int i = 0; i <= arr1.length; i++) {
            if (arr1[i] == i+1)
                count++;
        }
        if ((count)%x == 0 && count > 0)
            return true;
        else
            return false;
    }
}
