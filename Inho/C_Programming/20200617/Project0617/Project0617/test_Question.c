/*#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int get_gcm_lcm(int a, int b, int* gcm, int* lcm) {
	int i, j;
	i = a; j = b;


	while (j != 0) {
		int r = i % j;
		i = j;
		j = r;
		*gcm = i;
	}

	*lcm = a * b / *gcm;
}

int main() {
	int arr[5] = { 1,2,3,4,5 };
	int* p = NULL;
	p = arr;

	int a, b, gcm, lcm;
	int* x = &a;
	int* y = &b;
	int* w = &gcm;
	int* z = &lcm;

	for (int i = 0; i < 5; i++) {
		printf("%d  ", ++(*p));
		//p++;
	}
	printf("\n");

	printf("두 수를 입력하세요 : ");
	scanf("%d%d", &a, &b);

	get_gcm_lcm(a, b, w, z);

	printf("최대 공약수 = %d, 최대 공배수 = %d", gcm, lcm);

	return 0;
}*/