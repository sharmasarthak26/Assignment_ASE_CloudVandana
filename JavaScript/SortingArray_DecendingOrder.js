function Sort(arr){
    for(let turn=1;turn<arr.length;turn++){
        for(let i=0;i<arr.length-turn;i++){
            if(arr[i]<arr[i+1]){
                let temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}

let arr=[1,4,2,8,5,3];

console.log("Sorted in Descending Order");
console.log(Sort(arr));