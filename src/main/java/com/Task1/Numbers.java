package com.Task1;

    /*******************************************************
    *Найдите сумму всех чисел меньше 1000, кратных 3 или 5 *
    ********************************************************/

public class Numbers {

        public void ShowNumbs(int i) {
            int Sum = 0;
                while (i < 999) {
                    i++;
                    if (i % 3 == 0 || i % 5 == 0) {
                        Sum += i;
                    }
                }
            System.out.println("Sum: " + Sum);
        }

        public static void main(String[] args) {

            Numbers r = new Numbers();
            r.ShowNumbs(1);
        }

    }
