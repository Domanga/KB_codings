#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#define SIZE 10

int arith_seq(int *arr, int first, int com_dif) {
	arr[0] = first;

	for (int i = 1; i < SIZE; i++) {
		arr[i] = first + (com_dif * i);
	}

}

int main() {
	int arr[SIZE];
	int* p = arr;
	int first, com_dif;

	printf("ù ��° ��? : ");
	scanf("%d", &first);

	printf("����? : ");
	scanf("%d", &com_dif);

	arith_seq(p, first, com_dif);
	
	printf("�������� : ");
	for (int i = 0; i < SIZE; i++, p++) {
		printf("%4d", *p);
	}

	return 0;
}