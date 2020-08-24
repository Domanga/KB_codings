#include<stdio.h>

int main() {
	double x[3] = { 0, 1, 2 };
	double* p = x;

	for (int i = 0; i < 3; i++ /*, p++ */) {
		printf("x[%d]狼 林家 : %p\n", i, x + i);
		//printf("x[%d]狼 林家 : %p\n", i, p);
	}
	
	return 0;
}