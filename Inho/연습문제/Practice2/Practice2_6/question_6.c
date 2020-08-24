#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#define SIZE 10

void get_min_max(int *arr, int *min, int *max) {
	*min = arr[0];
	*max = arr[0];

	for (int i = 0; i < SIZE; i++) {
		if (arr[i] < *min) {
			*min = arr[i];
		}
		if (arr[i] > *max) {
			*max = arr[i];
		}
	}

}

int main() {
	int arr[SIZE] = { 23, 45, 62, 12, 99, 83, 23, 50, 72, 37 };
	int min = 0, max = 0;

	printf("배열 :");
	for (int i = 0; i < SIZE; i++) {
		printf("%3d", arr[i]);
	}
	printf("\n");

	get_min_max(arr, &min, &max);

	printf("최댓값 : %d\n", max);
	printf("최소값 : %d\n", min);

	return 0;
}