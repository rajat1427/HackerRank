#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    int k; 
    scanf("%d %d",&n,&k);
    int *a = malloc(sizeof(int) * n);
    for(int a_i = 0; a_i < n; a_i++){
       scanf("%d",&a[a_i]);
    }
    
    k=k%n;
    for(int i=k;i<n;i++)
        printf("%d ",a[i]);
    
    for(int i=0;i<k;i++)
        printf("%d ",a[i]);
    
    return 0;
}

