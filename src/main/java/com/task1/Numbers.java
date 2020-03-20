package com.task1;

/*******************************************************
 *Найдите сумму всех чисел меньше 1000, кратных 3 или 5 *
 ********************************************************/

public class Numbers {
	public int ShowNumbs(int i) {
		int Sum = 0;
		while (i < 999) {
			i++;
			if (i % 3 == 0 || i % 5 == 0) {
				Sum += i;
			}
		}
		return Sum;
	}

	public static void main(String[] args) {

		Numbers r = new Numbers();
		r.ShowNumbs(1);
	}
}
