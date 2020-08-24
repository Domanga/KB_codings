#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#define SIZE 10
int swap_array(int* a, int* b) {
	int temp[SIZE];

	for (int i = 0; i < SIZE; i++) {
		temp[i] = a[i];
		a[i] = b[i];
		b[i] = temp[i];
	}

}

int main() {
	int a[SIZE] = { 1,3,5,7,9,11,13,15,17,19 };
	int b[SIZE] = { 0,2,4,6,8,10,12,14,16,18 };

	printf("a:");
	for (int i = 0; i < SIZE; i++) {
		printf("%4d", a[i]);
	}
	printf("\nb:");
	for (int i = 0; i < SIZE; i++) {
		printf("%4d", b[i]);
	}

	printf("\n\n<<  swqap_array È£Ãâ ÈÄ  >>\n\n");
	swap_array(a, b);

	printf("a:");
	for (int i = 0; i < SIZE; i++) {
		printf("%4d", a[i]);
	}
	printf("\nb:");
	for (int i = 0; i < SIZE; i++) {
		printf("%4d", b[i]);
	}

	return 0;
}