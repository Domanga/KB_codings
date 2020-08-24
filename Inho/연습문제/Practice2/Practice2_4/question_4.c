#include<stdio.h>
#define SIZE 10

int main() {
	double x[SIZE] = { 0.1, 2.0, 3.4, 5.2, 4.5, 7.8, 9.7, 1.4, 6.6, 7.2 };
	double* p = x;
	double sum = 0.0, avg = 0.0;

	printf("¹è¿­ : ");
	for (int i = 0; i < SIZE; i++ /*, p++*/) {
		printf("\t%.2lf", p[i]);
		//printf("\t%.2lf", *p);
		sum += p[i];
		//sum += *p;
	}
	printf("\n");
	avg = sum / SIZE; 
	printf("Æò±Õ : %lf", avg);

	return 0;
}