#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

void fill_array(int(*arr)[5], int value) {
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 5; j++) {
			arr[i][j] = value;
		}
	}

}

int main() {
	int arr[4][5] = { 0 };
	int value;

	printf("�迭�� ���ҿ� ������ ��? : ");
	scanf("%d", &value);

	fill_array(arr, value);

	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 5; j++) {
			printf("%2d", arr[i][j]);
		}
		printf("\n");
	}

	return 0;
}