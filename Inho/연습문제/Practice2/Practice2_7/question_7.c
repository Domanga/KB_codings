#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#define SIZE 10

void reverse_array(double* arr) {
	double temp;

	for (int i = 0; i < SIZE / 2; i++) {
		temp = arr[i];
		arr[i] = arr[(SIZE - 1) - i];
		arr[(SIZE - 1) - i] = temp;
	}

}

int main() {
	double arr[SIZE] = { 1.2, 3.1, 4.3, 4.5, 6.7, 2.3, 8.7, 9.5, 2.3, 5.8 };
	double* p = arr;
	
	printf("배열 : ");
	for (int i = 0; i < SIZE; i++) {
		printf("%.1f ", arr[i]);
	}
	printf("\n");

	reverse_array(arr);
	
	printf("역순 : ");
	for (int i = 0; i < SIZE; i++) {
		printf("%.1f ", arr[i]);
	}

	return 0;
}

