//Steven Pham
//
//

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(void)
{
	int x = 10;
	double y = 5.0;
	long z = 50;
	bool check = false;
	printf("The value of x is %d and its address is %p \n", x, &x);
	printf("The value of y is %lf and its address is %p \n", y, &y);
	printf("The value of z is %ld and its address is %p \n", z, &z);
	printf("The value of check is %b and its address is %p \n", check, &check);
	{
		int unused = 30;
	}
	//printf("The value of unused is %d", unused);
	int arr[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	int i;
	for (i = 0; i < 10; i++) printf("Address of arr[%i]: %p \n", arr[i], &arr[i]);
	return EXIT_SUCCESS;
}
