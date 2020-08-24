#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#define SIZE 20

void fill_array(int* arr, int value) {
	for (int i = 0; i < SIZE; i++) {
		arr[i] = value;
	}

}

int main() {
	int arr[20] = { 0 };
	int value;

	printf("배열의 원소에 저장할 값? : ");
	scanf("%d", &value);

	fill_array(arr, value);

	printf("배열 : ");
	for (int i = 0; i < SIZE; i++) {
		printf("%2d", arr[i]);
	}

	return 0;
}