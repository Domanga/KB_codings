#include <stdio.h>
#define SIZE 15

int main() {
	int data[SIZE] = { 0, 5, 6, 2, 3, 4, 1, 9 , 11, 12 ,16, 29, 24, 55, 34 };
	int i, j;
	int index, temp;

	for (i = 0; i < SIZE; i++) {

		for (j = i + 1; j < SIZE; j++) {
			if (data[i] < data[j]) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		printf("%3d", data[i]);
	}

	return 0;
}