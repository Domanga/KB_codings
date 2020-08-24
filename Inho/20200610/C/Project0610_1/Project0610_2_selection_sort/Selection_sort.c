#include <stdio.h>
#define SIZE 15

int main() {
	int data[SIZE] = { 0, 5, 6, 2, 3, 4, 1, 9 };
	int i, j;
	int index, temp;

	for (i = 0; i < SIZE; i++) {
		index = i;

		for (j = i + 1; j < SIZE; j++) {
			if (data[index] > data[j] ) {
				index = j;
			}
		}
		if (i != index) {
			temp = data[i];
			data[i] = data[index];
			data[index] = temp;
		}
		printf("%2d", data[i]);
	}

	return 0;
}

