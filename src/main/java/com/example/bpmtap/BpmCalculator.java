
package com.example.bpmtap;



public class BpmCalculator {
    public static void main(String[] args) {
        BpmCalculator calc = new BpmCalculator();
        System.out.println(calc.getBpm(new int[]{0, 500, 1000, 1500}));
    }


    public int getBpm(int[] array) {
        int sum = 0;
        int count = 0;
        if (array.length == 0 || array.length == 1) {
            return 0;
        }

        for (int i = 1; i < array.length; i++) {
            sum += array[i] - array[i - 1];
            count++;
        }

        int avg = sum / count;
        if (avg == 0) {
            return 0;
        } else {
            return 60000 / avg;
        }
    }
}
