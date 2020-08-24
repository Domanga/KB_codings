#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	char in_str[128];
	char out_str[128];
	int hour = 12, min = 30, sec = 45;

	printf("¹®ÀÚ¿­? ");
	gets_s(in_str, sizeof(in_str));
	puts(in_str);
	sprintf(out_str, "%02d:%02d:%02d", hour, min, sec);
	puts(out_str);

	return 0;
}