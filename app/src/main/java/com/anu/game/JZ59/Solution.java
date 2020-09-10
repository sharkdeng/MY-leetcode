package com.anu.game.JZ59;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> re = new ArrayList<>();
        re.add(new ArrayList<Integer>());
        re.add(new ArrayList<Integer>());
        re.add(new ArrayList<Integer>());
        re.get(0).add(8);

        re.get(1).add(6);
        re.get(1).add(10);

        re.get(2).add(5);
        re.get(2).add(7);
        re.get(2).add(9);
        re.get(2).add(11);
        Collections.reverse(re.get(1));
        for (int i=0; i<re.size(); i++){
            for (int j=0; j<re.get(i).size(); j++) {
                System.out.print(re.get(i).get(j));
            }
            System.out.println();
        }
    }
}
