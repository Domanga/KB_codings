#include<stdio.h>

int main() {
	int res[9][9];
	int i, j;

	for (i = 0; i < 9; i++) {
		for (j = 0; j < 9; j++) {
			res[i][j] = (i + 1) * (j + 1);
			printf("%2d *%2d =%3d ", i + 1, j + 1, res[i][j]);
		}
		printf("\n\n");
	}

}