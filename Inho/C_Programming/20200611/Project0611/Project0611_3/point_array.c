#include<stdio.h>

int main() {

	int arr[3] = { 0,1,2 };
	printf("�迭�� �̸� : %p\n", arr);
	printf("�迭[0] : %p\n", &arr[0]);

	int* p = 0;
	p = &arr[0];

	printf("������ : %p\n", p);

	int arr1[3] = { 1,2,3 };
	double arr2[3] = { 1.1, 2.2, 3.3 };

	printf("%d %g \n", *arr1, *arr2);
	*arr1 += 100;
	*arr2 += 120.5;
	printf("%d %g \n", arr1[1], arr2[1]);

	return 0;
}