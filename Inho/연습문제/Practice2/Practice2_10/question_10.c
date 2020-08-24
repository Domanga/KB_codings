#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int add_matrix(int(* x)[3], int(* y)[3], int(* res)[3]) {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			res[i][j] = x[i][j] + y[i][j];
		}
	}

}

int main() {
	int x[3][3] = { 10, 20, 30,
			        40, 50, 60,
					70, 80, 90 };

	int y[3][3] = { 9, 8, 7,
					6, 5, 4,
					3, 2, 1 };

	int res[3][3] = { 0 };
	int(*px)[3] = &x[0];
	int(*py)[3] = &y[0];
	int(*p)[3] = &res[0];

	add_matrix(px, py, p);

	printf("\tx 행렬:\n");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			printf("\t%d", x[i][j]);
		}
		printf("\n\n");
	}

	printf("\n\ty 행렬:\n");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			printf("\t%d", y[i][j]);
		}
		printf("\n\n");
	}

	printf("\n\tx + y 행렬:\n");
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			printf("\t%d", res[i][j]);
		}
		printf("\n\n");
	}
	
	return 0;

}