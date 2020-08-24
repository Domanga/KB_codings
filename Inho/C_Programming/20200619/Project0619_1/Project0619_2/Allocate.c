#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {

	int arr_1[5];
	int size = 5;
	
	int* arr_2;
	int i;
	for (i = 0; i < 5; i++)
	{
		arr_1[i] = i + 1;
	}
	arr_2 = (int*)calloc(size, sizeof(int));
	//arr_2 = (int*)malloc(sizeof(int) * size);
	for (i = 0; i < 5; i++) {
		arr_2[i] = arr_1[i];	
	}
	realloc(arr_2, sizeof(int) * 10);
	for (i= 5; i < 10; i++)
	{
		arr_2[i] = i + 1;
	}

	for (i = 0; i < 10; i++)
	{
		printf("%3d", arr_2[i]);
	}
	

	free(arr_2);

	return 0;
}