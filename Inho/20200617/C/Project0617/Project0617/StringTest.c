#include <stdio.h>

int main() {
	char str1[10] = { 'a', 'b','c' };
	char str2[10] = "abc";
	char str3[] = "abc";
	char str4[17] = "Very long string";

	int size = sizeof(str1) / sizeof(str1[0]);

	printf("str1 = ");
	for (int i = 0; i < size; i++) {
		printf("%c", str1[i]);
	}
	printf("\n");

	printf("str2 = %s\n", str2);
	printf("str3 = ");
	printf(str3);
	printf("\n");

	printf("str4 = %s\n", str4);



	return 0;
}