#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
long long int merge(int a[],int l,int m,int r ){   
	 
	 int n1=m-l+1;
	 int n2=r-m;
	
	int i,j,k;
	
	int L[n1],R[n2];
	
	for(i=0;i<n1;i++){
		L[i]=a[l+i];
	}
	
	for(j=0;j<n2;j++){
		R[j]=a[m+1+j];
	}
	
	i=0;
	j=0;
	k=l;
	long long int count=0;
	while(i<n1 && j<n2){
		if(L[i]<=R[j]){
			a[k]=L[i];
			i++;
			k++;
	    }
		else{
		  a[k]=R[j];
		  j++;
		  k++;
		  count=count+(n1-i);
		}	
	}
	while(i<n1){
		a[k]=L[i];
		i++;
		k++;
	}
    while(j<n2){
		a[k]=R[j];
		j++;
		k++;
	}
	return count;
}

long long int mergesort(int a[],int low,int high){
    long long int icount=0;
	if(low<high){
	 int mid=low+(high-low)/2;
	icount+=mergesort(a,low,mid);
	icount+=mergesort(a,mid+1,high);
	icount+=merge(a,low,mid,high);
   }
   return icount;
}
int main(){
    int t; 
    scanf("%d",&t);
    while(t--)
    {
        int n;
        long long int count=0;
        scanf("%d",&n);
        int *arr = malloc(sizeof(int) * n);
        for(int arr_i = 0; arr_i < n; arr_i++){
           scanf("%d",&arr[arr_i]);
          }
        count=mergesort(arr,0,n-1);
          printf("%lld\n",count);    
    }
    return 0;
}

