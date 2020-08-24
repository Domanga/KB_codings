#include<stdio.h>

int main() {
	int i, j;
	int gugu[72][3];
	int a = 2, b = 1;
	int count = 0;

	for (i = 0; i < 72; i++) {
		for (j = 0; j < 3; j++) {
			if (j == 0) {
				gugu[i][j] = a;
			}
			else if (j == 1) {
				gugu[i][j] = b;
			}
			else if (j == 2) {
				gugu[i][j] = a * b;
			}
			printf("%4d", gugu[i][j]);
		}
		count++;
		b++;                                    
		if (count % 9 == 0) {
			a++;
			b = 1;
			printf("\n");
		}
		printf("\n");
	}
	printf("  gugu[%2d][%2d] = %2d \n", 8, 0, gugu[8][0]);
	printf("  gugu[%2d][%2d] = %2d \n", 17, 0, gugu[17][0]);
	printf("  gugu[%2d][%2d] = %2d \n", 26, 0, gugu[26][0]);
	printf("  gugu[%2d][%2d] = %2d \n", 35, 0, gugu[35][0]);
	printf("  gugu[%2d][%2d] = %2d \n", 44, 0, gugu[44][0]);
	printf("  gugu[%2d][%2d] = %2d \n", 53, 0, gugu[53][0]);
	printf("  gugu[%2d][%2d] = %2d \n", 62, 0, gugu[62][0]);
	printf("  gugu[%2d][%2d] = %2d \n", 71, 0, gugu[71][0]);
	return 0;

}