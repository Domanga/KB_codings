#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main() {
	char sentence[128] = "";
	char* p = sentence;

	printf("¹®ÀÚ¿­? : ");
	gets_s(sentence, sizeof(sentence));
	
	for (int i = 0; i < strlen(sentence); i++)
	{
		if (islower(sentence[i])) {
			sentence[i] = toupper(sentence[i]);
		}
		else if (isupper(sentence[i])) {
			sentence[i] = tolower(sentence[i]);
		}
	}

	puts(sentence);
	return 0;
}