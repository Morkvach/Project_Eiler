package com.task1;

/*******************************************************
 *Найдите сумму всех чисел меньше 1000, кратных 3 или 5 *
 ********************************************************/

public class Numbers {
	public int numb(int i) {
		int sum = 0;
		final int LIMIT = 10;
		while (i < LIMIT) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {

		Numbers r = new Numbers();
		r.numb(3);
	}
}
