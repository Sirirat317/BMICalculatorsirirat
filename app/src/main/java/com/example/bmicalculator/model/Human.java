package com.example.bmicalculator.model;

/**
 * Created by Kmsuju on 23/10/2559.
 */

public class Human {
    String sum;

    public Human(String Height, String Weight) {
        this.sum = Height;
        this.sum = Weight;
    }

    public void calHi(double H) {
        String hi = String.valueOf(H);

    }

    public void calWe(double W) {
        String w1 = String.valueOf(W);
    }

    public void cal(double Height, double Weight) {
        sum = String.valueOf(Weight / (Height * 2));

    }

    public String get() {
        return sum;
    }

    /*public String getdata() {
        double data = Double.parseDouble(sum);

        if (data < 18.5) {
            return " นําหนกัน้อยกว่าปกติ (ผอม)";
        } else if (data >= 18.5 || data < 25) {
            return "นําหนกัปกติ";
        } else if (data >= 25 || data < 30) {
            return "นําหนกัมากกวา่ปกติ (ท้วม) ";
        } else if (data >= 30) {
            return "นําหนกัมากกวา่ปกติมาก (อ้วน)";
        }
            return null;
        }
*/
}

