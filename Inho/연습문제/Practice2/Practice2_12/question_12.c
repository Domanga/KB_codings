#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#define SIZE 10

int find_all_in_array(int* arr, int* index, int key) {
	int count = 0;

	for (int i = 0; i < SIZE; i++) {
		if (key == arr[i]) {
			index[count] = i;
			count++;
		}
	}

	return count;
}

int main() {
	int arr[10] = { 12, 45, 62, 12, 99, 83, 23, 12, 72, 37 };
	int index[10] = { 0 };
	int key;
	int count = 0;

	for (int i = 0; i < SIZE; i++) {
		printf("%3d", arr[i]);
	}

	printf("\n찾을 값? : ");
	scanf("%d", &key);

	count = find_all_in_array(arr, index, key);

	printf("찾은 항목은 모두 %d개입니다. \n", count);
	if (count != 0) {
		printf("찾은 항목의 인덱스 : ");
		for (int i = 0; i < count; i++) {
			printf("%3d", index[i]);
		}
	}
	else printf("찾은 항목이 존재하지 않습니다.\n");

	return 0;
}